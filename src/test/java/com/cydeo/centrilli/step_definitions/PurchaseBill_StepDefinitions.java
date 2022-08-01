package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.PurchaseBillPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PurchaseBill_StepDefinitions {
    PurchaseBillPage pb = new PurchaseBillPage();

    @When("user should be able to click Purchase tab")
    public void user_should_be_able_to_click_purchase_tab() {
        pb.clickPurchaseTab();

    }
    @When("verify the Purchase page is displayed")
    public void verify_the_purchase_page_is_displayed() {
        Assert.assertTrue("Purchase Page is not Displayed",pb.purchasePageIsDisplayed());
    }
    @When("user should be able to click on Create button")
    public void user_should_be_able_to_click_on_create_button() {
        pb.clickCreateBtn();
    }
    @When("user should select {string} and click Add an Item link")
    public void user_should_select_and_click_add_an_item_link(String vendorName) {
        BrowserUtils.waitFor(2);

        pb.selectVendor(vendorName);
        BrowserUtils.waitFor(2);
        pb.AbataData.click();
        BrowserUtils.waitFor(2);
        pb.clickAddItem();
        //pb.clickTab();

    }
    @When("user should select {string} and add Scheduled Date")
    public void user_should_select_and_add_scheduled_date(String productName) {

        BrowserUtils.waitFor(2);
        pb.selectProduct(productName);

    }
    @When("user should click Save button")
    public void user_should_click_save_button() {
        BrowserUtils.waitFor(5);
         pb.clickSaveBtn();
        BrowserUtils.waitFor(2);

    }
    @When("user should verify the Vendor Bill created successfully")
    public void user_should_verify_the_vendor_bill_created_successfully() {

    }
    @When("user should be able to click Edit button")
    public void user_should_be_able_to_click_edit_button() {

    }
    @When("user should select {string}")
    public void user_should_select(String string) {

    }
    @When("user should be able to click Discard button")
    public void user_should_be_able_to_click_discard_button() {

    }
    @When("user should see the warning message and click Ok button")
    public void user_should_see_the_warning_message_and_click_ok_button() {

    }
    @When("user should be able to verify no change is applied")
    public void user_should_be_able_to_verify_no_change_is_applied() {

    }
    @When("user should click on Cancel button")
    public void user_should_click_on_cancel_button() {

    }
    @When("user should be able to click Actions dropdown button and click Delete button")
    public void user_should_be_able_to_click_actions_dropdown_button_and_click_delete_button() {
           }
    @When("user should see Confirmation textbox and click Ok button")
    public void user_should_see_confirmation_textbox_and_click_ok_button() {

    }
    @When("user should verify vendor bill iis deleted successfully")
    public void user_should_verify_vendor_bill_iis_deleted_successfully() {

    }
}
