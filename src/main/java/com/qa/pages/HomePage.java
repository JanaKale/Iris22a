package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.keywords.Keyword;

public class HomePage extends TestBase {

	public String validateHomePageTitle() {
		return Keyword.driver.getTitle();

	}
	
	public String validatePageSource(){
	
		return Keyword.driver.getPageSource();
	}
}
