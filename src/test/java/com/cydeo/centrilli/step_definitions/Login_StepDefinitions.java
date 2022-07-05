package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;

public class Login_StepDefinitions {

    BasePage basePage = new BasePage();

    @Given("User is on login page")
    public void user_is_on_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @Given("user is entering valid credentials")
    public void userIsEnteringValidCredentials() {

        //entering email in input box from configuration properties files
        basePage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));

        //entering passowrd in input box for cr
        basePage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));

        //clicking login button
        basePage.loginButton.click();

    }
}


