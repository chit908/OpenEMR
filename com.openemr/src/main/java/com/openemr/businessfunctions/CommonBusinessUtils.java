package com.openemr.businessfunctions;

import com.openemr.pagerepository.LoginPage;

public class CommonBusinessUtils extends BaseUtil{
	
	public static void login() {
		
	  LoginPage.enterusername();
	  LoginPage.enterpassword();
	  LoginPage.btnlogin();
	}

}
