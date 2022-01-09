package com.Automation_Practise_Dec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.pom.Click;
import com.automation.pom.Dresses;
import com.automation.pom.Keys;
import com.automation.pom.SelectProduct;
import com.automation.pom.SignUp;

public class RunnerClass extends Base_Class {
	public static void main(String[] args) throws InterruptedException {
		browsers("chrome");
		
		
		
		
		
		geturl("http://automationpractice.com/index.php");
		SignUp si=new SignUp(driver);
		sign(si.getSig());
		Thread.sleep(3000);
		Keys ke= new Keys(driver);
		sign1(ke.getMail(), "mail", "vigneshvky77@yahoo.com");
		sign1(ke.getPswd(), "password", "vicks007");
		login(ke.getLogin());
		Dresses ds = new Dresses(driver);
		action(ds.getWomen(), "move");
        action(ds.getEvedress(), "click");
        action(ds.getSize(), "click1");
        action(ds.getColour(), "click4");
        SelectProduct sp = new SelectProduct(driver);
        dropdown(sp.getSig(), "index", "3");
        Click ck = new Click(driver);
        addcrt(ck.getAdtocrt(), "click");
        addcrt(ck.getAddcrt(), "click3");
        Thread.sleep(3000);
        addcrt(ck.getPrcd2(), "click4");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        addcrt(ck.getPrcd3(), "click5");
        addcrt(ck.getPrcd4(), "click6");
        addcrt(ck.getPrcd5(), "click7");
        addcrt(ck.getPrcd6(), "click8");
        addcrt(ck.getPrcd7(), "click9");
        addcrt(ck.getCfrm(), "click10");
        getText();
	    
	  
	    
	   
	}
}
