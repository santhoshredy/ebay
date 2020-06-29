package com.ebay.qa.utility;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Utility {
         
	   @Test
       public static AndroidDriver getAndroidDriver() {
    	   
    	   AndroidDriver<MobileElement> driver=null;
    	   try {
    		   
    			
    		      DesiredCapabilities caps = new DesiredCapabilities();
    		      caps.setCapability("deviceName", "OPPO A71(3GB)");
    		      caps.setCapability("udid", "c38590e3"); // DeviceId from "adb devices" command
    		      caps.setCapability("platformName", "Android");
    		      caps.setCapability("platformVersion", "7.1.1");
    		      caps.setCapability("appPackage", " com.amazon.mShop.android.shopping");
    		      caps.setCapability("appActivity", "com.amazon.mShop.home.web.MShopWebGatewayActivity");
    		      
    		      driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		      
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   
    	  return driver;
       }
		
}
