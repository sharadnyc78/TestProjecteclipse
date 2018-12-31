package demo;
import org.testng.annotations.Test;
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

public class openRsys {
	
	WebDriver driver;
	
	@Test
	public void testhell() throws IOException {
		System.out.println("hello r sys");
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		
        driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rsystems.com/");
		
		String title = driver.getCurrentUrl();
		
		System.out.println("TITLE is " + title);
		
       TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
	   
	    FileHandler.copy(src, new File("./Screenshots/"+ "hello" + ".png"));
		
		
		
	}

}
