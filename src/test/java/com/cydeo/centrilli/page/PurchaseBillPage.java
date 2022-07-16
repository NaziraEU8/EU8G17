package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseBillPage {

    public PurchaseBillPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'Purchases')]")
    public WebElement purchasesTab;

    @FindBy (xpath="//button[contains(text(),'Create')]")
    public WebElement createBtn;

    @FindBy (xpath="(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement SelectVendorBox;

    @FindBy(xpath="//a[text()='Add an item']")
    public WebElement AddItemBtn;

    @FindBy (xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public  WebElement ProductDropDownBtn;

    @FindBy (xpath="(//input[@class='o_datepicker_input o_input'])[2]")
    public  WebElement ScheduledDateBtn;

    @FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
    public WebElement Savebtn;

    @FindBy (xpath = "(//button[contains(text(),'Edit')])[1]")
    public WebElement Editbtn;

    @FindBy (xpath = "(//button[contains(text(),'Discard')])[1]")
    public WebElement DiscardBtn;

    @FindBy (xpath = "(//button[contains(text(),'Cancel')])[1]" )
    public WebElement CancelBtn;

    @FindBy (xpath = "(//button[contains(text(),'Action')])[1]")
    public WebElement ActionBtn;

    @FindBy (xpath = "(//a[contains(text(),'Delete')])[1]")
    public WebElement DeleteBtn;






}
