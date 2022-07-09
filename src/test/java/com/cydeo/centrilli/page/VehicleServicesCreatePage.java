package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleServicesCreatePage extends VehiclesServicesLogsPage{
    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

   @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input'][1]")
    public WebElement vehicleInputBox;

   @FindBy(xpath = "//a[.='Search More...']")
    public WebElement moreVehicleLink;

   @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/table[1]/tbody/tr[3]/td[2]/div/div/span/..")
    public WebElement serviceType;

    @FindBy(xpath ="/html/body/ul[2]/li[8]/a")
    public WebElement moreServicesLink;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPrice;

    @FindBy(xpath = "//input[@name='odometer']")
    public WebElement odometerValue;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement inputDate;

    @FindBy(xpath = "(//INPUT[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement purchaser;

    @FindBy(xpath = "(//a[.='Search More...'])[3]")
    public WebElement morePurchaserLink;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement vendor;

    @FindBy(xpath = "(//a[.='Search More...'])[4]")
    public WebElement moreVendorLink;

   @FindBy(xpath = "//input[@name='inv_ref']")
    public WebElement invoiceReference;

   @FindBy(xpath = "//span[.='Ok']")
    public WebElement okPopUpButton;

   @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement notificationPopUp;

   @FindBy (xpath = "//div[@class='modal-footer']/button")
    public WebElement okDeleteButton;
    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> purchaserList;


}
