package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassC {
	
	WebDriver driver;

	@Test
	@Parameters("browser")
	
	public void TestC1(String browserName) {
		
		System.out.println("Test C1 executing");
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			
			driver  = new FirefoxDriver();
			}
		
		else if(browserName.equalsIgnoreCase("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		
		
		driver.get("https://www.rsystems.com/");
		
		
	}
	
	@Test
	public void TestC2() {
		
		System.out.println("test C2 executing");
	}
	

}
