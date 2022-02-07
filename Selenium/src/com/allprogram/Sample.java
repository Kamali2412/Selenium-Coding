package com.allprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement Signup = driver.findElement(By.xpath("//a[@class='login']"));
		Signup.click();
		
		WebElement EmailAddress = driver.findElement(By.id("email"));
		EmailAddress.sendKeys("kamalisankar1996@gmail.com");
		
		WebElement Password = driver.findElement(By.id("passwd"));
		Password.sendKeys("Lon@don21");
	
		
		WebElement Signin = driver.findElement(By.name("SubmitLogin"));
	    Signin.click();
	    
	    Thread.sleep(2000);
	    

	    WebElement RadioButton = driver.findElement(By.xpath("//input[@value='2']"));
	     RadioButton.click();
	    
	    WebElement FirstName = driver.findElement(By.xpath("//input[@data-validate='isName']"));
	    FirstName.sendKeys("Kamali");
	    
	    WebElement LastName = driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]"));
	    LastName.sendKeys("Sankar");
	    
	    WebElement Password1 = driver.findElement(By.xpath("//input[@type='password']"));
	    Password1.sendKeys("Lon@don21");
	    
	    WebElement Date = driver.findElement(By.id("days"));
	    Select s = new Select(Date);
	    s.selectByValue("24");
	   
	    
	    WebElement Month =  driver.findElement(By.id("months"));
	    Select s1 = new Select(Month);
	    s1.selectByValue("12");
	    
	   
	    WebElement Year = driver.findElement(By.id("years"));
	    Select s2 = new Select(Year);
	    s2.selectByValue("1996");
	    

	  WebElement Address = driver.findElement(By.id("address1"));
	  Address.sendKeys("1505 8th St, P.O. BOX 638, DELTA ELECTRONICS CO OF LOUISIANA INC");
	    
	  WebElement Address1 = driver.findElement(By.id("address2"));
	  Address1.sendKeys("5000 Jackson West Apartments");
	    
	  WebElement City = driver.findElement(By.id("city"));
	  City.sendKeys("Harvey LA");
	    
	  WebElement State = driver.findElement(By.id("id_state"));
	  State.sendKeys("Louisiana");
	    
	  WebElement ZipCode = driver.findElement(By.id("postcode"));
	  ZipCode.sendKeys("70058");
	    
	  WebElement Phone = driver.findElement(By.name("phone"));
	  Phone.sendKeys("09879234213");
	    
	    
      WebElement Mobile = driver.findElement(By.name("phone_mobile"));
	  Mobile.sendKeys("9566393713");
	    
	    
	  WebElement MyAddress = driver.findElement(By.name("alias"));
	  MyAddress.sendKeys("Boulevard");
	    
	    
	  WebElement Submit = driver.findElement(By.name("submitAccount"));
	  Submit.click(); 
	    
	    
	    
        TakesScreenshot ts =  (TakesScreenshot) driver;
	    
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    
	    File destination = new File("C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Screenshot\\Automation.png");
	    
	    FileUtils.copyFile(src, destination);
	    
	}

}
