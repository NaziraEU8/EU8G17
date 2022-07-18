Feature: As a user I should Verify that I can create a new Odometer function

  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login`main page
    Given user writes username and password
    Then user click on Fleet module

  @roksi
  Scenario: create new Vehicle Odometer Function
    When user click on the left side of page button Vehicle Odometer
    And User Click on the create button.
    And User fill the fields with the information
    And user click on the save button
    Then user verify if pages title change