Feature:   Repair Order Functionality
  User Story: As a POS Manager I should be able to create Repair Order
  Background:
    Given the user is on the login page
    And the user logins with valid username and password
    And the user sees the dashboard
   # And the user clicks the more-menu tab
    And the user clicks the Repairs module
    Then the user lands on Repair Orders page

  Scenario: Kanban view of repairs
    Given the user is on the repair order page
    When the user clicks the kanban button
    Then the user views the repair orders in kanban format

  Scenario: Clicking create repair order button
    Given the user is on the repair order page
    When the user clicks the create button on the repair order page
    Then the user lands on new repair order page

  Scenario: Creating & Saving repair orders
    Given the user is on the repair order page
    And the user clicks the create button on the repair order page
    And the new repair order page is displayed
    When the user fills out the repair order details
    And clicks the save button
    Then a new repair order is created

  Scenario: Discarding repair order changes
    Given the user is on the repair order page
    And the user clicks the create button on the repair order page
    And the user fills out the repair order details
    When the user clicks the discard button
    Then a warning message pops up asking confirmation
    And the changes are discarded

  Scenario: Editing a repair order
    Given the user is on the repair order page
    And the user clicks an existing repair order
    When the user clicks the edit button
    And edits the repair order content
    And clicks the save button
    Then the repair order changes are saved

  Scenario: Deleting a repair order
    Given the user is on the repair order page
    And the user clicks an existing repair order
    When the user clicks the action dropdown menu
    And selects the delete button
    And approves the action on the confirmation popup
    Then the repair order is deleted








