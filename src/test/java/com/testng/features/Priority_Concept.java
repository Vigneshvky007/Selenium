package com.testng.features;

import org.testng.annotations.Test;

public class Priority_Concept {
	
	@Test(priority=-2)
	private void women() {
         System.out.println("women");

	}
	@Test(priority=-1)
	private void men() {
            System.out.println("men");

	}
	@Test(priority=2)
	private void tshirts() {
		System.out.println("tshirts");

	}
	@Test
	private void books() {
		System.out.println("books");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
