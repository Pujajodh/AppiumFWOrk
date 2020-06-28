package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OKRHomePage {
	
AndroidDriver driver;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
	private MobileElement createokr;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Demo']")
	private MobileElement obj01;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='delete']")
	private MobileElement delete;
	
	public OKRHomePage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void createOKR() throws InterruptedException {
		MobileActionUtil.eletobevisibleAndClick(driver, createokr);
		MobileActionUtil.tapOnElement(createokr, driver);
		OKRAddObj obj=new OKRAddObj(driver);
		obj.addObj();
	}
	
	public void clickOnObj() {
		MobileActionUtil.scrollToElement(driver, "text", "Demo");
		MobileActionUtil.tapOnElement(obj01, driver);
		
	}
	public void deleteObj() {
		MobileActionUtil.tapOnElement(delete, driver);
	}

}
