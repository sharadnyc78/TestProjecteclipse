package TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class RsystemsScreenshot {
	
	
	@Test
	
	public void takeScreenshot() throws IOException  {
		
	
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rsystems.com/");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Takes Screenshot is an interface -- cannot create object
		
		// so typecast this
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
       
	    FileHandler.copy(src, new File("./Screenshots/rsys.png"));
		
		//FileUtils.copyFile(src,new File("./Screenshots/rsys.png"));
		 
		
		driver.quit();
		
		
		
	}

}
