package DD2;

import org.testng.annotations.Test;

import DD1.DummyTestBase1;
import junit.framework.Assert;

public class DummyTestA extends DummyTestBase1{ // class opens
	
	@Test(priority=1)
	
	public void DTestA1() {  // test opens
		
		System.out.println("inside DTestA1");
		
		Assert.fail();
	                      }// test closes
	
@Test(priority=2,dependsOnMethods= {"DTestA1"})
	
	public void DTestA2() { // test 2 opens
		
		System.out.println("inside DTestA2");
	                         } // test 2 closes

                                          
                                                   } // class closes
