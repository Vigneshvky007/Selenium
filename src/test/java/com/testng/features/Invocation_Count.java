package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority=-2)
	private void browserLaunch() {
		System.out.println("browserLaunch");

	}
	
	@Test(priority=-1)
	private void url() {
		System.out.println("url");

	}
	
	@Test(priority=2)
	private void homepage() {
		System.out.println("homepage");

	}
	
	@Test(invocationCount=3,priority=1)
	private void refresh() {
		System.out.println("refresh");

	}
	@Test
	private void credentials() {
		System.out.println("credentials");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
