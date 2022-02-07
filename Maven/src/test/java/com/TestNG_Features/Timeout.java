package com.TestNG_Features;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 8000)
	public void demo() throws InterruptedException {
		
		System.out.println("Browser Launch");
		Thread.sleep(2000);
		
		System.out.println("User name");
		Thread.sleep(1000);
		
		System.out.println("Password");
		Thread.sleep(4000);
		
		System.out.println("Login ID");
		Thread.sleep(3000);
		
	}
}
