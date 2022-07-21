@taulant
Feature: POS Manager should be able to create new Point Of Sale Configuration
  #User story no: TWL-339

  Background: For the following scenarios user is expected to be logged in as POS Manager
  at centrilli and clicked Point of Sale
    Given user is on the centrilli login page
    And user enters username and password as POS Manager
    And user clicks on Point of Sale on the Navigation Bar
    Then user clicks Point of Sale on the Dashboard


  Scenario: Verification of POS Manager being able to create new  Point Of Sale
    When User clicks create button
    And User fills at least the minimum required field with information
    And User clicks save button
    Then Verify that specific Point of Sale have been created

  Scenario: Verify that the user can switch Kanban-List view
#
#  Scenario: Verify that the user can discard changes
#
#  Scenario: Verify that the user can edit  Point Of Sale
#
#  Scenario: Verify that the user can delete  Point Of Sale