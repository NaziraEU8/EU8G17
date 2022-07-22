
Feature: Creating new Products
  User story: As a POS Manager I should be able to create SALES/Products


  Background:  For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password as posmanager
     Given user clicks on sale button


    Scenario: User should be able to create new Sales Products
           When user clicks products button
           And user clicks create button
           And user enters product name and price
          Then user clicks save button for product
          Then product can be found in the search


      Scenario: User should be able to discard changes
        Given user is on product dashboard
        Then user clicks create button
        And user fills the products name
        And user clicks discard button displayed
        Then user sees the discard is done



        Scenario: User should be able to switch Kanban-List view
          Given user is on product  dashboard
          Then user clicks on kanban button for product
          And  user should be able to see Kanban list
          Then user clicks on list button for product
          And user should be able to see list view of products




          Scenario: User should be able to  edit a products
            Given user search for the product
            And user clicks edit button
            And user changes the data
            And user clicks save button
            Then user should see the product edit is done


            Scenario: User should be able to delete a product
              Given user is on product data
              Then user clicks action button
              And user clicks ok button
              Then user should see the confirmation message and clicks ok
              And user should see the product is deleted









