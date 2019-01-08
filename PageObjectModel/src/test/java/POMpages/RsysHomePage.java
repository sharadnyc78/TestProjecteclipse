package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//https://www.youtube.com/watch?v=P9ZWOWm7i0k

// 1 page layer- object repository

// 2 test layer
//  3 test base

public class RsysHomePage {
	
	      WebDriver driver;
	
           public RsysHomePage(WebDriver ldriver) {  // this is contructor of the class
		
		   this.driver=ldriver;
		
	}
           
           
	@FindBy(how=How.XPATH,using="//input[@id='txtSearch']")
	WebElement search;
	
	
	By Search =By.xpath("//input[@id='txtSearch']");
	
	By ClickSearchButton= By.xpath("//input[@id='ImageButton1']");
	
	
	
	
	public void typeSearch() {
		
		driver.findElement(Search).sendKeys("careers");
		
		search.sendKeys("hello");
	}
	
	

}
