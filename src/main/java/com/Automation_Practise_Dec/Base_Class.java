package com.Automation_Practise_Dec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static void browsers(String brslnch) {
		if(brslnch.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vivek\\eclipse-workspace\\Selenium batch\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(brslnch.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\vivek\\eclipse-workspace\\Selenium batch\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	
	
	public static void geturl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void sign(WebElement elmnt) {
		elmnt.click();
	}
	
	
	public static void sign1(WebElement elmnt,String option,String words) {
		if(option.equalsIgnoreCase("mail")) {
			elmnt.sendKeys(words);
		}
		else if(option.equalsIgnoreCase("password")) {
			elmnt.sendKeys(words);
		}
	}
       public static void login  (WebElement elmnt) {
    	   elmnt.click();
       }
       
       public static void action(WebElement elmnt,String option) {
    	   Actions act = new Actions(driver);
    	   if(option.equalsIgnoreCase("move")) {
    		   act.moveToElement(elmnt).build().perform();
    	   }
    	   else if(option.equalsIgnoreCase("click")) {
    		   act.click(elmnt).build().perform();
    	   }
    	   
    	   else if(option.equalsIgnoreCase("click1")) {
    		   act.click(elmnt).build().perform();
    	   }
    	   else if(option.equalsIgnoreCase("click2")) {
    		   act.click(elmnt).build().perform();
    	   }
       }
       public static void dropdown(WebElement elmnt,String option,String value) {
    	   Select s = new Select(elmnt);
    	   if(option.equalsIgnoreCase("index")) {
    		   int index = Integer.parseInt(value);
    		   s.selectByIndex(index);
    	   }
    	   else if(option.equalsIgnoreCase("value")) {
    		   s.selectByValue(value);
    	   }
    	   else if(option.equalsIgnoreCase("text")) {
    		   s.selectByVisibleText(value);
    	   }  
       }
       
       public static void addcrt(WebElement elmnt,String option) {
    	   if(option.equalsIgnoreCase("click")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click3")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click4")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click5")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click6")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click7")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click8")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click9")) {
    		   elmnt.click();
    	   }
    	   else if(option.equalsIgnoreCase("click10")) {
    		   elmnt.click();
    	   }
       }
       public static void getText() {
    	  String text= driver.getTitle();
    	  System.out.print(text);
		
	}
    	   
    	   
    	   
    	   
		
	}
       
       
       
    	   
    	   
    	   
    	   
    	   
	
       
       
       
       
		
		   
	
	


