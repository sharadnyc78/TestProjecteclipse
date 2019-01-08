package stepDefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestBase {
	
	WebDriver driver;
	
	

	
	
	public void takeScreenshot(String screenshotname) throws IOException {//screenshot opens
		
		   TakesScreenshot ts1 = (TakesScreenshot)driver;
				
				File src = ts1.getScreenshotAs(OutputType.FILE);
				
			   
			    FileHandler.copy(src, new File("./screenshots/"+screenshotname+ ".png"));

}
	
	

	public void openBrowser(String bType) throws IOException {
		
		//prop = new Properties();
		
		//FileInputStream fs = new FileInputStream("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\src\\test\\java\\DD3\\dummyconfig.properties");
		
		//prop.load(fs);
		
		
		//System.out.println(prop.getProperty("appurl"));
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		if(bType.equals("Mozilla"))
			driver=new FirefoxDriver();
		else if(bType.equals("Chrome"))
				driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // -- checks presence
		
		//waits = new WebDriverWait(driver, 20); // waits implmented -- checks visibility 
		
	}
	

	
	
	
	



		
	             
	

}
