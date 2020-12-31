package com.openemr.pagerepository;

import org.openqa.selenium.By;

import com.openemr.businessfunctions.BaseUtil;
import com.openemr.configuration.Prop;

public class LoginPage extends BaseUtil{
	
	public static By txtusername=By.id("authUser");
	public static By txtpassword=By.id("clearPass");
	public static By btnlogin=By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button");
	
	
	public static void enterusername() {
		driver.findElement(txtusername).sendKeys(Prop.get("username"));
		
		
	}
	public static void enterpassword() {
		driver.findElement(txtpassword).sendKeys(Prop.get("password"));
		
	}
	
	public static void btnlogin() {
		driver.findElement(btnlogin).click();
	}
	

}
