package com.cydeo.centrilli.step_definitions;


import com.cydeo.centrilli.page.CreateEmployeePage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CreateEmployeeStep_Definitions {

    CreateEmployeePage createEmployeePage = new CreateEmployeePage();


    Faker faker = new Faker();
    String name = faker.name().fullName();

    @And("user fills all the fields")
    public void userFillsAllTheFields() {


        //send Full name input
        createEmployeePage.nameInput.sendKeys(name);
        //click dropdown work address
        createEmployeePage.workAddressDropdown.click();
        //select search more
        createEmployeePage.workAddressMore.click();
        //selects a random webElement from search
        createEmployeePage.selectRandomWebElement(createEmployeePage.searchWorkAddresses).click();

        //enter location
        String location = faker.address().fullAddress();
        createEmployeePage.workLocationInput.sendKeys(location);

        //enter email-- getting name and removing empty space and adding @email.com at the end
        String email = name.replaceAll(" ", "") + "@email.com";
        createEmployeePage.workEmailInput.sendKeys(email);


        //enter work mobile number
        String mobile = faker.phoneNumber().cellPhone();
        createEmployeePage.workMobileInput.sendKeys(mobile);

        //enter phone number
        BrowserUtils.sleep(3);
        String phone = faker.phoneNumber().phoneNumber();
        createEmployeePage.workPhoneInput.sendKeys(phone);
        BrowserUtils.sleep(2);

        //department
        createEmployeePage.departmentDropdown.click();
        BrowserUtils.sleep(2);
        createEmployeePage.selectRandomWebElement(createEmployeePage.selectDepartment).click();
        BrowserUtils.sleep(2);


        //click job position dropdown
        createEmployeePage.jobPositionDropdown.click();
        BrowserUtils.sleep(2);
        createEmployeePage.jobPositionMore.click();
        BrowserUtils.sleep(2);
        createEmployeePage.selectRandomWebElement(createEmployeePage.selectJobPosition).click();
        BrowserUtils.sleep(2);

        //click manager dropdown
        createEmployeePage.managerDropdown.click();
        BrowserUtils.sleep(1);
        createEmployeePage.managerMore.click();
        BrowserUtils.sleep(1);
        createEmployeePage.selectRandomWebElement(createEmployeePage.selectManager).click();
        BrowserUtils.sleep(2);

        //click coach dropdown
        createEmployeePage.coachDropdown.click();
        BrowserUtils.sleep(1);
        createEmployeePage.coachMore.click();
        BrowserUtils.sleep(1);
        createEmployeePage.selectRandomWebElement(createEmployeePage.selectCoach).click();
        BrowserUtils.sleep(2);

        //click working hours dropdown
        createEmployeePage.workingHoursDropdown.click();
        BrowserUtils.sleep(1);
        createEmployeePage.selectRandomWebElement(createEmployeePage.selectWorkingHours).click();


    }

    @And("user clicks save button")
    public void userClicksSaveButton() {
        createEmployeePage.saveButton.click();
        BrowserUtils.sleep(5);
    }

    @Then("user should see the new created employee contact")
    public void userShouldSeeTheNewCreatedEmployeeContact() {

        String expectedTitle = name + " - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @And("user fills minimum requirement field")
    public void userFillsMinimumRequirementField() {

        createEmployeePage.nameInput.sendKeys(name);
    }

    @And("user clicks edit button")
    public void userClicksEditButton() {
        BrowserUtils.sleep(2);
        createEmployeePage.editButton.click();
    }

    @And("user edits minimum requirements field")
    public void userEditsMinimumRequirementsField() {

        createEmployeePage.nameInput.sendKeys(Keys.BACK_SPACE,  Keys.BACK_SPACE, Keys.BACK_SPACE);
    }

    @Then("user should be able to see new created employee listed")
    public void userShouldBeAbleToSeeNewCreatedEmployeeListed() {
        //for later
        //String name1 = name.substring(0,name.length()-3);



        while (!(createEmployeePage.findingContact(name).isDisplayed())){

            createEmployeePage.nextPageButton.click();

            BrowserUtils.sleep(2);


        }

        System.out.println(createEmployeePage.findingContact(name).getText());
        Assert.assertTrue(createEmployeePage.findingContact(name).isDisplayed());
    }
}
