@smoke
Feature:   Repair Order Functionality
  User Story: As a POS Manager I should be able to create Repair Order

  Background:
    Given the user is on the login page_sa
    And the user logins with valid username and password
    And the user sees the dashboard
    And the user clicks the Repairs module
    Then the user is on the repair order page

  Scenario: Kanban view of repairs
    When the user clicks the kanban button
    Then the user views the repair orders in kanban format

  Scenario: Clicking create repair order button
    When the user clicks the create button on the repair order page
    Then the user is on new repair order page
  @sa
  Scenario Outline: Creating & Saving repair orders
    Given the user clicks the create button on the repair order page
    And the user is on new repair order page
    And the user types in the "<product to repair>"
    And types in the "<product quantity>" in numbers
    And types in the "<customer>" info
#    And types in the "<delivery address>"
    And types in the "<current location>" as an address
    And types in the "<delivery location>" as final destination
    And types in the "<warranty expiration>" date
    And chooses the invoice method
    And clicks the save button
    Then a new repair order is created
Examples:
  | product to repair              | product quantity | customer                         | delivery address | current location | delivery location | warranty expiration |
  | AI-007-CommunityProtectorRobot | 333333           | CAU Ministry of Internal Affairs | CAU MIA Balkh    | SAA              | SAA               | 11/11/2037          |
  | AirBusMoon-EarthLine           | 444              | South Bantustan                  | SB Babanango     | SAA              | SAA               | 04/03/2044          |
  | AirShuttle GalacticTour        | 77               | Indian Union                     | NorthWest Sindh  | SAA              | SAA               | 07/07/2077          |


#  Scenario: Discarding repair order changes
#    Given the user clicks the create button on the repair order page
#    When the user fills out the repair order details
#    And the user clicks the discard button
#    Then a warning message pops up asking confirmation
#    And the changes are discarded
#
#  Scenario: Editing a repair order
#    And the user clicks an existing repair order
#    When the user clicks the edit button
#    And edits the repair order content
#    And clicks the save button
#    Then the repair order changes are saved
#
#  Scenario: Deleting a repair order
#    And the user clicks an existing repair order
#    When the user clicks the action dropdown menu
#    And selects the delete button
#    And approves the action on the confirmation popup
#    Then the repair order is deleted








