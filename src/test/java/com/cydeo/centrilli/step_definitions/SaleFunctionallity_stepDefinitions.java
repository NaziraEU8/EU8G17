package com.cydeo.centrilli.step_definitions;


import com.cydeo.centrilli.page.SaleFunctionallityPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SaleFunctionallity_stepDefinitions {
    SaleFunctionallityPage sale = new SaleFunctionallityPage();
    Faker faker = new Faker();
    String name = faker.name().fullName();


    @Given("user is on the centrilli login page")
    public void userIsOnTheCentrilliLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("user enters username and password")
    public void userEntersUsernameAndPassword() {
        sale.emailInput.sendKeys(ConfigurationReader.getProperty("email"));
        sale.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        sale.btnButton.click();

    }

    @Given("user clicks on sale module")
    public void userClicksOnSaleModule() {
        BrowserUtils.sleep(2);
        sale.getSaleButton.click();
    }

    @Given("user is on {string} dashboard")
    public void user_is_on_dashboard(String string) {
        BrowserUtils.sleep(5);
        String expectedTitle = "Quotations - Odoo";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }
    @Given("user clicks on list button")
    public void user_clicks_on_list_button() {
        sale.listButton.click();

    }

    @Then("user should be able to see listed customers")
    public void user_should_be_able_to_see_listed_customers() {
        BrowserUtils.sleep(5);
     //   Assert.assertTrue(sale.listDisplayed.isDisplayed());
        sale.customerButton.click();
    }

    @Then("user clicks on kanban button")
    public void user_clicks_on_kanban_button() {
     sale.kanbanButton.click();
    }
    @Then("user should be able to see listed customers from kanban")
    public void userShouldBeAbleToSeeListedCustomersFromKanban() {
        BrowserUtils.sleep(3);
     Assert.assertTrue(sale.customerDashboard.getText().contains("Customers"));
    }

    @Then("user clicks on forward and backward button")
    public void user_clicks_on_forward_and_backward_button() {
       sale.nextButton.click();
        BrowserUtils.sleep(5);
        sale.kanbanButton.click();
    }
    @Then("user click on search input box")
    public void user_click_on_search_input_box() {
       sale.getSearchBox.click();
    }

    @Then("user search for {string} and presses enter")
    public void user_search_for_and_presses_enter(String string) {
    sale.getSearchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user should be able to se Anna customer listed")
    public void user_should_be_able_to_se_anna_customer_listed() {
        BrowserUtils.sleep(2);
        while (!(sale.AnnaCreatedCustomer.isDisplayed())){
            sale.nextButton.click();
            BrowserUtils.sleep(2);
        }
        System.out.println(sale.AnnaCreatedCustomer.getText());
        Assert.assertTrue(sale.AnnaCreatedCustomer.isDisplayed());

    }

    @Given("user is on customer dashboard")
    public void userIsOnCustomerDashboard() {
        sale.customerButton.click();
        String expectedtittle = "Customer / Anna";
        Assert.assertEquals(expectedtittle,Driver.getDriver().getTitle());

    }

    @When("user clicks import button")
    public void userClicksImportButton() {
        BrowserUtils.sleep(4);
        //String filepath="\u202AC:\\Users\\admin\\Desktop";
        //sale.importButton.sendKeys(filepath);
        String filePath2="\u202AC:\\Users\\admin\\Desktop\\SampleData.xlsx";
        sale.importButton.click();
      sale.importButton.sendKeys(filePath2);

    }

    @And("user clicks load a file button")
    public void userClicksLoadAFileButton() {
        BrowserUtils.sleep(3);
        sale.loadFileButton.click();

    }

    @And("user chooses the file to import")
    public void userChoosesTheFileToImport() {


    }

    @Then("user should see the file is imported")
    public void userShouldSeeTheFileIsImported() {
       sale.importButton.click();


    }
}




