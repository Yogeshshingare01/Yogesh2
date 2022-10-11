package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_001 extends BaseClass {
	@Test
	public void Test_01() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkey(login.getEmail(), "yogesh");
		Library.custom_sendkey(login.getPass(), "987456321");
		Library.custom_click(login.getBtn_login());
		
	}

}
