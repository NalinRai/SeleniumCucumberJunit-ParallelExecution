package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHomePage {

	private WebDriver driver;
	
	//1. Constructor
	
	public HerokuappHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//2. By Locators
	private By addRemoveElementLink = By.xpath("//a[text()='Add/Remove Elements']");
	
	
	//3. Page Actions : Behaviours of the page the form of methods
	
	public String getLoginpageTitle() {
		return driver.getTitle();
	}
	
	public boolean isAddRemoveElementLinkDisplayed() {
		return driver.findElement(addRemoveElementLink).isDisplayed();
	}
	
	public AddRemoveElemntsPage clickOnAddRemoveElementLink() {
		driver.findElement(addRemoveElementLink).click();
		return new AddRemoveElemntsPage(driver);
		
	}
}
