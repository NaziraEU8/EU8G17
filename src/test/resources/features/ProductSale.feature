
Feature: Creating new Products
  User story: As a POS Manager I should be able to create SALES/Products


  Background:  For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password as posmanager
     Given user clicks on sale button


    Scenario: User should be able to create new Sales Products
           When user clicks products button
           And user clicks create button on product
           And user enters product name and price
          Then user clicks save button for product
          Then product can be found in the search

    @test @TWL-349
      Scenario: User should be able to discard changes for creating new product
        Given user is on product dashboard
        Then user clicks create button for product
        And user fills the products name
        And user clicks discard button displayed for product
        Then user sees the discard is done for product



        @TWL-351
        Scenario: User should be able to switch Kanban-List view
          Given user is on product  dashboard
          Then user clicks on kanban button for product
          And  user should be able to see Kanban list
          Then user clicks on list button for product
          And user should be able to see list view of products



          @TWL-352
          Scenario: User should be able to  edit a products
            Given user search for the product
            And user clicks edit button for product
            And user changes the data of product
            And user clicks save button in product
            Then user should see the product edit is done


             @TWL-353
            Scenario: User should be able to delete a product
              Given user is on product data
              Then user clicks action button on product
              And user clicks ok button on product
              Then user should see the confirmation message and clicks ok for product
              And user should see the product is deleted









