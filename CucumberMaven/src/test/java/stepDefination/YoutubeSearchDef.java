package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YoutubeSearchDef {

	WebDriver driver;
	@Given("^open browser chrome$")
	public void open_browser_chrome() throws Throwable {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			driver.manage().window().maximize();
		    
	   
	}

	@When("^launch you tube$")
	public void launch_you_tube() throws Throwable {
		
		driver.get("https://www.youtube.com/watch?v=NYB2-3PQiX0");
	   
	}

	
	@Then("^enter \"(.*?)\" and verify search results$")
	public void enter_and_verify_search_results(String search) throws Throwable {
      driver.findElement(By.xpath("//input[@id='search']")).sendKeys(search);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(5000);
	   
		driver.close();
	}

	
}
