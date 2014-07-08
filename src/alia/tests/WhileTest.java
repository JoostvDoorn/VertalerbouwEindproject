package alia.tests;
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
	 public void whileCountErr1Test() {
		equalLines("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n",
  			run("examples/while/counterr1","")
  			);
	}
	@Test
	 public void whileCountonelineTest() {
		equalLines("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
  			run("examples/while/countoneline","")
  			);
	}
	@Test
	 public void whileCounttypeTest() {
		equalLines("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n",
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
		equalLines("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n",
  			run("examples/while/scopeerror","")
  			);
	}
}
