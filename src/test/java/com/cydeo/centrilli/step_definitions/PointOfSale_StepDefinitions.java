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
    String name;

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
        name = faker.name().firstName();
        for (WebElement each : pointOfSalePage.listOfNamesOfPointsOfSales) {
            if (each.getText().equals(name)){
                Assert.assertTrue(true);
                break;
            }
        }
    }

    @When("No matter if he is in kaban or not user clicks list then clicks kaban again")
    public void noMatterIfHeIsInKabanOrNotUserClicksListThenClicksKabanAgain() {
        pointOfSalePage.pointOfSaleList.click();
        pointOfSalePage.pointOfSaleKaban.click();
    }

    @Then("Verify that user is in kaban mode")
    public void verifyThatUserIsInKabanMode() {
        Assert.assertTrue(pointOfSalePage.table.isDisplayed());
    }

    @And("User clicks list mode")
    public void userClicksListMode() {
        pointOfSalePage.pointOfSaleList.click();
    }

    @Then("Verify that user is in list mode")
    public void verifyThatUserIsInListMode() {
        Assert.assertTrue(pointOfSalePage.table.isEnabled());
    }

    @And("User clicks discard button")
    public void userClicksDiscardButton() {
        pointOfSalePage.discardButton.click();
    }

    @Then("Create button is clickable")
    public void createButtonIsClickable() {
        Assert.assertTrue(pointOfSalePage.createButton.isDisplayed());
    }

    @When("Picks a Point of Sale")
    public void picksAPointOfSale() {
        BrowserUtils.selectRandomElementFromTable(pointOfSalePage.listOfPointOfSale).click();
    }

    @And("After user edits it")
    public void afterUserEditsIt() {
        pointOfSalePage.editButton.click();
        pointOfSalePage.pointOfSaleNameInputBox.sendKeys(Keys.BACK_SPACE);
    }

    @Then("User is able to save")
    public void userIsAbleToSave() {
        pointOfSalePage.saveButton.click();
    }

    @Then("Create button is in the new page is clickable")
    public void createButtonIsInTheNewPageIsClickable() {
        Assert.assertTrue(pointOfSalePage.createButton2.isEnabled());
    }

    @When("Picks a any Point of Sale")
    public void picksAAnyPointOfSale() {
        WebElement freePick = BrowserUtils.selectRandomElementFromTable(pointOfSalePage.listOfPointOfSale);
        freePick.click();
    }

    @And("User clicks action and then delete")
    public void userClicksActionAndThenDelete() {
        name = pointOfSalePage.title.getText();
        pointOfSalePage.actionButton.click();
        pointOfSalePage.deleteButton.click();
        pointOfSalePage.okButton.click();
    }

    @When("User goes to the list")
    public void userGoesToTheList() {
        pointOfSalePage.pointOfSaleInDash.click();
    }

    @Then("Point of Sale is not on the list anymore")
    public void pointOfSaleIsNotOnTheListAnymore() {
        for (WebElement each : pointOfSalePage.listOfNamesOfPointsOfSales) {
            if (each.getText().equals(name)){
                Assert.fail();
            }
        }
    }


}
