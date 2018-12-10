package SeleniumTC;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Library.TestBase;


public class RsystemsshotsonPassnFail_Extent4 extends TestBase {
	
	
	
	String screenshotname;

	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest logger;

	

	
    @Test
	
	public void takeScreenshotWhenFailandPass() throws IOException, InterruptedException  {
    	
    	try {
    	
       reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Reports\\report4.html"); // give the path for report geneartion
        
        
        
       // reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\Reports\\ExtentReportDemo.html"); // give the path for report geneartion
        
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		
		
		
	    logger = extent.createTest("Test 1");
		
		logger.log(Status.INFO, "Test started - 1");
		
		logger.log(Status.PASS, "Passed -1");
		
// test 1 		
	    Openbrowser("Chrome");
	    
	    String appurl="https://www.rsystems.com/";
	    
	    Navigate(appurl);
		
		
		     logger.log(Status.PASS, "Opening Browser");
		
		     capturescreenshot("Open Browser"); // CAPTURE SCREENSHOT ON PASS
		
		     logger.pass("test pass -- Open Browser pass", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Open Browser" +".png").build());
// test 2		
		String xpathinvest = "//a[@id='hypLnkInvestor']";
		     
//test 3
		Click(xpathinvest);
		
            logger.log(Status.PASS, "Clicking on Investor link");
		
		     capturescreenshot("Investors"); // CAPTURE SCREENSHOT ON PASS
		     logger.pass("test pass -- Click investors", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Investors" +".png").build());
				
		

		
        Thread.sleep(3000);
        
        Assert.assertFalse(true);
        
          	// flush report 1
    	} catch ( Error e ) {
    		
    		logger.log(Status.FAIL,"Failure observed");
    		
    	
    	}
    	
    	extent.flush();
    }
        
       
     
        		
        		
		
		
		//quit();
		
		
		// Takes Screenshot is an interface -- cannot create object
		
		// so typecast this
       
	
		
    

        
       /* 
	
		@AfterMethod
		
		public void tearDown1(ITestResult result) throws IOException, InterruptedException {
			
			if(ITestResult.FAILURE==result.getStatus()) {
				
			capturescreenshot(result.getName());
			}
			
			Thread.sleep(10000);
			
		//	logger.fail("test failure -- message here", MediaEntityBuilder.createScreenCaptureFromPath("./Screenshots/"+result.getName()+ ".png").build());
                //C:\Users\Sharad.Chauhan\git\repository3\seleniumTest\Screenshots\takeScreenshotWhenFail.png
			logger.fail("test failure ", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+result.getName() +".png").build());
			
			Thread.sleep(5000);

			extent.flush();
			quit();
			
	
			
		      }
			*/
		}	

		
		



