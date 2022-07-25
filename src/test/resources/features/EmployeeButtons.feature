

Feature: I should Verify that all buttons work as expected at the employees stage,
  Every button must be functioning at the employees stage while i use the module as a posmanager


  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page fation
    Given user enters username and password fation
    Given user should see inbox page
    Given user clicks on employee module


  Scenario: User should be able to click Employee module and see Employee title and clicks on list and kanban buttons and
  search on input search box
    Then user should see employee title
    And user clicks on list button on employee
    Then user should be able to see listed employees
    And user clicks on kanban button on employee
    And user clicks on search input box on employee
    And user searches for "David" and presses enter
    Then user should be able to see david listed contacts



  Scenario: User should be able to create a new employee contact
    When user clicks on create button on employee
    And user fills all the fields in employee
    And user clicks save button in employee
    Then user should see the new created employee contact


  Scenario: After creating Employee, the "Employee created" message appears under full profile.
    When user clicks on create button
    And user fills minimum requirement field in employee
    And user clicks save button in employee
    #Then user should be able to see employee created message


  Scenario: User should be able to see created employee is listed after clicking the Employees module.
    When user clicks on create button
    And user fills minimum requirement field in employee
    And user clicks save button in employee
    And user clicks on employee module
    Then user should be able to see new created employee listed


    Scenario: User can change the name of the employee, after creating new Employee
      When user clicks on create button
      And user fills minimum requirement field in employee
      And user clicks save button in employee
      And user clicks edit button
      And user edits minimum requirements field
      And user clicks save button in employee

