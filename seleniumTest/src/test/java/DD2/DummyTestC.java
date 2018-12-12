package DD2;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import DD1.DummyTestBase1;
import junit.framework.Assert;

public class DummyTestC extends DummyTestBase1 {
	
	
@Test(priority=1)
	
	public void DTestC1() {
		
		System.out.println("inside DTestC1");
		
		//logger =extent.createTest("DtestC1");
		//logger.log(Status.INFO, "open browser " + "DtestC1");
		
		

	}
	

}
