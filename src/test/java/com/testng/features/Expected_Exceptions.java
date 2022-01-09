package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {
		int i = 7;
		int j = 0;
		System.out.println(i/j);

	}
	
	@Test(expectedExceptions = NullPointerException.class)
	private void word() {
		String s = null;
		int length = s.length();
        System.out.println(length);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
