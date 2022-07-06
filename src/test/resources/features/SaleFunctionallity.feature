#
#Feature:Sale Functionality
#  User Story:
#  As a Sales Manager, I should be able to create and edit a new customer from "Sales" module
#
#  Background: For the scenarios in the feature file, user is expected to be on login page
#    Given user is on the Centrilli login page
#    When user enters email "posmanager10@info.com"
#    And  user enters password password "posmanager"
#    Then user click login button
#
#
#
#  Scenario Outline: New customer created
#    Given user is on "sale" dashboard
#    And user click sale module
#    When user click customer module
#    Then user click  create button
#    Then user write the new customer name "<Name>"
#    And user writes the new customer address "<Address>"
#    And user writes the new customer company "<Company>"
#    And user writes the new customer Job position"<Job Position>"
#    Then user click save button
#
#    Examples:
#      | Name | Address    | Company     | Job Position    |  |
#      | Anna | Jamesville | ABC Company | Sales Directory |  |
#
#
