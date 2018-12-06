package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class ScrollOUTLOOK {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Program Files\\Microsoft Office\\Office15\\OUTLOOK.exe");
		
		
		
		
		WiniumDriver wd = new WiniumDriver (new URL("http://localhost:9999"), option);
		
		Thread.sleep(10000);
		
		
	// open an existing email based on some text 
		
		wd.findElement(By.name("Line down")).click();
		
		Thread.sleep(5000);
		wd.findElement(By.name("Line down")).click();
		
		wd.findElement(By.xpath("//*[contains(@Name,'From ranorexhelpdesk@gte-india.com, Subject RE: Ranorex test automation tool evaluation - Greetings from')]")).click();
		
			
	// lets Open New email
		
		

	}

}
