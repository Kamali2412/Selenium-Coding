package com.TestNG_Features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Case {

	
	@Test
	public void Apple() {

		System.out.println("Apple");
	}
    
	@Test
	public void Orange() {
		System.out.println("Orange");

	}

	@Ignore
	@Test
	public void Strawberry() {
		System.out.println("Strawberry");

	}
  
	@Test(enabled = false)
	public void Muskmelon() {
		System.out.println("Muskmelon");
	}

	@Test
	public void Watermelon() {

		System.out.println("Watermelon");

	}
}
