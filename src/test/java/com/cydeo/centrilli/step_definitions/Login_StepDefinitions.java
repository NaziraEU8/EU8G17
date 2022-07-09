package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is in login page")
    public void userIsInLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {

        //entering email in input box from configuration properties files
        loginPage.emailInputBox.sendKeys(username);
        //entering passowrd in input box for cr
        loginPage.passwordInputBox.sendKeys(password);


    }

    @And("user click login button")
    public void userClickLoginButton() {
        //clicking login button
        loginPage.loginButton.click();
    }

    @Then("user should see the title #inbox - Odoo")
    public void userShouldSeeTheTitleInboxOdoo() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Odoo"));
    }


}


