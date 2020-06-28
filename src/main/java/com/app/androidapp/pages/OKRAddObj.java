package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OKRAddObj {
	
	AndroidDriver driver;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Save']")
	private MobileElement savebutton;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter New Objective']")
	private MobileElement newobj;
	
	public OKRAddObj(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void addObj() {
		
		MobileActionUtil.sendkyes("OKROject01", newobj);
		MobileActionUtil.tapOnElement(savebutton, driver);
	
	}

	
	
}
