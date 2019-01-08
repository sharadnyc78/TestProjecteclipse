package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest_Rsystem {
	
	WebDriver driver;
	
	public static ExtentReports extent;
    public static ExtentTest logger;
	public static ExtentHtmlReporter reporter;
	
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	    
	}

	@When("^launch r sys website$")
	public void launch_r_sys_website() throws Throwable {
		
		driver.get("https://www.rsystems.com");
		
       reporter = new ExtentHtmlReporter( "C:\\Users\\Sharad.Chauhan\\git\\repository3\\CucumberMaven\\Reports\\RsysTest.html");
        
      
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		logger =extent.createTest("sceanrio1");  
		
		logger.log(Status.INFO, "open browser " + "chrome");
		
		logger =extent.createTest("sceanrio3");
		
		extent.flush();
	    
	}

	@Then("^click investors get title$")
	public void click_investors_get_title() throws Throwable {
		
		driver.findElement(By.xpath("//a[@id='hypLnkInvestor']")).click();;
		
		Thread.sleep(3000);
		
		driver.close();
	    
	}



}
