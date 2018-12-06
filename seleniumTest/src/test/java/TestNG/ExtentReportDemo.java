package TestNG;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	

	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;
	
	@Test
	public void Test1() {
		
		try {
		
		reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\Reports\\ExtentReportDemo.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
		
		
	    logger = extent.createTest("Test 1");
		
		logger.log(Status.INFO, "Test started - 1");
		
		logger.log(Status.PASS, "Passed -1");
		
		} catch (Error e ) {
			
			logger.log(Status.INFO, "some error");
			
			
		}
		
		extent.flush();
		
		
		System.out.println("test 1 ");
	}
	
	@Test
	public void Test2() throws IOException {
		
		
		
		
		
		ExtentTest logger2 = extent.createTest("Test 2");
		
		logger2.log(Status.INFO, "Test started -- 2");
		
		logger2.log(Status.PASS, "Passed - 2");
		
		
		// screenshots
		
	    //logger2.addScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\2.jpeg")	;
		
        logger2.fail("test failure -- message here", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\2.jpeg").build());

        logger2.pass("test pass -- message here", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\2.jpeg").build());


		extent.flush();

}
}
