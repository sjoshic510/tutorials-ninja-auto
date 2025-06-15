package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public DashboardPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	private By macbookAddtoCartBtn = By.xpath("(//span[normalize-space()='Add to Cart'])[1]");
	private By shoppingCart = By.xpath("//span[normalize-space()='Shopping Cart']");
	private By searchBx = By.xpath("//input[@placeholder='Search']");
	private By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");

	
	public WebElement getMacbookAddtoCartBtn() {
		return driver.findElement(macbookAddtoCartBtn);	
	}
	
	public WebElement getShoppingCart() {
		return driver.findElement(shoppingCart);
		
	}
	
	public WebElement getSearchBx() {
		return driver.findElement(searchBx);	
	}
	
	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);	
	}
	
	public void scrollToBottom() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,800)");
		 Thread.sleep(2000);
	}
	
	public void scrollUp() throws InterruptedException {
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
	    js.executeScript("window.scrollBy(0,-800)");
	    Thread.sleep(2000);
	}
}
