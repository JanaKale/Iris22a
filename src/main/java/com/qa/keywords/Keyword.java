package com.qa.keywords;

import org.openqa.selenium.WebElement;

public class Keyword {
	public static void click(WebElement element) {
		element.click();
	}
	public static void sendKeys(WebElement element, String keysTosend) {
		element.sendKeys(keysTosend);
	}	
}
