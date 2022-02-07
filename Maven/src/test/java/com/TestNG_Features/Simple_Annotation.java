package com.TestNG_Features;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	
    @BeforeMethod
	@Test
	public void yellow() {

		System.out.println("Yellow");
	}
    
	@Test
	public void maroon() {

		System.out.println("Maroon");
	}
    
	@Test
	public void voilet() {

		System.out.println("Voilet");

	}
    @Test
	public void purple() {

		System.out.println("Purple");

	}
}
