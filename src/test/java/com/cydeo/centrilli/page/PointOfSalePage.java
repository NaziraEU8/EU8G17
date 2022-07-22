package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PointOfSalePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[8]/a")
    public WebElement pointOfSaleInNavBar;

    @FindBy(xpath = "//div[8]/ul[4]/li[1]/a")
    public WebElement pointOfSaleInDash;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//*[@name=\"name\"]")
    public WebElement pointOfSaleNameInputBox;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[12]")
    public WebElement paymentMethodInputBox;

    @FindBy(xpath = "//a[.='Cash (123)']")
    public WebElement cash123;

    @FindBy(xpath = "//div[13]/div[1]/div/div[2]/div/div/input")
    public WebElement inventoryInputBox;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMore;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> listOfInventoryOptions;

    @FindBy(xpath = "//div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//table/tbody/tr/td[2]")
    public List<WebElement> listOfNamesOfPointsOfSales;

    @FindBy(xpath = "//div[3]/div[3]/button[1]")
    public WebElement pointOfSaleKaban;

    @FindBy(xpath = "//div[3]/button[2]")
    public WebElement pointOfSaleList;

    @FindBy(xpath = "//table")
    public WebElement table;

    @FindBy(xpath = "//div[2]/div[1]/div/div[2]/button[2]")
    public WebElement discardButton;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> listOfPointOfSale;

    @FindBy(xpath = "//div[1]/div/div[1]/button[1]")
    public WebElement editButton;

    @FindBy(xpath = "//div/div[1]/button[2]")
    public WebElement createButton2;

    @FindBy(xpath = "//h1")
    public WebElement title;

    @FindBy(xpath = "//div[2]/div/div/div/div/div/div[2]/button")
    public WebElement archiveButton;

    @FindBy(xpath = "//div[2]/div[2]/div/div[3]/button")
    public WebElement actionButton;

    @FindBy(xpath = "//div[3]/ul/li[1]/a")
    public WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]/span")
    public WebElement okButton;

}
