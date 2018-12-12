package DD2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DD1.DummyTestBase1;
import DD1.util;
import junit.framework.Assert;

public class DummyTestB extends DummyTestBase1 {
	
	
	
	
@Test(priority=1)
	
	public void DTestB1() throws IOException {
	
	

	
	
	logger =extent.createTest("DtestB1");
	

//
		openBrowser("Chrome");
		
		logger.log(Status.INFO, "open browser " + "chrome");
		
		takeScreenshot("Open Browser"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.pass("test pass -- Open Browser pass", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Open Browser" +".png").build());
//test 
		
		navigate("appurl");
		
		logger.log(Status.INFO, "Navigation to  " + "appurl");
		
		takeScreenshot("Navigation"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.pass("test pass -- Navigation", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Navigation" +".png").build());
//test 
		
		
		
			
			try {
				click("investor_xpath");
				
				waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("investor_xpath"))); // waits implemented
				
				logger.log(Status.INFO, "Investor clicked  ");
				
				takeScreenshot("investorlink"); // CAPTURE SCREENSHOT ON PASS
				
			     logger.pass("test pass -- Navigation", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"investorlink" +".png").build());
		//test 
			}catch(Exception e) {
				
				logger.log(Status.FAIL, "Failure of Investor xpath" + e);
			}
	
	
		type("search_xpath", "Careers");
		
		
		extent.flush();  // flush report 1
		
}
		
		
@Test(priority=2)
		
		public void DTestB2() {
	
	ExtentTest logger = extent.createTest("DTestB2"); // create test2 
	
	logger.log(Status.INFO, "in test BTestB2");
	
	extent.flush();  // flush report 2
	//
	
	}
	
}
