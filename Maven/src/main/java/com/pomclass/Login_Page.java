package com.pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;
	
	@FindBy (id = "email")
	private WebElement EmailAddress;
	
	@FindBy (id = "passwd")
    private WebElement Password;
	
	@FindBy (name = "SubmitLogin")
    private WebElement Signin;
	
	
	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailAddress() {
		return EmailAddress;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSignin() {
		return Signin;
	}

}
