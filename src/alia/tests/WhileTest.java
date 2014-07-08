package alia.tests;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class WhileTest extends TestHelpers {
	// Tests the while functionality of the Alia programming language.
	
	@Test
	 public void whileBasicTest() {
		equalLines("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n",
    			run("examples/while/basic","")
    			);
	}
	
	@Test
	 public void whileCountTest() {
		equalLines("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
   			run("examples/while/count","")
   			);
	}
	
	@Test
	 public void whileCountTypeErrorTest() {
		String result = run("examples/while/counterr1","");
		assertThat(result, containsString("expression is not a boolean."));
	}
	@Test
	 public void whileCountOneLineTest() {
		equalLines("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
  			run("examples/while/countoneline","")
  			);
	}
	@Test
	 public void whileCountTypeTest() {
		equalLines("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
  			run("examples/while/counttype","")
  			);
	}
	@Test
	 public void whileCountUntilTest() {
		equalLines("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
  			run("examples/while/countuntil","10")
  			);
	}
	@Test
	 public void whileScopeErrorTest() {
		String result = run("examples/while/scopeerror","");
		assertThat(result, containsString("has not yet been declared"));
	}
}
