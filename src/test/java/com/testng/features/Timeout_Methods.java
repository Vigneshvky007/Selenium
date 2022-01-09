package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_Methods {
	@Test(timeOut = 3000)
	private void browserLaunch() throws InterruptedException {
		System.out.println("Browser launch");
		Thread.sleep(3000);

	}
	@Test
	private void url() {
		System.out.println("url");

	}
	
	
	
	@Test(timeOut = 3000)
	private void login() throws InterruptedException {
		System.out.println("login");
		Thread.sleep(2000);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
