package Library;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	// keep it static as we will call it directly
	
	


	public static void capturescreenshot(WebDriver driver, String screenshotname) throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		
		File src = ts1.getScreenshotAs(OutputType.FILE);
		
	   
	    FileHandler.copy(src, new File("./Screenshots/"+screenshotname+ ".png"));
	
		
	}
	
	//public void 
}

