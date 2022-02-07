package com.MavenProject.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String name) {

		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void Click1(WebElement Element) {
		Element.click();
	}
    
	public static void Sendkeys(WebElement Element, String input) {
		Element.sendKeys(input);
	}
}