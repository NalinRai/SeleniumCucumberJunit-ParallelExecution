package com.stepDefinitions;

import com.pages.AddRemoveElemntsPage;
import com.pages.HerokuappHomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddRemoveElementSteps {
	
	private HerokuappHomePage herokuappHomePage = new HerokuappHomePage(DriverFactory.getDriver());
	private AddRemoveElemntsPage addRemoveElementsPage;

	@Given("user is on Herokuapp Home Page")
	public void user_is_on_herokuapp_home_page() {
	    
		DriverFactory.getDriver().get("http://the-internet.herokuapp.com/");
		System.out.println("Home Page Title is: " + herokuappHomePage.getLoginpageTitle());
	}

	@When("user clicks on Add\\/remove Elements link")
	public void user_clicks_on_add_remove_elements_link() {
	   addRemoveElementsPage = herokuappHomePage.clickOnAddRemoveElementLink();
	}

	@Then("user is navigate Add\\/remove Elements Page")
	public void user_is_navigate_add_remove_elements_page() {
	    System.out.println("Add/Remove Element Page Title is: " + addRemoveElementsPage.getTitle());
	}

	@And("user clicks on Add Element button")
	public void user_clicks_on_add_element_button() {
	    addRemoveElementsPage.clickOnAddElementButton();
	}

	@Then("Delete button is displayed")
	public void delete_button_is_displayed() {
		Assert.assertTrue(addRemoveElementsPage.isAddElementDisplayed());
	}

	@And("user clicks on delete button")
	public void user_clicks_on_delete_button() {
	    addRemoveElementsPage.clickOnDeleteElementButton();
	}

	@Then("delete button is disappeared from ui")
	public void delete_button_is_disappeared_from_ui() {
		
		Assert.assertTrue(addRemoveElementsPage.isDeleteElementDisplayed());
	    
	}
}
