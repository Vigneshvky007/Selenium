package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keys {
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement mail;
	@FindBy(id="passwd")
	private WebElement pswd;
	@FindBy(id="SubmitLogin")
	private WebElement login;
	public Keys(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
   }
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPswd() {
		return pswd;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
}