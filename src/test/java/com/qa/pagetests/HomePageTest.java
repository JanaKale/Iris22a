package com.qa.pagetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	/*
	 * @author Kale Jana
	 */
	
	@Test
	public void verifyHomePageTitle() {
		HomePage Homepage = new HomePage();
		String expTitle="nopCommerce demo store 1";
		String actTitle=Homepage.validateHomePageTitle();
		Assert.assertEquals(actTitle,expTitle ,"Expected Title didn't match "+actTitle);
	}

	

}
