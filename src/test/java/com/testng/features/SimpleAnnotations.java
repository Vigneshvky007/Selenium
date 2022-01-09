package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	@BeforeSuite
	private void setProperty() {
		System.out.println("before suite");
	}
	@BeforeTest
	private void url() {
		System.out.println("url");
	}
	@BeforeClass
	private void signin() {
		System.out.println("button click");

	}
	@AfterMethod
	private void signout() {
		System.out.println("signout");

	}
	@Test
	private void mobiles() {
	 System.out.println("apple");

	}
	@Test
	private void headset() {
      System.out.println("one plus");
 
	}
	@Test
    private void books() {
	   System.out.println("crime");
	}
    
     @BeforeMethod
     private void usersignin() {
		System.out.println("usersignin");

	}
    @AfterClass
    private void Homepage() {
		System.out.println("afterclass");

	}
    @AfterTest
    private void closeBrowser() {
		System.out.println("aftertest");

	}
    @AfterSuite
    private void deletecookies() {
		System.out.println("aftersuite");

	}
    
    
    
    
    
    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


