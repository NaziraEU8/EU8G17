package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OdometerFunctionPage extends BasePage{

    public  OdometerFunctionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='\n" +
            "                Vehicles Odometer\n" +
            "            ']")
    public WebElement vehiclesOdometerButton;


    @FindBy(xpath= "//button[.='\n" +
            "                Create\n" +
            "            ']")
    public WebElement createButton;

   @FindBy(xpath ="//div[1]/div[2]/div[2]/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/div" )
    public WebElement vehicleDropButton;

   @FindBy(xpath = "/html/body/ul/li[1]")
    public WebElement selectNameVehicleButton;

   @FindBy(name= "value")
    public WebElement OdometerValueButton;

   @FindBy(name= "date")
    public WebElement dateValue;

   @FindBy(xpath= "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;



}
