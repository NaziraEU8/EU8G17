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


        loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
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

    @When("user clicks on create button on pricelists")
    public void userClicksOnCreateButtonOnPricelists() {
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

    @When("user clicks on kanban button on pricelists")
    public void userClicksOnKanbanButtonOnPricelists() {
        BrowserUtils.sleep(2);
        salesPriceListsPage.kanbanButton.click();
        
    }

    @Then("user should be able to see kanban view")
    public void userShouldBeAbleToSeeKanbanView() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(salesPriceListsPage.kanbanButton.isEnabled());


    }

    @When("user clicks on list button on pricelists")
    public void userClicksOnListButtonOnPricelists() {

        BrowserUtils.sleep(2);
        salesPriceListsPage.listButton.click();
        
    }

    @Then("user should be able to see list view")
    public void userShouldBeAbleToSeeListView() {

        BrowserUtils.sleep(2);
        Assert.assertTrue(salesPriceListsPage.listButton.isEnabled());
    }

    @And("user fills minimum requirement field on pricelists")
    public void userFillsMinimumRequirementFieldOnPricelists() {

        BrowserUtils.sleep(2);
        salesPriceListsPage.nameInputBox.sendKeys(fullName);
    }

    @And("user clicks on discard button")
    public void userClicksOnDiscardButton() {

        salesPriceListsPage.discardButton.click();
        
    }

    @And("user clicks ok on the warning message")
    public void userClicksOkOnTheWarningMessage() {
        
        BrowserUtils.sleep(2);
        salesPriceListsPage.okWarningButton.click();
    }

    @Then("user is able to discard changes")
    public void userIsAbleToDiscardChanges() {

        //when user discard the changes save button turns to create button so
        // i need to verify if save button is displayed

        BrowserUtils.sleep(2);
        Assert.assertTrue(salesPriceListsPage.newSaveButton.isDisplayed());
    }
    private  static  int totalNumberOfPriceLists;
    @When("user clicks on an existing pricelist")
    public void userClicksOnAnExistingPricelist() {
        BrowserUtils.sleep(2);
        // will give me the total number of pricelists so i can use it to compare after i delete a pricelist
        totalNumberOfPriceLists = salesPriceListsPage.selectPriceList.size();
        // will select a random from the whole price list
        salesPriceListsPage.selectRandomWebElement(salesPriceListsPage.selectPriceList).click();
    }

    @And("user clicks on action button")
    public void userClicksOnActionButton() {
        
        BrowserUtils.sleep(2);
        salesPriceListsPage.actionButton.click();
    }

    @And("user clicks on delete dropdown button")
    public void userClicksOnDeleteDropdownButton() {

        BrowserUtils.sleep(2);
        salesPriceListsPage.deleteButton.click();
    }

    @And("user confirms prompting dialog")
    public void userConfirmsPromptingDialog() {
        BrowserUtils.sleep(2);
        salesPriceListsPage.okDeleteButton.click();
    }

    @Then("user should be able to delete pricelist successfully")
    public void userShouldBeAbleToDeletePricelistSuccessfully() {

        BrowserUtils.sleep(2);
        salesPriceListsPage.priceListsButton.click();
        BrowserUtils.sleep(2);
        //verifying by comparing the total number of pricelists before and after deleting

        Assert.assertNotEquals(totalNumberOfPriceLists,salesPriceListsPage.selectPriceList.size());

    }
}
