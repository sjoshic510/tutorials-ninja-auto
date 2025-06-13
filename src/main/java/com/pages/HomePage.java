package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;
	
	
	public HomePage(WebDriver driver, WebDriverWait wait){
		this.driver = driver;
		this.wait = wait;
	}
	
	private By menuMyAccount = By.xpath("//span[normalize-space()='My Account']") ;
	private By sbMenuRegister = By.xpath("//a[normalize-space()='Register']");
	private By sbMenuLogin = By.xpath("//a[normalize-space()='Login']");
	
	
	public WebElement getMainMenuMyAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(menuMyAccount));
		return driver.findElement(menuMyAccount);
		
	}
	
	public WebElement getSubMenuLogin() {
		return  driver.findElement(sbMenuLogin);
	}
	
	public WebElement getSubMenuRegister() {
		return  driver.findElement(sbMenuRegister);
	}
}
