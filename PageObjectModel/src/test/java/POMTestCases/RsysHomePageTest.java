package POMTestCases;
import org.testng.annotations.Test;

import POMpages.RsysHomePage;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class RsysHomePageTest {
	
	// lesson 1 : added selenium and test ng to pom
	// utube:https://www.youtube.com/watch?v=w_iPCT1ETO4
	//https://www.youtube.com/watch?v=P9ZWOWm7i0k
	//https://www.youtube.com/watch?v=P9ZWOWm7i0k
	
	
//   *************************************************	
	//https://www.youtube.com/watch?v=P9ZWOWm7i0k  -- naveen 
	// 1 page layer- object repository
	// 2 test layer
	//  3 test base
	
	
	
	WebDriver driver;
	
	@Test
	public void testhell() throws IOException {
		System.out.println("hello r sys");
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		
        driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rsystems.com/");
		
		RsysHomePage Home=new RsysHomePage(driver);
		
		Home.typeSearch();
		
		
		
		
		
		
		
}
}
