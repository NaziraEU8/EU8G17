package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.OdometerFunctionPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;

public class Fleet_Vehicle_OdometerFunction_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    OdometerFunctionPage odometerFunctionPage =new OdometerFunctionPage();

    @When("user click on the left side of page button Vehicle Odometer")
    public void userClickOnTheLeftSideOfPageButtonVehicleOdometer() {
        odometerFunctionPage.vehiclesOdometerButton.click();
    }

    @When("User Click on the create button.")
    public void user_click_on_the_create_button() {
        BrowserUtils.sleep(2);
        odometerFunctionPage.createButton.click();

    }
    @When("User fill the fields with the information")
    public void user_fill_the_fields_with_the_information() {
        odometerFunctionPage.vehicleDropButton.click();
        odometerFunctionPage.selectNameVehicleButton.click();
        odometerFunctionPage.OdometerValueButton.clear();
        odometerFunctionPage.OdometerValueButton.sendKeys("10000");
        BrowserUtils.sleep(2);
        odometerFunctionPage.dateValue.click();

    }
    @When("user click on the save button")
    public void user_click_on_the_save_button() {
        odometerFunctionPage.saveButton.click();

    }

    @Then("user verify if pages title change")
    public void user_verify_if_pages_title_change() {
        BrowserUtils.sleep(2);
        String expectedTitle = "Audi/A1//2022-07-18 - Odoo";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }





    @Given("user is on the centrilli login`main page")
    public void userIsOnTheCentrilliLoginMainPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user writes username and password")
    public void userWritesUsernameAndPassword() {

        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }



    @Then("user click on Fleet module")
    public void userClickOnFleetModule() {

        odometerFunctionPage.moreDropDown.click();
        BrowserUtils.sleep(2);
        odometerFunctionPage.fleetModule.click();
    }


}
