package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddRemoveElemntsPage {

	private WebDriver driver;

	public AddRemoveElemntsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By addElement = By.xpath("//button[text()='Add Element']");
	private By deleteElement = By.xpath("//button[text()='Delete']");
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean isAddElementDisplayed() {
		return driver.findElement(addElement).isDisplayed();
	}
	
	public void clickOnAddElementButton() {
		driver.findElement(addElement).click();
	}
	
	public boolean isDeleteElementDisplayed() {
		boolean isDisplayed;
		try {
			isDisplayed = driver.findElement(deleteElement).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Delete Button does not exist on UI");
			isDisplayed = false;
		}
		return isDisplayed;
	}
	
	public void clickOnDeleteElementButton() {
		driver.findElement(deleteElement).click();
	}
}
