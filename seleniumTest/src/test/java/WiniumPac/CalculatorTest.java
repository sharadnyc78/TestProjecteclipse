package WiniumPac;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CalculatorTest {
	

	ExtentHtmlReporter reporter;
	
	ExtentReports extent;
	
	ExtentTest logger;
	
	
	// run winium server ----  IMP
	
	@Test
	
	public void AddTest() throws InterruptedException, IOException {
		
		try {
			

			reporter = new ExtentHtmlReporter("./Reports/Calculator.html"); // give the path for report geneartion
			
			extent = new ExtentReports();
			
			extent.attachReporter(reporter);
			
		
		
        DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		
		WiniumDriver wd = new WiniumDriver (new URL("http://localhost:9999"), option);
		
		Thread.sleep(5000);
		

		logger = extent.createTest("CALCULATOR STARTED");
		
		logger.log(Status.INFO, "Test started-- APP open"); // this will be in report
	
		
		
		
		wd.findElement(By.id("num7Button")).click();
		
		

		wd.findElement(By.id("plusButton")).click();

		wd.findElement(By.id("num8Button")).click();
		
		wd.findElement(By.id("equalButton")).click();
		

		String Results = wd.findElement(By.id("CalculatorResults")).getAttribute("Name");
		
		
		
		System.out.println(Results);
		
		} catch (Error e) {
			
			logger.log(Status.FAIL, "Failed calculator Test as Assert has failed -- message typed");
		}
		
		// screenshots
		
	    logger.addScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\2.jpeg")	;
		
        logger.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\2.jpeg").build());

		
		
		
		extent.flush();
		
		
	}
}
	
		
		
		
		
			


	


