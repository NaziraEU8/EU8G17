Feature: As a user I should Verify that I can create a new Odometer function

  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password
    Given user should see inbox page
    Then user click in Fleet module

  Scenario: create new Vehicle Odometer Function
    When user click on the left side of page button "Vehicle Odometer"
    And User Click on the create button.
    And User fill the fields with the information
    And user click on the save button
    Then user verify pages title