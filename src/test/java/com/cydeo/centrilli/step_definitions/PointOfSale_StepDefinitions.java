package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.PointOfSalePage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PointOfSale_StepDefinitions{

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    PointOfSalePage pointOfSalePage = new PointOfSalePage();
    Faker faker = new Faker();
    String name = faker.name().firstName();

    @Given("user enters username and password as POS Manager")
    public void user_enters_username_and_password_as_pos_manager() {
        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @And("user clicks on Point of Sale on the Navigation Bar")
    public void userClicksOnPointOfSaleOnTheNavigationBar() {
        BrowserUtils.waitForVisibility(pointOfSalePage.pointOfSaleInNavBar, 10);
        pointOfSalePage.pointOfSaleInNavBar.click();
    }

    @Then("user clicks Point of Sale on the Dashboard")
    public void userClicksPointOfSaleOnTheDashboard() {
        BrowserUtils.waitForVisibility(pointOfSalePage.pointOfSaleInDash, 10);
        pointOfSalePage.pointOfSaleInDash.click();
    }

    @When("User clicks create button")
    public void user_clicks_create_button() {
        BrowserUtils.waitForVisibility(pointOfSalePage.createButton, 10);
        pointOfSalePage.createButton.click();
    }

    @And("User fills at least the minimum required field with information")
    public void userFillsAtLeastTheMinimumRequiredFieldWithInformation() {
        pointOfSalePage.pointOfSaleNameInputBox.sendKeys(name);
        pointOfSalePage.paymentMethodInputBox.click();
        pointOfSalePage.cash123.click();
        BrowserUtils.sleep(3);
        pointOfSalePage.inventoryInputBox.click();
        pointOfSalePage.searchMore.click();
        BrowserUtils.selectRandomElementFromTable(pointOfSalePage.listOfInventoryOptions).click();
    }

    @And("User clicks save button")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(3);
        pointOfSalePage.saveButton.click();
    }

    @Then("Verify that specific Point of Sale have been created")
    public void verifyThatSpecificPointOfSaleHaveBeenCreated() {
        pointOfSalePage.pointOfSaleInDash.click();
        for (WebElement each : pointOfSalePage.listOfNamesOfPointsOfSales) {
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                break;
            }
        }
    }
}
