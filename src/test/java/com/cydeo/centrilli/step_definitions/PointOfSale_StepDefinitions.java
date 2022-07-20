package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PointOfSale_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("user enters username and password as POS Manager")
    public void user_enters_username_and_password_as_pos_manager() {
        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }
    @Given("user should see Point of Sale on the navigation bar")
    public void user_should_see_point_of_sale_on_the_navigation_bar() {

    }
    @Given("user clicks on Point of Sale")
    public void user_clicks_on_point_of_sale() {

    }
    @Given("User sees create button in the dashboard")
    public void user_sees_create_button_in_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks create button")
    public void user_clicks_create_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User")
    public void user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
