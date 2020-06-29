package com.ebay.qa.tests;

import org.testng.annotations.Test;

import com.ebay.qa.pages.HomePage;
import com.ebay.qa.pages.LoginPage;
import com.ebay.qa.utility.Utility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Testcase1 {

	
	@Test
	public void Testcase() {
	AndroidDriver<MobileElement> driver=Utility.getAndroidDriver();
	
	try {
		LoginPage loginpage=new LoginPage(driver);
		
		HomePage homepage=loginpage.clickOnViews();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
}
