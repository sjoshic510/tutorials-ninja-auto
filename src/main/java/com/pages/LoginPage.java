package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private By txtEmailAddress = By.xpath("//input[@id='input-email']");
	private By txtPassword = By.xpath("//input[@id='input-password']");
	private By btnLogin = By.xpath("//input[@value='Login']");
	private By lblForVerify = By.xpath("//h2[normalize-space()='My Account']");
	
	
	public WebElement getEmailAddress() {
		return driver.findElement(txtEmailAddress);
	}
	

	public WebElement getPassword() {
		return driver.findElement(txtPassword);
	}
	

	public WebElement getBtnLogin() {
		return driver.findElement(btnLogin);
	}
	

	public WebElement getLblMyAccountHeader() {
		return driver.findElement(lblForVerify);
	}
	

}
