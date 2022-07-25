Feature:  As a POS Manager I should be able to create CUSTOMER

  Verify that the user can create new PIPELINE
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit PIPELINE
  Verify that the user can delete PIPELINE


  Background: For the scenarios in the feature file, user is expected to login before
    Given user is on the centrilli login page
    Given user enters username and password as sales manager
    Given user should see inbox page
    Given user is un CRM modul
    Given user click Pipeline in CRM menu

  Scenario: Verify that the user can create new PIPELINE
    When user clicks create button in CRM pipeline
    And user write the data to create an opportunity
    And user clicks create button in create opportunity page
    Then user verify if opportunity is created


  Scenario: Verify that the user can switch Kanban-List view
    When user click list View
    Then user Verify that view is changer into list


  Scenario:  Verify that the user can discard changes
    When user click list View
    And user click on one opportunitie from list
    And user click edit button in opportunities information
    And user change customor name
    And user clicks discard button
    And user click OK in pop up
    Then user verify that the name didn't change

    Scenario: Verify that the user can edit PIPELINE
      When user click list View
      And user click on one opportunitie from list
      And user click edit button in opportunities information
      And user change customor name
      And user clicks save oportunity button
      Then user verify if changes are made



