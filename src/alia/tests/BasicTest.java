package alia.tests;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class BasicTest extends TestHelpers {
    @Test
    public void providedBasicTest() {
    	equalLines("30\n-100\nfalse\ntrue\n998\ntrue\nfalse\na\nfalse\n1000\nfalse\nb\n",
    			run("examples/basic/provided","30\n-100\n998\ntrue\nz\n")
    			);
    	

    }
    @Test
    public void providedBasicTest2() {
    	equalLines("30\n-100\nfalse\ntrue\n998\ntrue\nfalse\na\nfalse\n1000\nfalse\nb\n",
    			run("examples/basic/provided","30\n-100\n998\ntrue\nz\n")
    			);
    	

    }
    
    @Test
    public void constantTest() {
    	System.out.println(run("examples/basic/constant",""));
    	equalLines("5\n6\na\ntrue\nfalse\n",
    			run("examples/basic/constant","")
    			);
    }

	private void equalLines(String expected, String actual) {
		org.junit.Assert.assertArrayEquals(expected.split("[\r\n]+"),
											actual.split("[\r\n]+"));
	}

}
