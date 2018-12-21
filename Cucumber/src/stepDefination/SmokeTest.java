package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^open chrome$")
	public void open_chrome() throws Throwable {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rsystems.com/");
	    
	}

	@When("^website is opened$")
	public void website_is_opened() throws Throwable {
		
		driver.get("https://www.rsystems.com/");
		
		Thread.sleep(5000);
	    
	}

	@Then("^click on investor$")
	public void click_on_investor() throws Throwable {
		
		WebElement Investor_link = driver.findElement(By.xpath("//a[@id='hypLnkInvestor']"));
		
		Investor_link.click();
		
		
		
		

	}

}
