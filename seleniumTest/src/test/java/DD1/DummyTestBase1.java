package DD1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class DummyTestBase1 {
	
	public WebDriver driver;
	public Properties prop ;// for config ptroperties
	
	String screenshotname;
	
	//public ExtentReports extent;

	//public ExtentTest logger;
	//public ExtentHtmlReporter reporter;
	
	
	public void openBrowser(String bType) throws IOException {
		
		prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\src\\test\\java\\DD3\\dummyconfig.properties");
		
		prop.load(fs);
		
		
		System.out.println(prop.getProperty("appurl"));
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		
		if(bType.equals("Mozilla"))
			driver=new FirefoxDriver();
		else if(bType.equals("Chrome"))
				driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void navigate(String urlKey) {
		
		driver.get(prop.getProperty(urlKey));
		
		
	}
	
	public void type(String xpath, String data) {
		
		driver.findElement(By.xpath(prop.getProperty(xpath))).sendKeys(data);
		
		
	}
	
	public void click(String xpath) {
		
		driver.findElement(By.xpath(prop.getProperty(xpath))).click();
		
		
	}
	
	//Validations functions
	
	public boolean verifyTitle() {
		
		return false;
		
		
	}
	
	public boolean isElementPresent() {
		
		
		return false;
		
		
	}
	
	
	// reporting functions
	
	public void takeScreenshot(String screenshotname) throws IOException {
		
   TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
	   
	    FileHandler.copy(src, new File("./Screenshots/"+screenshotname+ ".png"));
	
		
		
	}
	
	/*
   public void ExtentStart() {
		reporter = new ExtentHtmlReporter("C:\\Users\\Sharad.Chauhan\\git\\repository3\\seleniumTest\\Reports\\DummyTest-Testbasefucntion.html"); // give the path for report geneartion
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		logger =extent.createTest("helloo");
		
	
		}
		
	*/	
		
		
	
	
	// reporting functions and logging
	
	

}
