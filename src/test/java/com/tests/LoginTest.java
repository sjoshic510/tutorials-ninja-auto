package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginTest extends Base{
	
	
	@Test
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

}
