package com.app.androidapp.pages;

import org.openqa.selenium.support.PageFactory;

import com.app.androidapp.util.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OKRMyKeyResultpage {

	AndroidDriver driver;
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='2']")
	private MobileElement addnewkey;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter New Key Result']")
	private MobileElement key01;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Save']")
	private MobileElement savebutt;
	
	public OKRMyKeyResultpage(AndroidDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void key01() {
		
		MobileActionUtil.tapOnElement(addnewkey, driver);
		MobileActionUtil.sendkyes("OKRKey01 just created", key01);
		driver.hideKeyboard();
		MobileActionUtil.tapOnElement(savebutt, driver);
	}
}
