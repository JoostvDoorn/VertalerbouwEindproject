### Running from source

Compiling: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/Alia.java```  
Running the Alia compiler: ```java -classpath "lib/*;bin/" alia.Alia```  
Compiling tests: ```javac -classpath "lib/*" -d bin/ -sourcepath src/ src/alia/tests/TestAll.java```  
Running tests: ```java -classpath "lib/*;bin/" org.junit.runner.JUnitCore alia.tests.TestAll```
