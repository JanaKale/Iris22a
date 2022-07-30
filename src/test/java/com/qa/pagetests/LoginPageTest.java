package com.qa.pagetests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	@Test
	public void verifyLoginPageTitle() {
		LoginPage loginpage = new LoginPage();
		String expTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actTitle=loginpage.validateLoginPageTitle();
		Assert.assertEquals(actTitle,expTitle ,"Expected Title didn't match"+actTitle);
	}

	

}
