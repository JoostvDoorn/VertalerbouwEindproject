package alia.tests.basic;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import alia.tests.TestHelpers;

public class BasicTest extends TestHelpers {
    @Test
    public void providedBasicTest() {
    	equalLines("30\n-100\nfalse\ntrue\n998\ntrue\ntrue\na\nfalse\n1000\ntrue\nb\n",
    			run("examples/basic/provided","30\n-100\n998\ntrue\nz\n")
    			);
    	

    }
    @Test
    public void constantTest() {
    	equalLines("5\n6\na\ntrue\nfalse\n",
    			run("examples/basic/constant","")
    			);
    }
    @Test
    public void plusTest() {
    	equalLines("15\n",
    			run("examples/basic/plus","")
    			);
    }
    @Test
    public void printTest() {
    	equalLines("5\n5\n1\nc\ntrue\n",
    			run("examples/basic/print","")
    			);
    }
    @Test
    public void readTest() {
    	equalLines("t\n100000000\n105905\ntrue\nfalse\n",
    			run("examples/basic/read","t\n100000000\n105905\ntrue\nfalse\n")
    			);
    }
}
