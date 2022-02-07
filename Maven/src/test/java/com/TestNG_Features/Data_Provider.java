package com.TestNG_Features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider = "UpdatedData")
	public void Password(String LoginID, String Username) {
		
		System.out.println("LoginID is" + LoginID);
		
		System.out.println("Username is" + Username);
		
	}

	@DataProvider
	public Object[][] UpdatedData() {
		
		return new Object[][] {
			
			{"Kamali123" , "Lon@don21"},
			{"Preethi456" , "Amer@ica21"}
			
		};
	}
}
