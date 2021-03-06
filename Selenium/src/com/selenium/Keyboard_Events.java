package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement Images = driver.findElement(By.xpath("//a[text()='Images']"));
		Actions ac = new Actions(driver);
		ac.contextClick(Images).build().perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
	    driver.quit();

	}

}
