@taulant
Feature: POS Manager should be able to create new Point Of Sale Configuration
  #User story no: TWL-339

  Background: For the following scenarios user is expected to be logged in as POS Manager
  at centrilli and clicked Point of Sale
    Given user is on the centrilli login page
    Given user enters username and password as POS Manager
    Given user should see Point of Sale on the navigation bar
    Given user clicks on Point of Sale

  Scenario: Verification of POS Manager being able to create new  Point Of Sale
    Given User sees create button in the dashboard
    When User clicks create button
    And User
    And User


  Scenario: Verify that the user can switch Kanban-List view

  Scenario: Verify that the user can discard changes

  Scenario: Verify that the user can edit  Point Of Sale

  Scenario: Verify that the user can delete  Point Of Sale