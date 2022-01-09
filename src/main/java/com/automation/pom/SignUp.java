package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
	public static WebDriver driver;
	@FindBy(xpath="//a[@class='login']")
	private WebElement sig;
	public SignUp(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getSig() {
		return sig;
	}

}
