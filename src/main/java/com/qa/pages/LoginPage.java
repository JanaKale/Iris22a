package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.keywords.Keyword;

public class LoginPage extends TestBase {

	public String validateLoginPageTitle() {
		return Keyword.driver.getTitle();

	}
}
