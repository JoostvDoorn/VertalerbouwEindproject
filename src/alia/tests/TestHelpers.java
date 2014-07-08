package alia.tests;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import alia.Alia;

public class TestHelpers {
	private static int run = 0;
	public String run(String filePath, String input) {
		run++;
	    // Save System.out
	    PrintStream oldOut = System.out;
	    InputStream oldIn = System.in;

	    System.setOut(new PrintStream(new ByteArrayOutputStream()));
		String[] args = { "-ast", "-code_generator", "-o","run"+run, filePath };
		Alia.runCompiler(args);
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream ps = new PrintStream(baos);
	    // Tell Java to use your special stream
	    System.setOut(ps);
	    
	    // Run file
		String[] argsRun = { "-run", "-o","run"+run, filePath };
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
	protected void equalLines(String expected, String actual) {
		org.junit.Assert.assertArrayEquals(expected.split("[\r\n]+"),
											actual.split("[\r\n]+"));
	}
}
