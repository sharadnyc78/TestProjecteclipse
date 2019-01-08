package stepDefination;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Amazon extends TestBase {
	
	//public static ExtentReports extent;
    //public static ExtentTest logger;
	//public static ExtentHtmlReporter reporter;
	
	//WebDriver driver;
	
	@Given("^chrome browser is opened$")
	
	
	public void chrome_browser_is_opened() throws Throwable {
		
		openBrowser("Chrome");
		
        //reporter = new ExtentHtmlReporter( "C:\\Users\\Sharad.Chauhan\\git\\repository3\\CucumberMaven\\Reports\\AmaonTest.html");
        
      
		
		//extent = new ExtentReports();
		
		//extent.attachReporter(reporter);
		
		reportExt();
		
		logger =extent.createTest("sceanrio1");
		
		logger.log(Status.INFO, "open browser " + "chrome");
	}
	
		
		
/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}*/

	@Given("^site amazon is launched$")
	public void site_amazon_is_launched() throws Throwable {
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	
	   
	}

	@When("^I \"(.*?)\" products$")
	public void i_products(String search) throws Throwable {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(search);
		
		String handleOne = driver.getWindowHandle(); // check the window handles as clicking on cart is failing
		
		System.out.println(handleOne);
		
		driver.findElement(By.xpath(" //input[@value='Go']")).click();
		
		driver.findElement(By.xpath("//a[@title='All-new Echo Dot (3rd Gen) - Smart speaker with Alexa (Black)']//h2[@class='a-size-medium s-inline s-access-title a-text-normal'][contains(text(),'All-new Echo Dot (3rd Gen) - Smart speaker with Al')]")).click();
	  
	}

	@When("^add them to cart$")
	public void add_them_to_cart() throws Throwable {  // 1) failing because it take user to another page , need to move to next page
		

		
		Set<String> handles = driver.getWindowHandles();
		
		System.out.println(handles.size());
		
		Iterator<String> itr = handles.iterator();

		
		String patName = itr.next();

		
		String chldName = itr.next();

		//Switch to child window
		driver.switchTo().window(chldName);
		
		
		driver.findElement(By.name("submit.add-to-cart")).click();
		
	   
	}

	@Then("^cart should have those items and should be able to checkout$")
	public void cart_should_have_those_items_and_should_be_able_to_checkout() throws Throwable {
	   
		
		driver.findElement(By.xpath("//a[@class='hucSprite s_checkout hlb-checkout-button']")).click();
		
		// take screenshot 
		
		takeScreenshot("echo");
		
		 logger.info("test -- echo ", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\Sharad.Chauhan\\git\\repository3\\CucumberMaven\\screenshots\\"+"echo.png").build());
		
		
		extent.flush();  // flush report 1
		
		// get extent reports
	    
	    // test base class

	}
	

@Given("^chrome open$")
public void chrome_open() throws Throwable {
	openBrowser("Chrome");
	
	//driver.get("https://www.youtube.com/watch?v=KGBzW3vV0-A");
	
	logger =extent.createTest("sceanrio2");
	
	extent.flush();  // flush report 1
}

@When("^amazon open$")
public void amazon_open() throws Throwable {
	
	
   
}

@Then("^close browser$")
public void close_browser() throws Throwable {
   
}

	
	
	
	

}
