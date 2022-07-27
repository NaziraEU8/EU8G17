Feature: Create A New Vehicles Fuel Logs Function

  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the login page
    Given user enters posmanager username
    Given user enters posmanager password
    Then user clicks to login button
    Then user clicks on the more menu
    Then user clicks on the fleet button

  @carla
  Scenario: User should be able to create a new vehicles fuel logs
    When user clicks on the Vehicles Fuel Logs
    Then user sees Vehicle Fuel Logs page
    And user clicks on create button
    Then user sees Vehicle Fuel Logs New page
    Then user clicks on vehicle dropdown button
    Then user clicks on create and edit button
    Then user fills in all the information
    Then user clicks on save button
    Then user fills rest information
    Then user clicks on save button2





