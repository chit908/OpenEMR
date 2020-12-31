package testngtest;

import org.testng.annotations.Test;

import com.openemr.businessfunctions.BaseUtil;
import com.openemr.businessfunctions.CommonBusinessUtils;

public class Login extends BaseUtil{
  @Test
  public void f() {
	  
	  BaseUtil.openApp();
	  CommonBusinessUtils.login();
  }
}
