package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleCostsDetails_Page extends BasePage {



    @FindBy(xpath = "//li[@id='menu_more_container']/a")
    public WebElement menuTab;


    @FindBy(xpath = "//a[@data-menu='134']/span")
    public WebElement fleetBTM;

    @FindBy(xpath = "//a[@data-menu='145']/span")
    public WebElement vehicle_Costs;





    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBTM;


    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement vehicleBox;

    @FindBy(xpath = "//a[text()='Search More...']")
    public WebElement searchMoreVehicle;

    @FindBy(xpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")

    public List<WebElement> searchVehicleList;





    @FindBy(xpath = "(//div/input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement typeBox;

    @FindBy(xpath = "(//a[text()='Search More...'])[2]")
    public WebElement searchMoreType;

    @FindBy(xpath="//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")

    public List<WebElement> searchTypeList;





    @FindBy(xpath = "//input[@name='amount']")
    public WebElement totalPriceBox;

    @FindBy(xpath = "//input[@name='description']")
    public WebElement costDescriptionBox;

    @FindBy(xpath = "//input[@name='date']")
    public WebElement dateBox;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBTM;


    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBTM;







}
