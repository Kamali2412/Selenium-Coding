package com.MavenProject.Maven;

import org.openqa.selenium.WebDriver;
import com.Helper.File_ReaderManager;
import com.SingleTon.PageObjectManager;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver =  browserLaunch("chrome");
	
	public static PageObjectManager pom = new PageObjectManager(driver);

	public static void main(String args[]) throws Throwable {

		String Url = File_ReaderManager.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(Url);
		Click1(pom.getInstanceHomePage().getSignup());
		
		String Email = File_ReaderManager.getInstanceFRM().getInstanceCR().getEmail();
		// WebElement EmailAddress = driver.findElement(By.id("email"));
		Sendkeys(pom.getInstanceLoginPage().getEmailAddress(), Email);
		
		
		String Password = File_ReaderManager.getInstanceFRM().getInstanceCR().getPassword();
		// WebElement Password = driver.findElement(By.id("passwd"));
		Sendkeys(pom.getInstanceLoginPage().getPassword(),Password);

		// WebElement Signin = driver.findElement(By.name("SubmitLogin"));
		Click1(pom.getInstanceLoginPage().getSignin());

	}

}
