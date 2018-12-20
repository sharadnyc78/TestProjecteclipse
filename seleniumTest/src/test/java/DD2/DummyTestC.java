package DD2;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DD1.DummyTestBase1;
import junit.framework.Assert;

public class DummyTestC extends DummyTestBase1 {
	
	
@Test
	
	public void DTestC1() throws IOException, InterruptedException {
	
	try {
		
		
		
		System.out.println("inside DTestC1");
		
		logger =extent.createTest("DtestC1");
		
	
		openBrowser("Chrome");
		navigate("appurl");
	     click("ContactusButton_xpath");
		
		//Thread.sleep(5000);
		
		logger.log(Status.INFO, "Contact us to be Clicked  ");
		
		takeScreenshot("Contactusbutton"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.info("test -- Contactusbutton", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Contactusbutton" +".png").build());
		
		extent.flush();  // flush
		
	} catch(Exception e) {
		

		logger.log(Status.FAIL, "Error is observed "+ e);
		takeScreenshot("Contactusbutton");
		logger.info("test -- Contactusbutton", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Contactusbutton" +".png").build());
		extent.flush();
		
	}
		

	}

// lesson : c wont work on pages opened by test b... we need to keep dependent tests in one test and independent in others
	

}
