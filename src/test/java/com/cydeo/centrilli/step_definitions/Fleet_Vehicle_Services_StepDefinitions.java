package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.VehicleServicesCreatePage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class  Fleet_Vehicle_Services_StepDefinitions {
   VehicleServicesCreatePage vehicleServicesCreatePage=new VehicleServicesCreatePage();
   Faker faker=new Faker();

 String totalServices;


    @Then("user click in Fleet module")
    public void userClickInFleetModule() {
        BrowserUtils.waitForVisibility(vehicleServicesCreatePage.inboxButton,10);
        if (vehicleServicesCreatePage.fleetModule.isDisplayed()){
            vehicleServicesCreatePage.fleetModule.click();
        }
        else {
            vehicleServicesCreatePage.moreDropDown.click();
            vehicleServicesCreatePage.fleetModule.click();
        }

        vehicleServicesCreatePage.vehiclesServicesLog.click();

    }



    @When("user click in create button")
    public void userClickInCreateButton() {
     BrowserUtils.waitForVisibility(vehicleServicesCreatePage.listOfVehiclesServices.get(1),10);
     vehicleServicesCreatePage.createButton.click();
    }

    @And("User fill the field with information")
    public void userFillTheFieldWithInformation() {
     vehicleServicesCreatePage.vehicleInputBox.click();
     vehicleServicesCreatePage.moreVehicleLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.vehiclesNameList).click();


     vehicleServicesCreatePage.serviceType.click();
     vehicleServicesCreatePage.moreServicesLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.serviceTypeList).click();

     vehicleServicesCreatePage.totalPrice.clear();
     vehicleServicesCreatePage.totalPrice.sendKeys(BrowserUtils.randomNumber(1000)+"");


     vehicleServicesCreatePage.odometerValue.clear();
     vehicleServicesCreatePage.odometerValue.sendKeys(BrowserUtils.randomNumber(500000)+"");

    vehicleServicesCreatePage.purchaser.click();
    vehicleServicesCreatePage.morePurchaserLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.purchaserList).click();

     vehicleServicesCreatePage.vendor.click();
     vehicleServicesCreatePage.moreVendorLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.vendorsList).click();

     vehicleServicesCreatePage.invoiceReference.clear();
    vehicleServicesCreatePage.invoiceReference.sendKeys(faker.numerify("########"));


    }

    @And("user click save button")
    public void userClickSaveButton() {
     vehicleServicesCreatePage.saveButton.click();
    }

    @Then("user verify pages title")
    public void userVerifyPagesTitle() {
     BrowserUtils.waitForVisibility(vehicleServicesCreatePage.vehicleName,10);
     String expectedResult=vehicleServicesCreatePage.vehicleName.getText()+" - Odoo";
     Assert.assertTrue(Driver.getDriver().getTitle().equals(expectedResult));
    }

    @When("user save the amount of vehicle services")
    public void userSaveTheAmountOfVehicleServices() {
     BrowserUtils.sleep(3);
     totalServices=vehicleServicesCreatePage.totalAmountOfServices.getText();
    }

    @And("user click discard button")
    public void userClickDiscardButton() {
     vehicleServicesCreatePage.discardButton.click();
    }

    @And("user click OK on pop up table")
    public void userClickOKOnPopUpTable() {
     vehicleServicesCreatePage.okPopUpButton.click();
    }

    @Then("user verify the amount of vehicle services")
    public void userVerifyTheAmountOfVehicleServices() {
     System.out.println("totalServices = " + totalServices);
     BrowserUtils.waitForVisibility(vehicleServicesCreatePage.totalAmountOfServices,10);
     System.out.println("createPage.totalAmountOfServices.getText() = " + vehicleServicesCreatePage.totalAmountOfServices.getText());

     Assert.assertTrue(vehicleServicesCreatePage.totalAmountOfServices.getText().equals(totalServices));
    }

    @And("User fill the required field with information")
    public void userFillTheRequiredFieldWithInformation() {
     BrowserUtils.waitForClickablility(vehicleServicesCreatePage.saveButton,10);

     vehicleServicesCreatePage.totalPrice.clear();
     vehicleServicesCreatePage.odometerValue.clear();
     vehicleServicesCreatePage.inputDate.clear();
     vehicleServicesCreatePage.saveButton.click();
     if (vehicleServicesCreatePage.notificationPopUp.isDisplayed() && vehicleServicesCreatePage.vehicleInputBox.getText().equals("")){

      vehicleServicesCreatePage.vehicleInputBox.click();
     vehicleServicesCreatePage.moreVehicleLink.click();
      BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.vehiclesNameList).click();
      vehicleServicesCreatePage.saveButton.click();

     }
     if (vehicleServicesCreatePage.notificationPopUp.isDisplayed() && !(vehicleServicesCreatePage.vehicleInputBox.getText().equals(""))){
      vehicleServicesCreatePage.serviceType.click();
      vehicleServicesCreatePage.moreServicesLink.click();
      BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.serviceTypeList).click();
      vehicleServicesCreatePage.saveButton.click();
     }
    }

    @And("User write invalid information for total price and odometer")
    public void userWriteInvalidInformationForTotalPriceAndOdometer() {
     vehicleServicesCreatePage.vehicleInputBox.click();
     vehicleServicesCreatePage.moreVehicleLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.vehiclesNameList).click();


     vehicleServicesCreatePage.serviceType.click();
     vehicleServicesCreatePage.moreServicesLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.serviceTypeList).click();

     vehicleServicesCreatePage.totalPrice.clear();
     vehicleServicesCreatePage.totalPrice.sendKeys(faker.letterify("?????"));


     vehicleServicesCreatePage.odometerValue.clear();
     vehicleServicesCreatePage.odometerValue.sendKeys(faker.letterify("??????"));

     vehicleServicesCreatePage.purchaser.click();
     vehicleServicesCreatePage.morePurchaserLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.purchaserList).click();

     vehicleServicesCreatePage.vendor.click();
     vehicleServicesCreatePage.moreVendorLink.click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.vendorsList).click();

     vehicleServicesCreatePage.invoiceReference.clear();
     vehicleServicesCreatePage.invoiceReference.sendKeys(faker.numerify("########"));

    }

    @Then("user verify notification pop up")
    public void userVerifyNotificationPopUp() {
     Assert.assertTrue(vehicleServicesCreatePage.notificationPopUp.isDisplayed());
    }

    @And("user click over the check box from the list")
    public void userClickOverTheCheckBoxFromTheList() {
     BrowserUtils.waitForClickablility(BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.listOfCheckBoxes),15).click();
     BrowserUtils.selectRandomElementFromTable(vehicleServicesCreatePage.listOfCheckBoxes);
    }

    @And("user click delete button in Actions dropdown")
    public void userClickDeleteButtonInActionsDropdown() {
     vehicleServicesCreatePage.actionsDropDown.click();
     vehicleServicesCreatePage.deleteVehiclesService.click();
     vehicleServicesCreatePage.okDeleteButton.click();
    }

    @Then("user verify total number of vehicles services")
    public void userVerifyTotalNumberOfVehiclesServices() {
     Assert.assertTrue(!(vehicleServicesCreatePage.totalAmountOfServices.equals(totalServices)));
    }
}
