package com.ebay.qa.pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;

import com.ebay.qa.base.Basepage;
import com.ebay.qa.resources.ExcelDataConfig;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage  extends Basepage{
	public LoginPage(AndroidDriver<MobileElement> driver) {  //(IOSDriver driver)    (WebDriver driver)
		super(driver);
	}
	
	@AndroidFindBy(xpath="//*[contains(@text,'Already a customer? Sign in')]")  //@iOSBy(xpath="")     @FindBy 
	private MobileElement existing_customer_link;
	
	@AndroidFindBy(xpath="//*[contains(@id,'ap_email_login')]")
	private MobileElement enter_email;
	
	@AndroidFindBy(xpath="//*[contains(@id,'continue')]")
	private MobileElement enter_email_continue;
	
	@AndroidFindBy(xpath="//*[contains(@id,'ap_password')]")
	private MobileElement enter_password;
	
	@AndroidFindBy(xpath="//*[contains(@id,'signInSubmit')]")
	private MobileElement click_login_btn;
	/*public void clickOnViews() throws InterruptedException{
		views_link.click();*/
	
	public HomePage clickOnViews() throws Exception{
		
		ExcelDataConfig excel=new ExcelDataConfig("./src/main/resources/Book1.xlsx");
		
		Set<String> con = driver.getContextHandles();
		for(String c : con)
		{
			System.out.println("Available Context : "+c);
			if(c.contains("webview"))
			{
				driver.context(c);
				break;
			}
		}
		existing_customer_link.click();
		
		enter_email.sendKeys(excel.getData("Sheet1", 1, 0));            //"yenumulasrr@gmail.com"
		enter_email_continue.click();
		
		enter_password.sendKeys(excel.getData("Sheet1", 1, 1));                     //"santhu"
		click_login_btn.click();
		
		rotateScreen();
		
		return new HomePage(driver);
	}
	
	
	public void rotateScreen() throws Exception{
	//screen rotation method
	
	ScreenOrientation curr=driver.getOrientation();
	driver.rotate(curr.LANDSCAPE);
	Thread.sleep(2000);
	screenshotMethod();
	driver.rotate(curr.PORTRAIT);
	
	}
	public void screenshotMethod() throws IOException {
		//for screen shot
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1,new File("screenshot.jpg"));
	}
	
	
}
