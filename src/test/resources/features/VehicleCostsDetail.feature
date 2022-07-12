

Feature: Vehicle Costs Detail Functionality

  Background:

        Given the user is on the login page
          And the user logins with valid username and password
          And the user sees the dashboard
          And the user clicks the more-menu tab
          And the user clicks the fleet dropdown-menu
          And the user clicks the Vehicle Costs button
          And the user clicks the create button
         Then the user lands on Vehicle Costs New page

  @saadet
  Scenario:
           When the user clicks the vehicle dropdown-menu
           And the user selects search more option
           And the user chooses one of the vehicle options
           And the user clicks the type dropdown-menu
           And the user selects one of the options in the type dropdown menu.
           And the user enters the price of vehicle in the Total Price inputbox
           And the user provides the details in the cost description
           And the user enter the date in month-day-year format
           And the user clicks save button
          Then the user sees cost details for the chosen vehicle.






