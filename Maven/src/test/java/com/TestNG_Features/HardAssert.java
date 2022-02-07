package com.TestNG_Features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void HardAssert_Concept() {
		
		String Expected = "Passed";
		String Actual   = "passed";
		
		Assert.assertNotEquals(Actual, Expected);
		
		System.out.println("Validation");
		
	}
}
