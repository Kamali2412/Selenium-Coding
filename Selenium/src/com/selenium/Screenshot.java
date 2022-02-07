package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.bigbasket.com/");
	    
	    driver.manage().window().maximize();
	    
	    TakesScreenshot ts =  (TakesScreenshot) driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destination = new File("C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Screenshot\\Bigbasket.png");
	    
	    FileUtils.copyFile(src, destination);

	}
}
