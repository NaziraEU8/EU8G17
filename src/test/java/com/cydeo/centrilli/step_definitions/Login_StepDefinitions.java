package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
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

        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));

        //entering password in input box for cr
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));


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


    //Saadet login step definitions

    @When("the user is on the login page")
    public void the_user_is_on_the_login_page_sa() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("the user logins with valid username and password")
    public void the_user_logins_with_valid_username_and_password() {
       // loginPage.login(ConfigurationReader.getProperty("email"),ConfigurationReader.getProperty("password"));
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.submit.click();
    }
    @Then("the user sees the dashboard")
    public void the_user_sees_the_dashboard() {
       // BrowserUtils.waitForVisibility(loginPage.inboxSubTitle,10);
    }

}


