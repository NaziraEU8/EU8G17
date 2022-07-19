Feature: Centrilli app vehicles services log feature
  User Story: As a user i'm be able to create new vehicle services log so i can see it in vehicles services page


  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password
    Given user should see inbox page
    Then user click in Fleet module

@wip
  Scenario: create new Vehicle Service Log
    When user click in create button
    And User fill the field with information
    And user click save button
    Then user verify pages title


  Scenario: create new Vehicle Service Log by clicking discard
    When user save the amount of vehicle services
    And user click in create button
    And User fill the field with information
    And user click discard button
    And user click OK on pop up table
    Then user verify the amount of vehicle services


  Scenario: create a new vehicle services just with required information
    When user click in create button
    And User fill the required field with information
    And user click save button
    Then user verify pages title


  Scenario: Create a new vehicle by writing letters for Total Price and Odometer
    When user click in create button
    And User write invalid information for total price and odometer
    And user click save button
    Then user verify notification pop up


  Scenario: Delete vehicle services log
    When user save the amount of vehicle services
    And user click over the check box from the list
    And user click delete button in Actions dropdown
    Then user verify total number of vehicles services