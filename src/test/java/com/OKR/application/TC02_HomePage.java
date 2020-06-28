package com.OKR.application;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.androidapp.pages.OKRHomePage;
import com.app.androidapp.pages.OKRloginpage;

public class TC02_HomePage extends BaseLib {
	@Test
	public void tc01_CreateNewObjective() throws InterruptedException {
		OKRloginpage ok=new OKRloginpage(gv.driver);
		ok.loginToApp();
		OKRHomePage hp=new OKRHomePage(gv.driver);
		hp.createOKR();
		
		
		
	}

}
