package com.ebay.qa.pages;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import com.ebay.qa.base.Basepage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends Basepage {

	public HomePage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	private MobileElement searchbox;
	
	@AndroidFindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	private MobileElement addtocart;
	
	@AndroidFindBy(xpath="//*[@id=\"nav-button-cart\"]/div/i")
	private MobileElement click_on_cart;
	
	@AndroidFindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/div[1]")
	private MobileElement proceed_to_buy;
	

	@AndroidFindBy(xpath="//*[@id=\"enterAddressFullName\"]")
	private MobileElement fullname;
	
	@AndroidFindBy(xpath="//*[@id=\"enterAddressPhoneNumber\"]")
	private MobileElement mobilenumber;
	
	@AndroidFindBy(xpath="//*[@id=\"enterAddressCity\"]")
	private MobileElement enter_city;
	
	@AndroidFindBy(xpath="//*[@id=\"enterAddressPostalCode\"]")
	private MobileElement enter_postalcode;
	
	@AndroidFindBy(xpath="//*[@id=\"address-select\"]/form/div/div/a/div")
	private MobileElement enter_adressline1;
	
	@AndroidFindBy(xpath="//*[@id=\"enterAddressLandmark\"]")
	private MobileElement enter_landmark;
	
	@AndroidFindBy(xpath="//*[@id=\"address-new\"]/div[1]/span/form/span/span/input")
	private MobileElement use_this_adress;
	
	@AndroidFindBy(xpath="//*[@id=\"address-select\"]/form/div/div/a/div")
	private MobileElement select_adress;
	
	@AndroidFindBy(xpath="//*[@id=\"changeQuantityFormId\"]/span/span/input")
	private MobileElement continue_tobuy;
	
	
	
	
	
	
	public void clickOnAutocomplete() throws InterruptedException{
		searchbox.sendKeys("65-inch tv");
		searchbox.sendKeys(Keys.ENTER);
		
AndroidElement tv=(AndroidElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(4))");
		tv.click();
		
		Assert.assertEquals(tv.getText(),("samsung 65 inch led tv"));
   
		 addtocart.click();
		 
		 click_on_cart.click();
		 
		 proceed_to_buy.click();
		 
		 select_adress.click();
		 
		 fullname.sendKeys("santhosh");
		 mobilenumber.sendKeys("8888855556");
		 enter_city.sendKeys("bengalore");
		 enter_postalcode.sendKeys("123456");
		 enter_adressline1.sendKeys("h.no:45,ram nagar ,tekkali street");
		 enter_landmark.sendKeys("pragathi book store");
		 use_this_adress.click();
		 
		 
		 continue_tobuy.click();
		 
		 
	}
}
