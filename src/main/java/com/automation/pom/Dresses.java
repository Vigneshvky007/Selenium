package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath="//a[@title='Evening Dresses']")
	private WebElement evedress;
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement size;
	@FindBy(id="layered_id_attribute_group_7")
	private WebElement colour;
	public Dresses(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getEvedress() {
		return evedress;
	}
	public WebElement getSize() {
		return size;
	}
	public WebElement getColour() {
		return colour;
	}

	
	
	
	
	
	
}
