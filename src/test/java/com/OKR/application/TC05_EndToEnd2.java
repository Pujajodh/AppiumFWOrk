package com.OKR.application;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.OKRHomePage;
import com.app.androidapp.pages.OKRMyKeyResultpage;
import com.app.androidapp.pages.OKRloginpage;

public class TC05_EndToEnd2 extends BaseLib {
	@Test
	public void tc01_EndToEnd() throws InterruptedException {
		OKRloginpage ok=new OKRloginpage(gv.driver);
		ok.loginToApp();
		OKRHomePage hp=new OKRHomePage(gv.driver);
		hp.createOKR();
		hp.clickOnObj();
		OKRMyKeyResultpage key=new OKRMyKeyResultpage(gv.driver);
		key.key01();
		
		
		
	}

}
