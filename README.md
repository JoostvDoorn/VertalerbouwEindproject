### The Alia compiler
The Alia compiler can be run using:

```java -jar Alia.jar [options]```

options:  
**-o [outputfile]** States the output class name.  
**-run** Runs the program after compilation.  
**-ast** Prints an ast.  
**-dot** Prints a dot representation of the ast.  
**-no_checker** Used to skip the checker.  
**-no_code_generator** Do not generates code.   
**[filename]** The last argument should be the filename

### Example files
Example files are located in the examples directory. To run a basic test file run:

```java -jar Alia.jar -ast -run examples/basic/plus```

A more extensive example is available here:

```java -jar Alia.jar -ast -run examples/complete/complete```

A specific output class can be defined with ```-o```, compiled files can be found in the bin directory:

```
java -jar Alia.jar -ast -o Complete examples/complete/complete
java -cp bin Complete
```

### Compiling and running from source

Compiling: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/Alia.java```  
Running the Alia compiler: ```java -classpath "lib/*;bin/" alia.Alia```  
Compiling tests: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/tests/TestAll.java```  
Running tests: ```java -classpath "lib/*;bin/" org.junit.runner.JUnitCore alia.tests.TestAll```
