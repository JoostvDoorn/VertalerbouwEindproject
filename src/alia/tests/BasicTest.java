package alia.tests;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;


public class BasicTest extends TestHelpers {
    @Test
    public void providedBasicTest() {
    	equalLines("30\n-100\nfalse\ntrue\n998\ntrue\ntrue\na\nfalse\n1000\ntrue\nb\n",
    			run("examples/basic/provided","30\n-100\n998\ntrue\nz\n")
    			);
    	

    }
    @Test
    public void constantTest() {
    	equalLines("",
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
    
    

    @Test
    public void syntaxError() {
    	String result = run("examples/basic/incorrect/basic","");
    	assertThat(result, containsString("no viable alternative at input 'gebin'"));
    	assertThat(result, containsString("no viable alternative at input 'ned'"));
    	assertThat(result, containsString("no viable alternative at input 'repeat'"));
    	assertThat(result, containsString("Not yet declared"));
    }

    @Test
    public void redefineConstant() {
    	String result = run("examples/basic/incorrect/constant","");
    	assertThat(result, containsString("Attempting to redefine constant."));
    }
    
    @Test
    public void intSize() {
    	String result = run("examples/basic/incorrect/intsize","");
    	assertThat(result, containsString("Illegal integer exception"));
    	assertThat(result, containsString(Integer.MAX_VALUE+""));
    	assertThat(result, containsString(Integer.MIN_VALUE+""));
    }
    
    @Test
    public void typeError() {
    	String result = run("examples/basic/incorrect/type","");
    	assertThat(result, containsString("Type char is not equal to int."));
    }
    
}
