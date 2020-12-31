package com.openemr.businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.openemr.configuration.Prop;

public class BaseUtil {
	
	public static WebDriver driver=null;
	
	public static void openApp() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\chitra\\eclipse-workspace\\com.openemr\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Prop.get("url"));
		
	}

}
