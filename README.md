### The Alia compiler


options:  
**-o [outputfile]** States the output class name.  
**-run** Runs the program after compilation.  
**-ast** Prints an ast.  
**-dot** Prints a dot representation of the ast.  
**-no_checker** Used to skip the checker.  
**-code_generator** Generates code.   
**[filename]** The last argument should be the filename

### Compiling and running from source

Compiling: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/Alia.java```  
Running the Alia compiler: ```java -classpath "lib/*;bin/" alia.Alia```  
Compiling tests: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/tests/TestAll.java```  
Running tests: ```java -classpath "lib/*;bin/" org.junit.runner.JUnitCore alia.tests.TestAll```
