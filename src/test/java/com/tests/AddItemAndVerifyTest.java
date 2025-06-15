package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.DashboardPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class AddItemAndVerifyTest extends Base{
	
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		HomePage home = new HomePage(driver, wait);
		home.getMainMenuMyAccount().click();
		home.getSubMenuLogin().click();
		
		LoginPage login = new LoginPage(driver, wait);
		login.getEmailAddress().sendKeys("testkolagi2468@gmail.com");
		login.getPassword().sendKeys("Admin123");
		login.getBtnLogin().click();
		Thread.sleep(1000);
		Assert.assertEquals(login.getLblMyAccountHeader().getText(), "My Account");
		Thread.sleep(1000);
			
	}
	
	@Test(priority = 2)
	public void searchAndAddProductTocart() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver, wait);
		dashboard.getSearchBx().sendKeys("macbook");
		dashboard.getSearchBtn().click();
		dashboard.scrollToBottom();
		dashboard.getMacbookAddtoCartBtn().click();
		dashboard.scrollUp();
		dashboard.getShoppingCart().click();
		Thread.sleep(2000);
		
		
	}

}
