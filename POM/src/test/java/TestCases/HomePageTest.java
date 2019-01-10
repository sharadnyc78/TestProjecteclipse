package TestCases;

import org.testng.annotations.Test;

import Pages.AmazonHome;
import TestBase.TestBase;

public class HomePageTest extends TestBase{
	
	
	
	@Test
	public void setup2() {
		
		
		
    setup();
	
	AmazonHome home = new AmazonHome();
	
	home.sendKeystosearchbox();
	
	
	

           }
	
}
