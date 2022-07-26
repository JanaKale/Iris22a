package com.qa.pagetests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	static LoginPage loginpage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@Test
	public void verifyLoginPageTitle() {
		loginpage = new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
