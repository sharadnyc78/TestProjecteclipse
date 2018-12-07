package TestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Library.Utility;

public class CaptureScreenshotOnFail {
	
	WebDriver driver;
	
	String screenshotname;

	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;
	

	
    @Test
	
	public void takeScreenshotWhenFail() throws IOException, InterruptedException  {
    	
      reporter = new ExtentHtmlReporter("./Reports/Capture on Fail.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
		
		
	    logger = extent.createTest("Test 1");
		
		logger.log(Status.INFO, "Test started - 1");
		
		logger.log(Status.PASS, "Passed -1");
		
		
	
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rsystems.com/");
		
	
			Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(".//*[@id='ttttttttttttttttxtSearch']")).sendKeys("hello");
		
		
		
		// Takes Screenshot is an interface -- cannot create object
		
		// so typecast this
                                   
    }
		
		@AfterMethod
		
		public void tearDown1(ITestResult result) throws IOException, InterruptedException {
			
			if(ITestResult.FAILURE==result.getStatus()) {
				
				Utility.capturescreenshot(driver, result.getName());
			}
			
			Thread.sleep(10000);
			
			logger.fail("test failure -- message here", MediaEntityBuilder.createScreenCaptureFromPath("./Screenshots/"+result.getName()+ ".png").build());

			

			extent.flush();
			driver.quit();
			
		}
		
		
		
	

}
