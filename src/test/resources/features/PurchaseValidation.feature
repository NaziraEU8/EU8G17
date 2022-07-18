Feature: Manager should be able to create new PURCHASE - Vendor Bill

  @bill
  Scenario Outline: Verify user is able to create a vendor bill
    Given user is in login page
    When user should be able to click Purchase tab
    And  verify the Purchase page is displayed
    And  user should be able to click on Create button
    And  user should select "<Vendor Name>" and click Add an Item link
    And  user should select "<Product>" and add Scheduled Date
    And  user should click Save button
    And  user should verify the Vendor Bill created successfully
    And  user should be able to click Edit button
    And  user should select "<Vendor Name Two>"
    And user should be able to click Discard button
    And user should see the warning message and click Ok button
    And user should be able to verify no change is applied
    And user should click on Cancel button
    And user should be able to click Actions dropdown button and click Delete button
    And user should see Confirmation textbox and click Ok button
    And user should verify vendor bill iis deleted successfully

    Examples: Test data
    |Vendor Name|Product|Vendor Name Two|
    |ACD(copy)  |[13]Ice Cream|AAAAA    |
