package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OKRloginpage {
	
	AndroidDriver driver;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Email Address']")
	private MobileElement eid;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter Password']")
	private MobileElement password;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='3']")
	private MobileElement login;

	public void loginToApp() throws InterruptedException {

		MobileActionUtil.eletobevisibleAndSendkeys(driver, eid, "shriniwas@cloudaeon.net");
		MobileActionUtil.sendkyes("Shri@4916", password);
		MobileActionUtil.implicateWait(driver);
		MobileActionUtil.tapOnElement(login, driver);
	}
	
	
	public OKRloginpage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
