package DD1;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class util {
	

static ExtentHtmlReporter reporter;
static ExtentReports extent;
//ExtentTest logger ;
	


	
	public static void extentrep() {
		

		reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Reports\\DummyTest.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		//logger.log(Status.INFO, "@beforesuite set up");
		
	}
	
	
}
