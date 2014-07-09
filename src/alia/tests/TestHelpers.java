package alia.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import alia.Alia;

public class TestHelpers {
	private static int run = 0;
	public String run(String filePath, String input) {
		run++;
		String callerClassName = new Exception().getStackTrace()[1].getMethodName();
		
	    // Save System.out
	    PrintStream oldOut = System.out;
	    PrintStream oldErr = System.err;
	    InputStream oldIn = System.in;

	    System.setOut(new PrintStream(new ByteArrayOutputStream()));
	    System.setErr(new PrintStream(new ByteArrayOutputStream()));
		String[] args = { "-ast", "-code_generator", "-o",callerClassName, filePath };
		Alia.runCompiler(args);
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // Tell Java to use our stream
	    System.setOut(ps);
	    System.setErr(ps);
	    
	    // Run file
		String[] argsRun = { "-run", "-o",callerClassName, filePath };
		Alia.runCompiler(argsRun);

	    // Put old System.out back
	    System.out.flush();
	    System.err.flush();
	    System.setOut(oldOut);
	    System.setErr(oldErr);
	    // Put old System.in back
	    System.setIn(oldIn);
	    // Return what happened
	    String result = baos.toString();
	    // Save to log file this part is only for generating files for the report
	    PrintWriter writer;
		try {
			writer = new PrintWriter("bin/"+callerClassName+"code", "UTF-8");
		    writer.println(new Scanner(new File(filePath)).useDelimiter("\\Z").next());
		    writer.close();
			writer = new PrintWriter("bin/"+callerClassName+"log", "UTF-8");
		    writer.println(result);
		    writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}
	protected void equalLines(String expected, String actual) {
		org.junit.Assert.assertArrayEquals(expected.split("[\r\n]+"),
											actual.split("[\r\n]+"));
	}
}
