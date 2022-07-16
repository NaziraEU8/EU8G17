package com.cydeo.centrilli.step_definitions;


import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.VehicleCostsDetails_Page;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehicleCostsDetail_StepDefinition {

    LoginPage loginPage = new LoginPage();
    VehicleCostsDetails_Page vehicleCostsDetails_page = new VehicleCostsDetails_Page();


    @Given("the user clicks the more-menu tab")
    public void the_user_clicks_the_more_menu_tab() {

        BrowserUtils.waitForVisibility(loginPage.inboxSubTitle,10);
        vehicleCostsDetails_page.menuTab.click();

    }
    @Given("the user clicks the fleet dropdown-menu")
    public void the_user_clicks_the_fleet_dropdown_menu() {
    vehicleCostsDetails_page.fleetBTM.click();
    }
    @Given("the user clicks the Vehicle Costs button")
    public void the_user_clicks_the_vehicle_costs_button() {
    vehicleCostsDetails_page.vehicle_Costs.click();
    }
    @Given("the user clicks the create button")
    public void the_user_clicks_the_create_button() {
       BrowserUtils.waitFor(5);
      //  BrowserUtils.waitForClickablility(vehicleCostsDetails_page.createBTM,10);
        vehicleCostsDetails_page.createBTM.click();
    }
    @Then("the user lands on Vehicle Costs New page")
    public void theUserLandsOnVehicleCostsNewPage() {
        BrowserUtils.waitFor(3);

        String expectedTitle = "New - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

        }

    @And("the user clicks the vehicle dropdown-menu")
    public void theUserClicksTheVehicleDropdownMenu() {
        vehicleCostsDetails_page.vehicleBox.click();
    }

    @And("the user selects search more option")
    public void theUserSelectsSearchMoreOption() {
        vehicleCostsDetails_page.searchMoreVehicle.click();

    }

    @And("the user chooses one of the vehicle options")
    public void theUserChoosesOneOfTheVehicleOptions() {
        BrowserUtils.selectRandomElementFromTable(vehicleCostsDetails_page.searchVehicleList).click();
        BrowserUtils.waitFor(3);
    }



    @And("the user clicks the type dropdown-menu")
    public void theUserClicksTheTypeDropdownMenu() {
        vehicleCostsDetails_page.typeBox.click();
    }

    @And("the user selects one of the options in the type dropdown menu.")
    public void theUserSelectsOneOfTheOptionsInTheTypeDropdownMenu() {
        vehicleCostsDetails_page.searchMoreType.click();
        BrowserUtils.selectRandomElementFromTable(vehicleCostsDetails_page.searchTypeList).click();
    }


    @And("the user enters the price of vehicle in the Total Price inputbox")
    public void theUserEntersThePriceOfVehicleInTheTotalPriceInputbox() {
        vehicleCostsDetails_page.totalPriceBox.clear();
        vehicleCostsDetails_page.totalPriceBox.click();
        vehicleCostsDetails_page.totalPriceBox.sendKeys(ConfigurationReader.getProperty("price"));
    }

    @And("the user provides the details in the cost description")
    public void theUserProvidesTheDetailsInTheCostDescription() {
        vehicleCostsDetails_page.costDescriptionBox.sendKeys(ConfigurationReader.getProperty("costs.description"));
    }


    @And("the user enter the date in month-day-year format")
    public void theUserEnterTheDateInMonthDayYearFormat() {
        vehicleCostsDetails_page.dateBox.clear();
        vehicleCostsDetails_page.dateBox.click();
         vehicleCostsDetails_page.dateBox.sendKeys(ConfigurationReader.getProperty("date"));
    }


    @And("the user clicks save button")
    public void theUserClicksSaveButton() {
       vehicleCostsDetails_page.saveBTM.click();
    }

    @Then("the user sees cost details for the chosen vehicle.")
    public void theUserSeesCostDetailsForTheChosenVehicle() {
       BrowserUtils.waitFor(5);
     //  BrowserUtils.waitForClickablility(vehicleCostsDetails_page.editBTM,10);
       vehicleCostsDetails_page.editBTM.isDisplayed();

    }
}
