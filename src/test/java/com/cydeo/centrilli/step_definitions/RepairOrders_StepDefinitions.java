package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.RepairOrdersPage;
import com.cydeo.centrilli.page.VehicleCostsDetails_Page;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RepairOrders_StepDefinitions {

    RepairOrdersPage repairOrdersPage = new RepairOrdersPage();
    LoginPage loginPage = new LoginPage();
    VehicleCostsDetails_Page vehicleCostsDetails_page = new VehicleCostsDetails_Page();

    @Given("the user clicks the Repairs module")
    public void the_user_clicks_the_repairs_module() {

      if(repairOrdersPage.repairsBTM.isDisplayed()){
          repairOrdersPage.repairsBTM.click();
          BrowserUtils.waitFor(5);
      }else{
          BrowserUtils.waitForVisibility(loginPage.inboxSubTitle,10);
          vehicleCostsDetails_page.menuTab.click();
          repairOrdersPage.repairsBTM.click();
          BrowserUtils.waitFor(5);
      }

    }
    @Then("the user is on the repair order page")
    public void the_user_is_on_repair_orders_page() {
        String expectedTitle = "Repair Orders - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @When("the user clicks the kanban button")
    public void the_user_clicks_the_kanban_button() {
     repairOrdersPage.kanbanBTM.click();

    }
    @Then("the user views the repair orders in kanban format")
    public void the_user_views_the_repair_orders_in_kanban_format() {
      repairOrdersPage.kanban_view.isDisplayed();
      BrowserUtils.waitFor(3);
    }



    @When("the user clicks the create button on the repair order page")
    public void the_user_clicks_the_create_button_on_the_repair_order_page() {
     repairOrdersPage.createBTM.click();
    }
    @Then("the user is on new repair order page")
    public void the_user_is_on_new_repair_order_page() {
    repairOrdersPage.form_sheet.isDisplayed();
   //BrowserUtils.waitFor(5);
    }



    @Given("the user types in the {string}")
    public void the_user_types_in_the(String product) {
     repairOrdersPage.productToRepair.sendKeys(product);
     repairOrdersPage.createEditForProduct.click();
     //BrowserUtils.waitFor(5);
     repairOrdersPage.saveBtmForProduct.click();
    BrowserUtils.waitFor(2);
    }


    @Given("types in the {string} in numbers")
    public void types_in_the_in_numbers(String quantity) {
    repairOrdersPage.productQuantity.clear();
    repairOrdersPage.productQuantity.sendKeys(quantity);
    BrowserUtils.waitFor(2);
    }

    @Given("types in the {string} info")
    public void types_in_the_info(String customerInfo) {
    repairOrdersPage.customerInfo.sendKeys(customerInfo);
    repairOrdersPage.createEditForCustomer.click();
     BrowserUtils.waitFor(5);
    repairOrdersPage.saveBtmForCustomer.click();
     BrowserUtils.waitFor(3);

    }
    @Given("types in the {string}")
    public void types_in_the(String deliveryAddress) {
    repairOrdersPage.deliveryAddress.clear();
//    repairOrdersPage.deliveryAddress.sendKeys(deliveryAddress);
//    BrowserUtils.waitFor(5);
//    repairOrdersPage.createEditForDeliveryAddress.click();
//    BrowserUtils.waitFor(5);

   repairOrdersPage.saveCreateEditS.click();
   BrowserUtils.waitFor(3);

    }


    @Given("types in the {string} as an address")
    public void types_in_the_as_an_address(String currentL) {
    repairOrdersPage.currentLocation.clear();
    repairOrdersPage.currentLocation.sendKeys(currentL+ Keys.ENTER);
    }
    @Given("types in the {string} as final destination")
    public void types_in_the_as_final_destination(String deliveryL) {
    repairOrdersPage.deliveryLocation.clear();
    repairOrdersPage.deliveryLocation.sendKeys(deliveryL+Keys.ENTER);

    }
    @Given("types in the {string} date")
    public void types_in_the_date(String warrantyExp) {
      repairOrdersPage.warrantyExpiration.sendKeys(warrantyExp);
      repairOrdersPage.form_sheet.click();

    }
    @Given("chooses the invoice method")
    public void chooses_the_invoice_method() {
        Select select = new Select(repairOrdersPage.invoiceMethod);
        select.selectByIndex(2);
    }
    @Given("clicks the save button")
    public void clicks_the_save_button() {
    repairOrdersPage.saveBTM.click();
    }
    @Then("a new repair order is created")
    public void a_new_repair_order_is_created() {
        BrowserUtils.waitFor(5);
    repairOrdersPage.editBTM.isDisplayed();
        BrowserUtils.waitFor(5);
    }




}