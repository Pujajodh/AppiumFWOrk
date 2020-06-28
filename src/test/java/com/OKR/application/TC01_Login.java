package com.OKR.application;

import org.testng.annotations.Test;

import com.app.android.lib.BaseLib;
import com.app.android.lib.GenericLibrary;
import com.app.androidapp.init.Constants;
import com.app.androidapp.init.GlobalVariables;
import com.app.androidapp.pages.OKRloginpage;

public class TC01_Login extends BaseLib {
	@Test
	public void tc01_LoginToApp() throws InterruptedException {
		OKRloginpage ok=new OKRloginpage(gv.driver);
		ok.loginToApp();
	
		
	}

}
