package com.allprogram;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class ScrollDown {

		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kamali\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.bigbasket.com/");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement bbDaily = driver.findElement(By.xpath("//a[text()='bb Daily']"));
	        js.executeScript("arguments[0].scrollIntoView();",bbDaily);
	        
	        Thread.sleep(2000);
	        
	       
	        js.executeScript("window.scrollBy(0,-5000);");
	         
	        Thread.sleep(2000);
	        
	        js.executeScript("window.scrollBy(0,3000);");
	        
	        
	        
	        
		}

	}


