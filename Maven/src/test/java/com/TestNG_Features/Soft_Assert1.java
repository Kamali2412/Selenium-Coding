package com.TestNG_Features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert1 {
	
	
	@Test
	public void Soft_AssertMethod() {
		
		
		 Integer Exp = 112;
		 
		 Integer Act = 113;
		 
		 SoftAssert sa = new SoftAssert();
		 
		 sa.assertEquals(Exp, Act);
		 
		 System.out.println("Verification");
		
	}

}
