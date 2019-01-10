package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class AmazonHome extends TestBase {
	
	//OR - object repo
	
	@FindBy(xpath= "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	
	
	// initialise in constructor
	
	public AmazonHome() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	
	
	
	// Actions
	
	public void sendKeystosearchbox() {
		
		searchbox.sendKeys("ipod");
	}
	
	
	
	

}
