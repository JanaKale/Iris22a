package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;
import com.qa.keywords.Keyword;

public class HomePage extends TestBase {

	@FindBy(css=".ico-register")
	public WebElement registerBtn;

	@FindBy(css = ".page-title h1")
	public WebElement registrationPageTitle;

	public String validateHomePageTitle() {
		return Keyword.driver.getTitle();

	}

	public String validatePageSource() {
		return Keyword.driver.getPageSource();
	}
	
	
}