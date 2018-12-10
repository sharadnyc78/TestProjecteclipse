package SeleniumTC;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Library.TestBase;
import Library.Utility;

public class RsystemsScreenshot2 extends TestBase {
	
	
	@Test
	
	public void takeScreenshotRsystem1() throws IOException  {
		
	
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rsystems.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//driver.findElement(By.xpath(".//*[@id='txtSearch']")).sendKeys("hello");
		
		
		
		
		//TestBase.ca( "rsystems home page ");  // used Utility class here from Library package
		
		
		
		
		
	}

}
