package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public RegisterPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private By txtFirstName = By.xpath("//input[@id='input-firstname']");
	private By txtLastName = By.xpath("//input[@id='input-lastname']");
	private By txtEmail = By.xpath("//input[@id='input-email']");
	private By txtTelephone = By.xpath("//input[@id='input-telephone']");
	private By txtPassword = By.xpath("//input[@id='input-password']");
	private By txtPasswordConform = By.xpath("//input[@id='input-confirm']");
	private By btnContinueBtn = By.xpath("//input[@value='Continue']");
	private By chkIReadPolicy = By.xpath("//input[@name='agree']");
	
	 
	public WebElement getFirstName() {
		return driver.findElement(txtFirstName);
	}
	
	public WebElement getLastName() {
		return driver.findElement(txtLastName);
	}
	
	public WebElement getEmail() {
		return driver.findElement(txtEmail);
	}
	
	public WebElement getTelephone() {
		return driver.findElement(txtTelephone);
	}
	
	public WebElement getPassword() {
		return driver.findElement(txtPassword);
	}
	
	public WebElement getPasspordConform() {
		return driver.findElement(txtPasswordConform);
	}
	
	public WebElement getchkIReadPolicy() {
		return driver.findElement(chkIReadPolicy);
	}
	
	public WebElement getContinueBtn() {
		return driver.findElement(btnContinueBtn);
	}
	
}
