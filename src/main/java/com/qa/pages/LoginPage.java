package com.qa.pages;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	public String validateLoginPageTitle() {
		return driver.getTitle();

	}
}
