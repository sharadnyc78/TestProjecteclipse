package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestClassA {
	
	ExtentHtmlReporter reporter;
	
	ExtentReports extent;
	
	ExtentTest logger;
	
	
	@Test
	public void TestA1() {
		
		try {
		
		
		
		reporter = new ExtentHtmlReporter("./Reports/TestClassA.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
	
		logger = extent.createTest("testa1");
		
		logger.log(Status.INFO, "Test strted"); // this will be in report
		
		
		
	
		Assert.assertTrue(false); // this is assertion , if fail then will go directly to catch block and will not print rest of the lines
		
		System.out.println("Test A1 executing"); 
		
		logger.log(Status.PASS, "Passed");
		
		
		
		
		
	// catch here	
		}catch(Error e) {
			
			logger.log(Status.FAIL, "Failed Test A1 as Assert has failed -- message typed");
		}
		
		
		
		
		
	// lastly use flush	
		
		extent.flush();
		
		
	}
	
	@Test
	public void TestA2() {
		
		ExtentTest logger2 =extent.createTest("TestA2");

		logger2.log(Status.INFO, "Test strted");
		
		logger2.log(Status.PASS, "Passed");
		
		extent.flush();
		
		System.out.println("test A2 executing");
	}
	
	

}
