package alia.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import alia.Alia;

public class TestHelpers {
	public String run(String filePath, String input) {
	    // Save System.out
	    PrintStream oldOut = System.out;
	    InputStream oldIn = System.in;

	    System.setOut(new PrintStream(new ByteArrayOutputStream()));
		String[] args = { "-ast", "-code_generator", filePath };
		Alia.runCompiler(args);
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    
	    // Run file
		String[] argsRun = { "-run", filePath };
		Alia.runCompiler(argsRun);

	    // Put old System.out back
	    System.out.flush();
	    System.setOut(oldOut);
	    // Put old System.in back
	    System.setIn(oldIn);
	    // Show what happened
	    String result = baos.toString();
		return result;
	}
}
