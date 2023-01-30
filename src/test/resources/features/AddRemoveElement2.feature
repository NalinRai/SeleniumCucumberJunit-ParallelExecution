#Author: Nalin Rai
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add and Remove Element
  

  @tag1
  Scenario: Add element
    Given user is on Herokuapp Home Page
    When user clicks on Add/remove Elements link
    Then user is navigate Add/remove Elements Page
    And user clicks on Add Element button
    Then Delete button is displayed
    

  @tag2
  Scenario: Remove element
    Given user is on Herokuapp Home Page
    When user clicks on Add/remove Elements link
    Then user is navigate Add/remove Elements Page
    And user clicks on Add Element button
    Then Delete button is displayed
    And user clicks on delete button
    Then delete button is disappeared from ui
