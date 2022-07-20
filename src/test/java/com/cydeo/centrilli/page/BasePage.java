package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement fleetModule;

    @FindBy(xpath = "//li[@id='menu_more_container']")
    public WebElement moreDropDown;


    @FindBy(xpath ="//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[16]/a/span" )
    public WebElement employeeButton;

    @FindBy(xpath = "//span[.='Inbox']")
    public WebElement inboxButton;

    @FindBy(xpath = "//span[.='\n" +
            "                Sales\n" +
            "            ']")
    public WebElement salesModule;

    @FindBy(xpath = "//span[contains(text(),'CRM')]")
    public WebElement CRMModule;

}
