package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Events {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		WebElement Clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions ac = new Actions(driver);
		ac.click(Clickme).build().perform();
		
		
		WebElement RightClick = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(RightClick).build().perform();
		
		WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
		ac.click(DoubleClick).click().build();
		
		
		driver.navigate().to("https://www.ajio.com/");
		
		WebElement Women = driver.findElement(By.xpath("//a[@title='WOMEN']"));
		ac.moveToElement(Women).build().perform();
		ac.click(Women).build().perform();
		
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		
		
		
	}

}
