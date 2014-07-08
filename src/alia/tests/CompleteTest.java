package alia.tests;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class CompleteTest extends TestHelpers {
    @Test
    public void providedCompleteTest() {
    	equalLines("30\n-100\nfalse\ntrue\n998\ntrue\ntrue\na\nfalse\n1000\ntrue\nb\n0\n1\n1\n1\n2\n2\n2\n3\n3\n3\n4\n4\n4\n",
    			run("examples/complete/complete","30\n-100\n998\ntrue\nz\n")
    			);
    }
}