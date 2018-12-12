package DD2;

import org.testng.annotations.Test;

import DD1.DummyTestBase1;
import junit.framework.Assert;

public class DummyTestA extends DummyTestBase1{
	
	@Test(priority=1)
	
	public void DTestA1() {
		
		System.out.println("inside DTestA1");
		
		Assert.fail();
	}
	
@Test(priority=2,dependsOnMethods= {"DTestA1"})
	
	public void DTestA2() {
		
		System.out.println("inside DTestA2");
	}

}
