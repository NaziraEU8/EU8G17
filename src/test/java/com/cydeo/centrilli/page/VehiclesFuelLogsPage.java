package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesFuelLogsPage extends BasePage {

    @FindBy(id = "menu_more_container")
    public WebElement moreMenu;
    //@FindBy(xpath = "//li[@id='menu_more_container']")

    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[contains(text(),'Vehicles Fuel Logs')]")
    public WebElement vehiclesFuelLogs;


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'o_dropdown_button')]")
    public WebElement vehicleDetails;
    // id= o_field_input_765

    @FindBy(id = "ui-id-54")
    public WebElement createAndEdit;

    @FindBy(id = "o_field_input_1274")
    public WebElement model;

    @FindBy(name = "license_plate")
    public WebElement licensePlate;

    @FindBy(id = "o_field_input_1331")
    public WebElement tags;

    @FindBy(id = "o_field_input_1332")
    public WebElement driverName;



    @FindBy(name = "location")
    public WebElement location;

    @FindBy(name = "vin_sn")
    public WebElement chassisNumber;

    @FindBy(name = "model_year")
    public WebElement modelYear;

    @FindBy(name = "odometer")
    public WebElement lastOdometer;

    @FindBy(name = "odometer_unit")
    public WebElement kmOrMiles;

    @FindBy(name = "acquisition_date")
    public WebElement immatriculationDate;



    @FindBy(xpath = "//span[contains(text(),'o_datepicker_button')]")
    public WebElement selectDate;



    @FindBy(name = "car_value")
    public WebElement catalogValue;

    @FindBy(name = "residual_value")
    public WebElement residualValue;

    @FindBy(name = "seats")
    public WebElement seatsNumber;

    @FindBy(name = "doors")
    public WebElement doorsNumber;

    @FindBy(name = "color")
    public WebElement carColor;

    @FindBy(name = "transmission")
    public WebElement transmissionType;

    @FindBy(name = "fuel_type")
    public WebElement fuelType;

    @FindBy(name = "co2")
    public WebElement co2Emissions;

    @FindBy(name = "horsepower")
    public WebElement horsePower;

    @FindBy(name = "horsepower_tax")
    public WebElement hpTax;

    @FindBy(name = "power")
    public WebElement power;


    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement saveButton;

    @FindBy(name = "odometer")
    public WebElement odometerValue;
   // @FindBy(xpath = "//input[@name='odometer']")

    @FindBy(name = "liter")
    public WebElement liter;

    @FindBy(name = "price_per_liter")
    public WebElement pricePerLiter;

    @FindBy(xpath = "//table[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveB;










}
