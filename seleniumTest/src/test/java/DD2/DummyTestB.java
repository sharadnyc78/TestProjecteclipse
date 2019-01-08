package DD2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
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

public class DummyTestB extends DummyTestBase1 {  // class opens
	
	
	
	
@Test(priority=1,dataProvider="ddd")
	
	public void DTestB1(String search_data) throws IOException {  //String search_data  // test open
	
	System.out.println("inside DTestB1");
	
	try { // try open
	
	

	
	
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
			     
			    // type("search_xpath","Carrers"); 
		
		takeScreenshot("searchdata");
			
		 logger.info("test  -- search data", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"searchdata" +".png").build());
		 
		
		System.out.println(search_data);
		
		
		extent.flush();  // flush report 1
		
	}catch(Exception e) { // catch open  // try close
		
		logger.log(Status.FAIL, "Error is observed "+ e);
		
		
	                       } // catch close
		
		
		
                                                           } // test close
		
		
@AfterMethod  // lesson : i wanted one test to be datdriven and another one to run always after it. make test 2 as aftermethod and it will run always .
		
	public void DTestB2() throws IOException {  // test 2 open
	
	System.out.println("inside after method- DTestB2");
	
	try {
	
	ExtentTest logger = extent.createTest("after emthod-DTestB2"); // create test2 
	
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
                                               }// test 2 close


	
@DataProvider(name="ddd")
	
	public Object[][] passdata() throws IOException{ // dp open
		
			
		Object[][] ar =new Object[2][1];  // rows = 0,1 , column 0
		
		ar[0][0] ="Careers";
		//ar[0][1] ="B";
		ar[1][0] ="C";
		//ar[1][1] ="D";
		
		
		
		
		return ar;
		
		
	                                            }// dp close

	
	                                                                                   }// class close

	// what is wrong here : test 1 with dataprovider runs twice but test 2 runs only once which is during second time only
	
	

	

