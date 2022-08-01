@smoke
@regression
@test
Feature:Sale Functionality
  As a Sales Manager, I should be able to create and edit a new customer from "Sales" module
  Every button must be functi at the sale stage while I use the module as a posmanager

  Background:  For the scenarios in the feature file, user is expected to login before
    Given user is on the login page for sale functionality
    Given user enters username and password to login
    Given user clicks on sale module for customer dashboard


  Scenario: User should be able that all buttons work as expected at the Customers
                homepage stage
    Given user is on "sale" dashboard
   Then  user clicks on customer module
    And user clicks on list button
    Then user should be able to see listed customers
    And user clicks on kanban button
    Then user should be able to see listed customers from kanban
    And user clicks on forward and backward button
    Then user should be able to see listed customers
    And user click on search input box
    And user search for "Anna" and presses enter
    Then user should be able to se Anna customer listed


  Scenario: User should be able to create  new customer from "Sales" module

    When user clicks on customer button
    Then user clicks create button for customer
    And user fills all the fields for the customer
    And user clicks save button at customer created
    Then user should see the new created customer from Sale module


  Scenario: User should be able to edit the name of the customer, after creating new customer
    When user is on customer data
    And user clicks on  edit button for customer
    And user changes customer name
    And user clicks save button at customer created
   Then user should see the customer name is changed


   Scenario: Verify that User should be able to see created customer is listed after
              clicking the Customers module.

     When user clicks on customer module
     Then user should be able to see new created customer listed

  Scenario:User should be able to see that the page title changes to customer
           name after creating the new customer
    Given user is on "sale" dashboard
    When user clicks on costumer module
    Then user clicks create button for customer
    And user fills minimum requirement field for customer
    And user clicks save button at customer created
    Then user should be able to see the title change to customer name

@test
    Scenario: User should be able to import a file
      When user clicks import button
      And user chooses the file to import
      And user clicks load a file button
      Then user should see the file is imported
