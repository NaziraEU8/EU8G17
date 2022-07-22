package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.CRMPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CRMPipelineCreateCustomer_StepDefinition {
    CRMPage crmPage=new CRMPage();
    Faker faker=new Faker();
    String opportunityTitle;
    String customer;

    @Given("user is un CRM modul")
    public void userIsUnCRMModul() {
        BrowserUtils.waitForVisibility(crmPage.inboxButton,10);
        crmPage.CRMModule.click();

    }
    @Given("user click Pipeline in CRM menu")
    public void user_click_pipeline_in_crm_menu() {
        crmPage.pipelineMenu.click();

    }
    @When("user clicks create button in CRM pipeline")
    public void user_clicks_create_button_in_crm_pipeline() {
        crmPage.createButton.click();
    }


    @And("user write the data to create an opportunity")
    public void userWriteTheDataToCreateAnOpportunity() {
        crmPage.opportunityTitleInput.sendKeys(faker.letterify("???????????"));
        crmPage.customerInputBox.click();
        crmPage.searchMoreCustomerLink.click();
        BrowserUtils.selectRandomElementFromTable(crmPage.customersList).click();
        crmPage.expectedRevenueInputBox.sendKeys(BrowserUtils.randomNumber(100)+"");
        BrowserUtils.selectRandomElementFromTable(crmPage.priorityList).click();

    }

    @And("user clicks create button in create opportunity page")
    public void userClicksCreateButtonInCreateOpportunityPage() {
        crmPage.createButtonFromCreateOpportunity.click();
        opportunityTitle=crmPage.opportunityTitleInput.getText();
    }

    @Then("user verify if opportunity is created")
    public void userVerifyIfOpportunityIsCreated() {

        Assert.assertTrue(Driver.getDriver().getPageSource().contains(opportunityTitle));
    }

    @When("user click list View")
    public void userClickListView() {
        BrowserUtils.sleep(3);
        crmPage.listChangeViewButton.click();
        BrowserUtils.sleep(3);
        crmPage.listChangeViewButton.click();

    }

    @Then("user Verify that view is changer into list")
    public void userVerifyThatViewIsChangerIntoList() {

      /*  BrowserUtils.sleep(3);
        Assert.assertFalse(crmPage.kanbanViewTable.isDisplayed());*/

    }


    @And("user click on one opportunitie from list")
    public void userClickOnOneOpportunitieFromList() {
        BrowserUtils.sleep(3);
        BrowserUtils.selectRandomElementFromTable(crmPage.opportunitiesList).click();
    }

    @And("user click edit button in opportunities information")
    public void userClickEditButtonInOpportunitiesInformation() {
        customer=crmPage.customerName.getText();
        crmPage.editButton.click();
    }

    @And("user change customor name")
    public void userChangeCustomorName() {
        crmPage.customerInputBox.click();
        crmPage.searchMoreCustomerLink.click();
        BrowserUtils.selectRandomElementFromTable(crmPage.customersList).click();
    }

    @And("user clicks discard button")
    public void userClicksDiscardButton() {
        crmPage.discardButton.click();
    }

    @Then("user verify that the name didn't change")
    public void userVerifyThatTheNameDidnTChange() {
        Assert.assertTrue(customer.equals(crmPage.customerName.getText()));
    }

    @And("user click OK in pop up")
    public void userClickOKInPopUp() {
        BrowserUtils.waitForVisibility(crmPage.okPopUpButton,10);
        crmPage.okPopUpButton.click();
    }


    @And("user clicks save oportunity button")
    public void userClicksSaveOportunityButton() {
        crmPage.saveButton.click();
    }

    @Then("user verify if changes are made")
    public void userVerifyIfChangesAreMade() {
        Assert.assertFalse(crmPage.customerName.equals(customer));
    }
}
