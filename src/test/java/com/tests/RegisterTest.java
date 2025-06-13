package com.tests;

import org.testng.annotations.Test;

import com.base.Base;
import com.pages.HomePage;
import com.pages.RegisterPage;

public class RegisterTest extends Base {
	
	
	@Test
	public void registerTest() throws InterruptedException {
		HomePage home = new HomePage(driver, wait);
		home.getMainMenuMyAccount().click();
		home.getSubMenuRegister().click();
		
		RegisterPage register = new RegisterPage(driver, wait);
		register.getFirstName().sendKeys("John");
		register.getLastName().sendKeys("David");
		register.getEmail().sendKeys("testkolagi2468@gmail.com");
		register.getTelephone().sendKeys("5689483557");
		register.getPassword().sendKeys("Admin123");
		register.getPasspordConform().sendKeys("Admin123");
		register.getchkIReadPolicy().click();
		Thread.sleep(1000);
		register.getContinueBtn().click();
		
	}

}
