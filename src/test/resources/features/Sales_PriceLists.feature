Feature: POS Manager should be able to create SALES / PRICE LISTS
  As a SALES Manager I should be able to create Price Lists

  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password as sales manager
    Given user should see inbox page
    Given user clicks on sales module
    Given user clicks on pricelists button


  Scenario: Verify that the user can create new PRICE LISTS
    When user clicks on create button on orders
    And user fills all the empty fields on pricelists
    Then user should be able to save new pricelist

  @fation
  Scenario: Verify that the user can switch Kanban-List view
    When user clicks on kanban button on pricelists
    Then user should be able to see kanban view
    When user clicks on list button on pricelists
    Then user should be able to see list view

  Scenario: Verify that the user can discard changes
    When user clicks on create button on pricelists
    And user fills minimum requirement field on pricelists
    And user clicks on discard button
    And user clicks on on the warning message
    Then user is able to discard changes

  Scenario: Verify that the user can edit ORDERS
    When user clicks on an existing pricelist
    And user clicks on action button
    And user clicks on delete dropdown button
    And user confirms prompting dialog
    Then user should be able to delete pricelist successfully




