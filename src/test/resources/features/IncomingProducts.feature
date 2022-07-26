Feature: As a POS Manager I should be able to create  Incoming Product


  Background: For the followings  scenarios, user is expected to login before
    Given User  is on the  login page.
    Given User enters with valid credential as sales manager
    Given User clicks on Purchases module
    Given User clicks on Incoming Products


 Scenario: Verify that the user can create new  Incoming Product

  When User click on Create button on incoming products
   And User fills out the empty boxes
   Then User should be able save the new Incom product.

 Scenario: Verify that the user can switch Kanban-List view
   When User click on Kanban button on Incoming product list
   Then User should be able to see kanban view
   When User click on list button
   Then User should be able to see list view.

Scenario: Verify that the user can discard changes
  When user clicks on creat button on Incom products list
  And user fills some requirement field on incom product list
  And user clicks on Discard button.
  And user clicks ok on Warning massage
  Then user is able to see discard changes

  Scenario: Verify that the user can edit  Incoming Product
    When user clicks on existing incoming product
    And user clicks on action button.
    And user clicks on Delete dropdown button.
    And user confirms promt massage
    Then user should be able delete incom product.




