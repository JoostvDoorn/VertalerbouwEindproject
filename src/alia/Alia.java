package alia;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.EnumSet;
import java.util.Set;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import jasmin.Main;


/**
 * Program that creates and starts the Alia lexer, parser, checker, code generator and converts the generated code into a java class with jasmin.
 * @author  Joost van Doorn
 * @version 2014.07.08
 */
public class Alia {
    private static final Set<Option> options = EnumSet.noneOf(Option.class);
    private static String inputFile;
    private static String outputFile;
    private static int count = 0;

    public static void parseOptions(String[] args) {
    	options.clear();
    	inputFile = "";
    	outputFile = "Test";
    	boolean outputFileNext = false;
    	
        if (args.length == 0) {
            System.err.println(USAGE_MESSAGE);
            System.exit(1);
        }
        for (int i=0; i<args.length; i++) {
            try {
                Option option = getOption(args[i]);
                if (option == null) {
                    if(outputFileNext) {
                        outputFile = args[i];
                    } else if (i < args.length - 1) {
                        System.err.println("Input file name '%s' should be last argument");
                        System.exit(1);
                    } else {
                        inputFile = args[i];
                    }
                    outputFileNext = false;
                } else if(option.equals(Option.O)) {
                	outputFileNext = true;
                } else {
                    options.add(option);
                    outputFileNext = false;
                }
            } catch (IllegalArgumentException exc) {
                System.err.println(exc.getMessage());
                System.err.println(USAGE_MESSAGE);
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
    	runCompiler(args);
    }

    public static void runCompiler(String[] args) {

        parseOptions(args);
        
        try {
            InputStream in = inputFile == null ? System.in : new FileInputStream(inputFile);
            AliaLexer lexer = new AliaLexer(new ANTLRInputStream(in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            AliaParser parser = new AliaParser(tokens);

            AliaParser.program_return result = parser.program();
            CommonTree tree = (CommonTree) result.getTree();

            if (!options.contains(Option.NO_CHECKER)) {      // check the AST
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                AliaChecker checker = new AliaChecker(nodes);
                AliaChecker.program_return resultChecker = checker.program();
                tree = (CommonTree) resultChecker.getTree();
            }

//            if (!options.contains(Option.NO_INTERPRETER) &&
//                    !options.contains(Option.CODE_GENERATOR)) {  // interpret the AST
//                TreeNodeStream nodes = new BufferedTreeNodeStream(tree);
//                DecluseInterpreter interpreter = new DecluseInterpreter(nodes);
//                interpreter.program();
//            }

            if (!options.contains(Option.NO_CODE_GENERATOR)) {
                // generate TAM assembler code using string template
                // 1. Read template file
                FileReader groupFileR = new FileReader("src/alia/jbc.stg");
                StringTemplateGroup templates 
                    = new StringTemplateGroup(groupFileR);
                groupFileR.close();
                // 2. Walk the AST.
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                AliaCodeGeneratorStringTemplate codegenerator 
                    = new AliaCodeGeneratorStringTemplate(nodes);
                codegenerator.setTemplateLib(templates);
                codegenerator.setProgramClass(outputFile);
                AliaCodeGeneratorStringTemplate.program_return r 
                    = codegenerator.program();
                // 3. Get the stringtemplate output and print it.
                StringTemplate output = (StringTemplate) r.getTemplate();
                System.out.println(output.toString());
                
                // Write to file
                PrintWriter writer = new PrintWriter("bin/"+outputFile+"compiled.j", "UTF-8");
                writer.println(output.toString());
                writer.close();
                
                // Run Jasmin
                String[] arguments = new String[] {"bin/"+outputFile+"compiled.j","-d","bin"};
                Main.main(arguments);

            }
            if (options.contains(Option.RUN)) {
                // Run the file by loading the class file dynamicly
                try {
	                URL classUrl = new URL(new URL("file:"), "bin/");
	                URLClassLoader sysLoader = new URLClassLoader(new URL[]{classUrl});
	                sysLoader.getURLs();
	                Class<?> runClass = sysLoader.loadClass(outputFile);
		            Class<?> getArg[] = { (new String[1]).getClass() };
		            Method m = runClass.getMethod("main", getArg);
	                String[] my = { "" };
	                Object myarg[] = { my };
	                m.invoke(null, myarg);
	                m = null;
	                sysLoader = null;
                }
                catch(InvocationTargetException ex) {
                	System.out.println(count);
                	System.err.println("Could not run compiled file!");
                	System.err.println(ex.getCause().getMessage());
                	ex.getCause().printStackTrace();
                }
            }

            if (options.contains(Option.AST)) {          // print the AST as string
                System.out.println(tree.toStringTree());
            }

            if (options.contains(Option.DOT)) {   // print the AST as DOT specification
                DOTTreeGenerator gen = new DOTTreeGenerator();
                StringTemplate st = gen.toDOT(tree);
                System.out.println(st);
            }

        }
        catch (RecognitionException e) {
        } catch (Exception e) {
            System.err.print("ERROR: uncaught exception thrown by compiler: ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
		
	}

	private static Option getOption(String text) throws IllegalArgumentException {
        if (!text.startsWith(OPTION_PREFIX)) {
            return null;
        }
        String stripped = text.substring(OPTION_PREFIX.length());
        for (Option option: Option.values()) {
            if (option.getText().equals(stripped)) {
                return option;
            }
        }
        throw new IllegalArgumentException(String.format("Illegal option value '%s'", text));
    }

    private static final String USAGE_MESSAGE;

    static {
        StringBuilder message = new StringBuilder("Usage:");
        for (Option option: Option.values()) {
            message.append(" [");
            message.append(option.getText());
            message.append("]");
        }
        message.append(" [filename]");
        USAGE_MESSAGE = message.toString();
    }

    private static enum Option {
        DOT,
        AST,
        NO_CHECKER,
        NO_INTERPRETER,
        NO_CODE_GENERATOR,
        RUN,
        O;

        private Option() {
            this.text = name().toLowerCase();
        }

        /** Returns the option text of this option. */
        public String getText() {
            return this.text;
        }

        private final String text;
    }

    private static final String OPTION_PREFIX = "-";
}
