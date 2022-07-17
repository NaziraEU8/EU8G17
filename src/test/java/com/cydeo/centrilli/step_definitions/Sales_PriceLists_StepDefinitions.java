package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.Sales_PriceListsPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Sales_PriceLists_StepDefinitions {


    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    Sales_PriceListsPage salesPriceListsPage = new Sales_PriceListsPage();


    Faker faker = new Faker();

    @Given("user enters username and password as sales manager")
    public void userEntersUsernameAndPasswordAsSalesManager() {


        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email2"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password2"));
        loginPage.loginButton.click();


    }

    @Given("user clicks on sales module")
    public void userClicksOnSalesModule() {
        BrowserUtils.sleep(2);
        basePage.salesModule.click();



    }


    @Given("user clicks on pricelists button")
    public void userClicksOnPricelistsButton() {
        BrowserUtils.sleep(2);
        salesPriceListsPage.priceListsButton.click();
    }

    @When("user clicks on create button on orders")
    public void userClicksOnCreateButtonOnOrders() {
        BrowserUtils.sleep(2);
        salesPriceListsPage.createButtonPriceLists.click();
    }

    String fullName = faker.name().fullName();


    @And("user fills all the empty fields on pricelists")
    public void userFillsAllTheEmptyFieldsOnPricelists() {
        BrowserUtils.sleep(2);

        salesPriceListsPage.nameInputBox.sendKeys(fullName);

        salesPriceListsPage.ecommerceInputBox.sendKeys(faker.numerify("#########"));

        salesPriceListsPage.allowToUseDropButton.click();
        BrowserUtils.sleep(2);
        salesPriceListsPage.selectRandomWebElement(salesPriceListsPage.selectAllowToUse).click();

        salesPriceListsPage.saveButton.click();
    }

    @Then("user should be able to save new pricelist")
    public void userShouldBeAbleToSaveNewPricelist() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(fullName));
    }
}
