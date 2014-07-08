package alia.tests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IfTest extends TestHelpers{
	// Tests the if functionality of the Alia programming language.
	
		@Test
		 public void ifBasicTest() {
			equalLines("4",
	    			run("examples/if/basic","")
	    			);
		}
		@Test
		 public void ifTypeEmptyVoidTest() {
			String result = run("examples/if/typeerror1","");
			assertThat(result, containsString("Type is void"));
		}
		
		@Test
		 public void ifTypeVoidNoElseTest() {
			String result = run("examples/if/typeerror2","");
			assertThat(result, containsString("Type is void"));
		}

		@Test
		 public void ifScopeErrorTest() {
			String result = run("examples/if/scopeerror","");
			assertThat(result, containsString("has not yet been declared"));
		}
		
		@Test
		 public void ifScopeCondErrorTest() {
			String result = run("examples/if/scopeconderror","");
			assertThat(result, containsString("has not yet been declared"));
		}

		@Test
		 public void ifDoubleElseTest() {
			String result = run("examples/if/doubleelse","");
			assertThat(result, containsString("expecting END"));
		}
		
}
