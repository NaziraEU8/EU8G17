package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.Incoming_ProductsPage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Incoming_Products_StepDefinitions {
    LoginPage loginPage= new LoginPage();
    BasePage basePage=new BasePage();
    Incoming_ProductsPage incoming_productsPage=new Incoming_ProductsPage();



    @Given("User enters with valid credential as sales manager")
    public void user_enters_with_valid_credential_as_sales_manager() {
        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }
    @Given("User clicks on Purchases module")
    public void user_clicks_on_purchases_module() {
        BrowserUtils.sleep(3);
        basePage.PurchasesModule.click();

    }
    @Given("User clicks on Incoming Products")
    public void user_clicks_on_incoming_products() {
        BrowserUtils.sleep(3);
        incoming_productsPage.incomingProductsButton.click();


    }


    @When("User click on Create button on incoming products")
    public void user_click_on_create_button_on_incoming_products() {



    }
    @And("User fills out the empty boxes")
    public void user_fills_out_the_empty_boxes() {


    }
    @Then("User should be able save the new Incom product.")
    public void user_should_be_able_save_the_new_incom_product() {


    }



    @When("User click on Kanban button on Incoming product list")
    public void user_click_on_kanban_button_on_incoming_product_list() {

    }
    @Then("User should be able to see kanban view")
    public void user_should_be_able_to_see_kanban_view() {

    }
    @When("User click on list button")
    public void user_click_on_list_button() {

    }
    @Then("User should be able to see list view.")
    public void user_should_be_able_to_see_list_view() {

    }



}
