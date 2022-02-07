package com.TestNG_Features;

import org.testng.annotations.Test;

public class Groups {

		
		@Test (groups = "Fruits")
		public void Apple() {

			System.out.println("Apple");
		}
	    
		@Test(groups = "Fruits")
		public void Orange() {
			System.out.println("Orange");

		}

		@Test(groups = "Fruits")
		public void Strawberry() {
			System.out.println("Strawberry");

		}
	  
		@Test(groups = "Fruits")
		public void Muskmelon() {
			System.out.println("Muskmelon");
		
		}
		
		@Test(groups = "Vegies")
		public void Carrot() {
			System.out.println("Carrot");

		}
		
		@Test(groups = "Vegies")
		public void Beans() {
			System.out.println("Beans");

		}
		
		@Test (groups = "Vegies")
		public void greenpeas() {
			System.out.println("Greenpeas");

		}

		@Test (groups = "Fruits")
		public void Watermelon() {

			System.out.println("Watermelon");

		}
	}


