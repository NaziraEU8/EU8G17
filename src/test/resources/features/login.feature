Feature: Centrilli app login feature
  User Story:
  As a user, i should be able to login with correct credentials. And dashboard should be displayed.

  Account is: posmanager

  Background: For the scenarios in the feature file, user is expected to be in login page
    Given user is in login page


  Scenario: Login as posmanager
    When user enters username "posmanager105@info.com" and password "posmanager"
    And  user click login button
    Then user should see the title #inbox - Odoo