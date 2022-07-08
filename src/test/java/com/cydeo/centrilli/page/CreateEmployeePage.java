package com.cydeo.centrilli.page;


import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class CreateEmployeePage {

    public CreateEmployeePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;



    @FindBy(xpath ="//div[@name='address_id']" )
    public  WebElement workAddressDropdown;


    @FindBy(xpath = "//li[@class='o_m2o_dropdown_option ui-menu-item']")
    public WebElement workAddressMore;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> searchWorkAddresses;

    @FindBy(xpath = "//td//input[@name='work_location']")
    public WebElement workLocationInput;

    @FindBy(xpath = "//td//input[@name='work_email']")
    public WebElement workEmailInput;


    @FindBy(xpath = "//td//input[@name='mobile_phone']")
    public WebElement workMobileInput;

    @FindBy(xpath = "//td//input[@name='work_phone']")
    public WebElement workPhoneInput;

    @FindBy(xpath = "(//div//div//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement departmentDropdown;


    @FindBy(xpath = "//ul[3]//li[@class=\"ui-menu-item\"]")
    public List<WebElement> selectDepartment;



    @FindBy(xpath = "//html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[1]/div[4]/div/div[1]/div/table[2]/tbody/tr[3]/td[2]/div/div/input")
    public WebElement jobPositionDropdown;


    @FindBy(xpath = "//ul[4]//li[.='Search More...']")
    public WebElement jobPositionMore;


    @FindBy(xpath = "//tbody//tr[@class='o_data_row']")
    public List<WebElement> selectJobPosition;

    @FindBy(xpath = "//div/table[2]/tbody/tr[4]/td[2]//input")
    public WebElement managerDropdown;


    @FindBy(xpath = "//ul[5]//li[@class='o_m2o_dropdown_option ui-menu-item']")
    public WebElement managerMore;

    @FindBy(xpath =  "//tbody//tr[@class='o_data_row']")
    public List<WebElement> selectManager;


    @FindBy(xpath = "//div[1]/div[2]/div[2]//div[1]//div[2]/div[1]/div[4]//div[1]/div/table[2]/tbody/tr[5]/td[2]//div/input")
    public WebElement coachDropdown;

    @FindBy(xpath = "//ul[6]//li[@class='o_m2o_dropdown_option ui-menu-item'][1]")
    public WebElement coachMore;


    @FindBy(xpath = "//tbody//tr[@class='o_data_row']")
    public List<WebElement> selectCoach;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[7]")
    public WebElement workingHoursDropdown;


    @FindBy(xpath = "//ul[7]//li[@class='ui-menu-item']")
    public List<WebElement> selectWorkingHours;


    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;


    @FindBy(xpath = "//button[.='\n" +
            "            Edit\n" +
            "        ']")
    public WebElement editButton;


    public WebElement findingContact( String name){

        String element = "//span[contains(text(), '"+name+"')]";
        return Driver.getDriver().findElement(By.xpath(element));
    }

    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextPageButton;


    public static WebElement selectRandomWebElement(List<WebElement> listWebElements) {

        Random random = new Random();

        int index = random.nextInt(listWebElements.size());

        return listWebElements.get(index);


    }

}
