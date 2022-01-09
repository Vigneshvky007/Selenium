package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click {
	public static WebDriver driver;
	@FindBy(xpath="//img[@class='replace-2x img-responsive']")
	private WebElement adtocrt;
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement addcrt;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement prcd2;
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement prcd3;
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	private WebElement prcd4;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement prcd5;
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	private WebElement prcd6;
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement prcd7;
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement cfrm;
	
	public Click(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAdtocrt() {
		return adtocrt;
	}

	public WebElement getAddcrt() {
		return addcrt;
	}

	public WebElement getPrcd2() {
		return prcd2;
	}

	public WebElement getPrcd3() {
		return prcd3;
	}

	public WebElement getPrcd4() {
		return prcd4;
	}

	public WebElement getPrcd5() {
		return prcd5;
	}

	public WebElement getPrcd6() {
		return prcd6;
	}

	public WebElement getPrcd7() {
		return prcd7;
	}

	public WebElement getCfrm() {
		return cfrm;
	}
	
	
	
	
	
	
}
