package TestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesktopOptions option = new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		
		WiniumDriver wd = new WiniumDriver (new URL("http://localhost:9999"), option);
		
		Thread.sleep(5000);
		
		
		
		wd.findElement(By.id("num7Button")).click();
		
		

		wd.findElement(By.id("plusButton")).click();

		wd.findElement(By.id("num8Button")).click();
		
		wd.findElement(By.id("equalButton")).click();
		

		String Results = wd.findElement(By.id("CalculatorResults")).getAttribute("Name");
		
		
		
		
		
		
		
		
		System.out.println(Results);
		
		
		
			

	}

}
