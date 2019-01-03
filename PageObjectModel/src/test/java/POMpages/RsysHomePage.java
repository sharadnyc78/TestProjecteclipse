package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//https://www.youtube.com/watch?v=P9ZWOWm7i0k

// 1 page layer- object repository

// 2 test layer
//  3 test base

public class RsysHomePage {
	
	WebDriver driver;
	
	By Search =By.xpath("//input[@id='txtSearch']");
	
	By ClickSearchButton= By.xpath("//input[@id='ImageButton1']");
	
	
	public RsysHomePage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void typeSearch() {
		
		driver.findElement(Search).sendKeys("careers");
	}

}
