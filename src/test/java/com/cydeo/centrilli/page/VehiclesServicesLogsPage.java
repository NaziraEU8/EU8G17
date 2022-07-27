package com.cydeo.centrilli.page;

import com.cydeo.centrilli.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehiclesServicesLogsPage extends BasePage {

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> listOfVehiclesServices;

    @FindBy(xpath = "//span[contains(text(),'Vehicles Services Logs')]")
    public WebElement vehiclesServicesLog;

    @FindBy(xpath = "//span[@class='o_pager_limit']")
    public WebElement totalAmountOfServices;

    @FindBy(xpath = "//table/tbody/tr/td[1]/div/input")
    public List<WebElement> listOfCheckBoxes;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement actionsDropDown;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement deleteVehiclesService;

    @FindBy(xpath = "//a[contains(text(),'Export')]")
    public WebElement exportVehicleService;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> purchaserList;

    @FindBy(xpath = "//*[@class='modal o_technical_modal in']/div/div/div[2]/div[2]/div/table/tbody/tr/td")
    public List<WebElement> serviceTypeList;

    @FindBy(xpath = "//*[@class='modal o_technical_modal in']/div/div/div[2]/div[2]/div/table/tbody/tr/td[2]")
    public List<WebElement> vehiclesNameList;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> vendorsList;

    @FindBy(xpath = "//a[@name='vehicle_id']")
    public WebElement vehicleName;






}
