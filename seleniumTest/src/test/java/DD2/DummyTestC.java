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
	
	
@Test(priority=3)
	
	public void DTestC1() throws IOException {
	
	try {
		
		System.out.println("inside DTestC1");
		
		logger =extent.createTest("DtestC1");
		
		
		click("ContactusButton_xpath");
		
		logger.log(Status.INFO, "Contact us to be Clicked  ");
		
		takeScreenshot("Contactusbutton2"); // CAPTURE SCREENSHOT ON PASS
		
	     logger.info("test -- Contactusbutton2", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Contactusbutton2" +".png").build());
		
		extent.flush();  // flush
		
	} catch(Exception e) {
		

		logger.log(Status.FAIL, "Error is observed "+ e);
		takeScreenshot("Contactusbutton2");
		logger.info("test -- Contactusbutton2", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Screenshots\\"+"Contactusbutton2" +".png").build());
		extent.flush();
		
	}
		

	}
	

}
