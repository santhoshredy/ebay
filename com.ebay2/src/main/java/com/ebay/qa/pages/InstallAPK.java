package com.ebay.qa.pages;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class InstallAPK {
	public void installapp() {
try {
	  DesiredCapabilities caps = new DesiredCapabilities();
	 caps.setCapability("deviceName", "OPPO A71(3GB)");
     caps.setCapability("udid", "c38590e3"); // DeviceId from "adb devices" command
     caps.setCapability("platformName", "Android");
     caps.setCapability("platformVersion", "7.1.1");
     
    AndroidDriver driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
     Thread.sleep(4000);
     driver.installApp("C:\\Users\\reddy\\Downloads\\Amazon_shopping.apk");
     Thread.sleep(4000);
     driver.quit();
}
catch(Exception e) {
	
}
	}
}
