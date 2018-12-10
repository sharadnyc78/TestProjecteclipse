package Library;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestBase {
	
	WebDriver driver;
	
	
	
	public void Openbrowser(String browser) {
		

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharad.Chauhan\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
	}
	
	 
	public void capturescreenshot( String screenshotname) throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
	   
	    FileHandler.copy(src, new File("./Screenshots/"+screenshotname+ ".png"));
	
		
	}
public void Click(String xpathkey) {
		
		driver.findElement(By.xpath(xpathkey)).click();
	}




public void Navigate(String appurl) {
	
	driver.get(appurl);
	
	
}

public void sendkeys(String xpathkey2, String send2) {
	
	driver.findElement(By.xpath(xpathkey2)).sendKeys(send2);
}

public void quit() {
	
	driver.quit();}



}
