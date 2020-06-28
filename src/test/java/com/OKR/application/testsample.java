package com.OKR.application;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.OKRHomePage;
import com.app.androidapp.pages.OKRMyKeyResultpage;
import com.app.androidapp.pages.OKRloginpage;
import com.app.androidapp.util.MobileActionUtil;

public class testsample extends BaseLib {

@Test
public void tc_01() throws InterruptedException {
	
	gv.driver.findElementByXPath("//android.widget.EditText[@text='Enter Email Address']").sendKeys("shriniwas@cloudaeon.net");
	Thread.sleep(2000);
	gv.driver.findElementByXPath("//android.widget.EditText[@text='Enter Password']").sendKeys("Shri@4916");
	Thread.sleep(2000);
	gv.driver.findElementByXPath("//android.view.ViewGroup[@index='3']").click();
	Thread.sleep(5000);
//	gv.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
//			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
//			+ "android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
//			+ "android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
//			+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
//			+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/"
//			+ "android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]").click();
	Thread.sleep(5000);
	gv.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Demo\"))").click();
	Thread.sleep(3000);
	gv.driver.tap(1, gv.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView"), 300);
	//gv.driver.findElementByXPath("//android.view.ViewGroup[@index='2']").click();
	Thread.sleep(3000);
	gv.driver.findElementByXPath("//android.widget.EditText[@text='Enter New Key Result']").sendKeys("fghfghjs");
	Thread.sleep(3000);
	gv.driver.tap(1, gv.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView"), 300);
	//gv.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView").click();
	Thread.sleep(3000);
//	gv.driver.ta
	
	
	
	
//	gv.driver.findElementByXPath("//android.widget.EditText[@text='Enter New Objective']").sendKeys("OkRNewObJ01");
//	Thread.sleep(2000);
//	WebElement str = gv.driver.findElementByXPath("//android.view.ViewGroup[@index='5']");
//	if(str.isEnabled())
//	{
//		System.out.println("is ebanle");
//		WebDriverWait wait=new WebDriverWait(gv.driver, 20);
//		wait.until(ExpectedConditions.visibilityOf(str));
//		gv.driver.tap(1, str, 500);
//	}
//	else 
//	{
//		System.out.println("not dispables");
//	}
//	
//	
//	Thread.sleep(2000);
//	gv.driver.findElementByXPath("//android.widget.TextView[@text='OKROject01']").click();
//	Thread.sleep(2000);
//	gv.driver.findElementByXPath("//android.view.ViewGroup[@index='2']").click();
//	Thread.sleep(2000);
//	gv.driver.findElementByXPath("//android.widget.EditText[@text='Enter New Key Result']").click();
//	Thread.sleep(2000);
//	gv.driver.hideKeyboard();
//	Thread.sleep(2000);
//	gv.driver.findElementByXPath("//android.widget.TextView[@text='Save']").click();
	
	
//	
//	OKRloginpage ok=new OKRloginpage(gv.driver);
//	ok.loginToApp();
//	Thread.sleep(4000);
//	//gv.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"new obj\"))").click();
//	//gv.driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+text+"(\""+av+"\"))");
//	//MobileActionUtil.scrollToElement(gv.driver, "text", "new obj");
//	//System.out.println("hie"+"bhasb");
//	OKRHomePage hp=new OKRHomePage(gv.driver);
//	
//	//hp.createOKR();
//	hp.clickOnObj();
//	OKRMyKeyResultpage key=new OKRMyKeyResultpage(gv.driver);
//	key.key01();
	
	
	
	
	
}
}
