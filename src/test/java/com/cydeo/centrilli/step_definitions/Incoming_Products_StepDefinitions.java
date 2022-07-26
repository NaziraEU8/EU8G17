package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;

public class Incoming_Products_StepDefinitions {
    LoginPage loginPage= new LoginPage();
    BasePage basePage=new BasePage();


    @Given("User enters with valid credential as sales manager")
    public void user_enters_with_valid_credential_as_sales_manager() {
        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }
    @Given("User clicks on Purchases module")
    public void user_clicks_on_purchases_module() {

    }
    @Given("User clicks on Incoming Products")
    public void user_clicks_on_incoming_products() {

    }
}
