package alia.tests.basic;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import alia.tests.TestHelpers;

public class ConstantTest extends TestHelpers {
    
    @Test
    public void constantTest() {
    	System.out.println(run("examples/basic/constant",""));
    	equalLines("5\n6\na\ntrue\nfalse\n",
    			run("examples/basic/constant","")
    			);
    }


}
