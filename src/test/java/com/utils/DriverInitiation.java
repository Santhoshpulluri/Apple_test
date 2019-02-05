package com.utils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverInitiation {

	String Browser ;
	WebDriver driver ;
	private static WebElement element=null;
	
public WebDriver Browser (String browser) {	
	
	this.Browser= browser;	
	if (Browser =="Chrome") {
		
	}else if (Browser =="IE")

	{	
    	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    	  
    	capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
    	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
    	System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
    	WebDriver driver = new InternetExplorerDriver(capabilities);
    	driver.manage().window().maximize();
    	
	} else {
    	
        DesiredCapabilities capabilities1 =  DesiredCapabilities.firefox();
		capabilities1.setCapability("marionette", true);
        capabilities1.setCapability("networkConnectionEnabled", true);
        capabilities1.setCapability("browserConnectionEnabled", true);
        System.setProperty("webdriver.gecko.driver", "C:\\IEDriverServer.exe");
        WebDriver driver = new FirefoxDriver(capabilities1);
        driver.manage().window().maximize(); 
	}
      
		return driver;
	}


public static WebElement txt_UserName(WebDriver driver,String xpath)
    {
      
	if (xpath.contains("xpath ")) {
		
	element=driver.findElement(By.id("xpath"));

		
	}else if (xpath.contains("xpath")){
		element=driver.findElement(By.xpath("xpath"));
				
				
				
	}else if (xpath.contains("name")) {
		element=driver.findElement(By.name("xpath"));
	}
	
return element;	
}

}
















