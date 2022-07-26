
Feature: POS Manager should be able to create new Point Of Sale Configuration
  #User story no: TWL-339

  Background: For the following scenarios user is expected to be logged in as POS Manager
  at centrilli and clicked Point of Sale
    Given user is on the centrilli login page
    And user enters username and password as POS Manager
    And user clicks on Point of Sale on the Navigation Bar
    Then user clicks Point of Sale on the Dashboard

  @taulant
  Scenario: Verification of POS Manager being able to create new  Point Of Sale
    When User clicks create button
    And User fills at least the minimum required field with information
    And User clicks save button
    Then Verify that specific Point of Sale have been created


  Scenario: Verify that the user can switch Kanban-List view
    When No matter if he is in kaban or not user clicks list then clicks kaban again
    Then Verify that user is in kaban mode
    And User clicks list mode
    Then Verify that user is in list mode


  Scenario: Verify that the user can discard changes
    When User clicks create button
    And User clicks discard button
    Then Create button is clickable

  Scenario: Verify that the user can edit  Point Of Sale
    When Picks a Point of Sale
    And After user edits it
    And User is able to save
    Then Create button is in the new page is clickable


  Scenario: Verify that the user can delete  Point Of Sale
    When Picks a any Point of Sale
    And User clicks action and then delete
    When User goes to the list
    Then Point of Sale is not on the list anymore
