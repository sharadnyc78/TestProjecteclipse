package DD2;

import java.io.IOException;

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
	
	
ExtentHtmlReporter reporter;
ExtentReports extent;
ExtentTest logger ;
	

	@BeforeSuite
	
	public void extentrep() {
		

		reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Reports\\DummyTest.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		//logger.log(Status.INFO, "@beforesuite set up");
		
	}
	
		
	
	
	
	
	
	
	
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
		
		click("investor_xpath");
	
		type("search_xpath", "Careers");
		
		
		extent.flush();  // flush report 1
		
}
		
		
@Test(priority=2)
		
		public void DTestB2() {
	
	ExtentTest logger = extent.createTest("DTestB2"); // create test2 
	
	logger.log(Status.INFO, "in test BTestB2");
	
	extent.flush();  // flush report 2
	
	}
	
}
