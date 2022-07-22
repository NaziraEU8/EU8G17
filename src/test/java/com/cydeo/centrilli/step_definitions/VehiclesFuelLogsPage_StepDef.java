package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.VehiclesFuelLogsPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class VehiclesFuelLogsPage_StepDef {

    LoginPage loginPage = new LoginPage();
    VehiclesFuelLogsPage vehiclesFuelLogsPage = new VehiclesFuelLogsPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user clicks on the more menu")
    public void the_user_clicks_the_more_menu() {
        BrowserUtils.waitForVisibility(loginPage.inboxSubTitle,5);
        vehiclesFuelLogsPage.moreMenu.click();
    }
    @Then("user clicks on the fleet button")
    public void the_user_clicks_the_fleet_button() {
        vehiclesFuelLogsPage.fleetButton.click();
    }

    @And("user clicks on the Vehicles Fuel Logs")
    public void user_clicks_on_the_vehicles_fuel_logs() {
        vehiclesFuelLogsPage.vehiclesFuelLogs.click();
    }

    @Then("user sees Vehicle Fuel Logs page")
    public void user_sees_vehicle_fuel_logs_page() {
        BrowserUtils.waitFor(3);
        String expectedTitle = "Vehicles Fuel Logs - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("user clicks on create button")
    public void user_clicks_on_create_button() {
        vehiclesFuelLogsPage.create_Button.click();
    }

    @Then("user sees Vehicle Fuel Logs New page")
    public void user_sees_vehicle_fuel_logs_new_page() {
        BrowserUtils.waitFor(3);
        String expectedTitle = "New - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("user clicks on vehicle dropdown button")
    public void user_clicks_on_vehicle_dropdown_button() {
        vehiclesFuelLogsPage.vehicleDetails.click();
    }

    @Then("user clicks on create and edit button")
    public void user_clicks_on_create_and_edit_button() {
        vehiclesFuelLogsPage.createAndEdit.click();
    }

    @Then("user fills in all the information")
    public void user_fills_in_all_the_information() {
        vehiclesFuelLogsPage.model.click();
        vehiclesFuelLogsPage.licensePlate.click();
        vehiclesFuelLogsPage.tags.click();
        vehiclesFuelLogsPage.driverName.click();
        vehiclesFuelLogsPage.location.click();
        vehiclesFuelLogsPage.chassisNumber.click();
        vehiclesFuelLogsPage.modelYear.click();
        vehiclesFuelLogsPage.lastOdometer.click();
        vehiclesFuelLogsPage.kmOrMiles.click();
        vehiclesFuelLogsPage.immatriculationDate.click();
        vehiclesFuelLogsPage.catalogValue.click();
        vehiclesFuelLogsPage.residualValue.click();
        vehiclesFuelLogsPage.seatsNumber.click();
        vehiclesFuelLogsPage.doorsNumber.click();
        vehiclesFuelLogsPage.carColor.click();
        vehiclesFuelLogsPage.transmissionType.click();
        vehiclesFuelLogsPage.fuelType.click();
        vehiclesFuelLogsPage.co2Emissions.click();
        vehiclesFuelLogsPage.horsePower.click();
        vehiclesFuelLogsPage.hpTax.click();
        vehiclesFuelLogsPage.power.click();

    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() {
        vehiclesFuelLogsPage.save_Button.click();
    }

    @Then("user fills rest information")
    public void user_fills_rest_information() {
        vehiclesFuelLogsPage.odometerValue.click();
        vehiclesFuelLogsPage.liter.click();
        vehiclesFuelLogsPage.pricePerLiter.click();
    }
    @Then("user clicks on save button2")
    public void user_clicks_on_save_button2() {
        vehiclesFuelLogsPage.saveB.click();
    }



}
