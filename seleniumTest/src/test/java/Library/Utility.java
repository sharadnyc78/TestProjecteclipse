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
	public static void capturescreenshot(WebDriver driver) {
		
    try {
		TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
		   
		    FileHandler.copy(src, new File("./Screenshots/rsys.png"));
		    
		    
	 } catch (Exception e) {
		
		System.out.println("exception while takin screenshot");
	}
    
	}
}

