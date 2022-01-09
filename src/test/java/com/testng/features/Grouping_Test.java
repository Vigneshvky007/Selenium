package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Shopping")
	private void amazon() {
		System.out.println("amazon");

	}
	@Test(groups = "Shopping")
	private void flipkart() {
		System.out.println("flipkart");

	}
	
	@Test(groups = "Shopping")
	private void myntra() {
		System.out.println("myntra");

	}
	
	@Test(groups = "SocialMedia")
	private void whatsapp() {
		System.out.println("whatsapp");

	}
	
	
	@Test(groups = "SocialMedia")
	private void instagram() {
		System.out.println("instagram");

	}
	
	@Test(groups = "Epayments")
	private void phonepay() {
		System.out.println("phonepay");

	}
	
	@Test(groups = "Epayments")
	private void gpay() {
		System.out.println("gpay");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
