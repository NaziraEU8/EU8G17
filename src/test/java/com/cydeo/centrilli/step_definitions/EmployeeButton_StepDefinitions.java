package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.EmployeeButtonPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EmployeeButton_StepDefinitions {

    EmployeeButtonPage employeeButtonPage = new EmployeeButtonPage();

    @Given("user is on the centrilli login page fation")
    public void user_is_on_the_centrilli_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("user enters username and password fation")
    public void user_enters_username_and_password() {
        employeeButtonPage.loginInput.sendKeys(ConfigurationReader.getProperty("email"));
        employeeButtonPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        employeeButtonPage.btnButton.click();

    }
    @Given("user should see inbox page")
    public void user_should_see_inbox_page() {
        Assert.assertTrue(employeeButtonPage.InboxHeader.isDisplayed());
    }

    @And("user clicks on employee module")
    public void userClicksOnEmployeeModule() {
        BrowserUtils.sleep(2);
        employeeButtonPage.employeeButton.click();
    }

    @Then("user should see employee title")
    public void userShouldSeeEmployeeTitle() {
        BrowserUtils.sleep(5);
        String expectedTitle = "Employees - Odoo";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

    @And("user clicks on list button on employee")
    public void userClicksOnListButton() {
        employeeButtonPage.listButton.click();
    }

    @Then("user should be able to see listed employees")
    public void userShouldBeAbleToSeeListedEmployees() {
        Assert.assertTrue(employeeButtonPage.listDisplayed.isDisplayed());
    }

    @And("user clicks on kanban button on employee")
    public void userClicksOnKanbanButton() {
        BrowserUtils.sleep(3);
        employeeButtonPage.kanbanButton.click();
    }

    @And("user clicks on search input box on employee")
    public void userClicksOnSearchInputBox() {
        BrowserUtils.sleep(3);
        employeeButtonPage.searchBox.click();
    }

    @And("user searches for {string} and presses enter")
    public void userSearchesForAndPressesEnter(String arg0) {
        employeeButtonPage.searchBox.sendKeys(arg0+ Keys.ENTER);

    }

    @Then("user should be able to see david listed contacts")
    public void userShouldBeAbleToSeeDavidListedContacts() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(employeeButtonPage.davidEmployeeContact.getText().contains("David"));
    }

    @Then("user clicks on create button on employee")
    public void userClicksOnCreateButton() {
        employeeButtonPage.createButton.click();

    }





}
