package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement Signup = driver.findElement(By.xpath("//a[@class='login']"));
		Signup.click();

		WebElement EmailAddress = driver.findElement(By.id("email"));
		EmailAddress.sendKeys("kamalisankar1996@gmail.com");

		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("Lon@don21");

		WebElement Signin = driver.findElement(By.name("SubmitLogin"));
		Signin.click();

		WebElement Dress = driver.findElement(By.xpath("//a[text()='Women']"));
		Dress.click();

		WebElement Dressview = driver.findElement(By.xpath("//img[@title='Printed Summer Dress']"));
		Dressview.click();

		WebElement Quantity = driver.findElement(By.xpath("//select[@name='group_1']"));
		Select s1 = new Select(Quantity);
		s1.selectByValue("2");

		WebElement Cart = driver.findElement(By.name("Submit"));
		Cart.click();

		Thread.sleep(2000);

		WebElement Checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		Checkout.click();

		WebElement Checkout1 = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		Checkout1.click();

		WebElement Checkout2 = driver.findElement(By.name("processAddress"));
		Checkout2.click();

		WebElement Checkout3 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkout3.click();

		WebElement Checkout4 = driver.findElement(By.name("processCarrier"));
		Checkout4.click();

		WebElement Payment = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		Payment.click();

		WebElement Confirmorder = driver
				.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		Confirmorder.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Payment1 = driver.findElement(By.id("step_end"));
		js.executeScript("arguments[0].scrollIntoView();", Payment1);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Screenshot\\MiniProject.png");

		FileUtils.copyFile(src, destination);

	}

}
