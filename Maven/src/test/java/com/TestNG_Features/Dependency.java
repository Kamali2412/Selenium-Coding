package com.TestNG_Features;

import org.testng.annotations.Test;

public class Dependency {
    
	@Test
	public void SSLCPass() {
		
		System.out.println("SSLCPass");
	}
	
	@Test(dependsOnMethods  = "SSLCPass")
	public void HigerSec() {
		
		System.out.println("HigerSec");
	}
	
}
