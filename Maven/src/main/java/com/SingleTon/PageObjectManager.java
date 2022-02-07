package com.SingleTon;

import org.openqa.selenium.WebDriver;

import com.pomclass.Home_Page;
import com.pomclass.Login_Page;

public class PageObjectManager {

	public WebDriver driver;

	private Home_Page Hp;

	private Login_Page Lp;

	public PageObjectManager(WebDriver driver2) {
	
		this.driver = driver2;
		
	}

	public Home_Page getInstanceHomePage() {

		if (Hp == null) {

			Hp = new Home_Page(driver);
		}
		return Hp;

	}

	public Login_Page getInstanceLoginPage() {

		if (Lp == null) {

			Lp = new Login_Page(driver);

		}
		return Lp;
	}
}
