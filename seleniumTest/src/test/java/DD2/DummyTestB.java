package DD2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
	
	
	
	
@Test(priority=1,dataProvider="ddd")
	
	public void DTestB1(String search_data) throws IOException {
	
	System.out.println("inside DTestB1");
	
	try {
	
	

	
	
	logger =extent.createTest("DtestB1");
	

//test
		openBrowser("Chrome");
		
		logger.log(Status.INFO, "open browser " + "chrome");
		
		Thread.sleep(5000);
		
		takeScreenshot("Open Browser"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.info("test -- Open Browser ", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Open Browser" +".png").build());
//test 
		
		navigate("appurl");
		
		logger.log(Status.INFO, "Navigation to  " + "appurl");
		
		takeScreenshot("Navigation"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.info("test -- Navigation to appurl", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Navigation" +".png").build());
//test 
		
		
		click("investor_xpath");
				
				//waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("investor_xpath"))); // waits implemented
				
				logger.log(Status.INFO, "Investor clicked  ");
				
				takeScreenshot("investorlink"); // CAPTURE SCREENSHOT ON PASS
				
			     logger.info("test  -- Investor link click", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"investorlink" +".png").build());
	 
			
//test	
		type("search_xpath", search_data); // Using dataprovider here
		
		System.out.println(search_data);
		
		
		extent.flush();  // flush report 1
		
	}catch(Exception e) {
		
		logger.log(Status.FAIL, "Error is observed "+ e);
		
		
	}
		
		
		
}
		
		
@Test(priority=2)
		
	public void DTestB2() throws IOException {
	
	System.out.println("inside DTestB12");
	
	try {
	
	ExtentTest logger = extent.createTest("DTestB2"); // create test2 
	
	logger.log(Status.INFO, "in test BTestB2");
//test	
	click("SearchButton_xpath");
	
	logger.log(Status.INFO, "SearchButton");
	
	takeScreenshot("SearchButton"); // CAPTURE SCREENSHOT ON PASS
	
     logger.info("test -- Search button to be clicked", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"SearchButton" +".png").build());
	
	extent.flush();  // flush report 2
	
	} catch (Exception e) {
            logger.log(Status.FAIL, "Error is observed "+ e);
            
            extent.flush();
		
		
	    }
}


	
@DataProvider(name="ddd")
	
	public Object[][] passdata() throws IOException{
		
			
		Object[][] ar =new Object[2][1];  // rows = 0,1 , column 0
		
		ar[0][0] ="Careers";
		//ar[0][1] ="B";
		ar[1][0] ="C";
		//ar[1][1] ="D";
		
		
		
		
		return ar;
		
		
	}
	
	
	}

	//
	
	

	

