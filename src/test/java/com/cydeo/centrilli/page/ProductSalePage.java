package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ProductSalePage {


    @FindBy(css = "a[data-menu='445'] span")
    public WebElement SaleButton;

    @FindBy(xpath = "//div[1]/div/div[2]/button[2]")
    public WebElement discardButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button[1]/span")
    public WebElement OkButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[3]/button/span")
    public WebElement OkButton2;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement WarningPopUp;

    @FindBy(xpath = "//div[6]/ul[3]/li[1]/a/span")
    public WebElement productButton;

   @FindBy(xpath = "//div[1]/div/div[2]/button[1]")
   public WebElement saveButton;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//div[5]/div/div[1]/div/input")
    public WebElement canBeSoldCheckBox;

        @FindBy(xpath = "//table[1]/tbody/tr[2]/td[2]/div/div/input")
    public WebElement categorySelected;

    @FindBy(xpath = "//div/table[2]/tbody/tr[1]/td[2]/div/input")
    public WebElement salePrice;

    @FindBy(xpath = "//div[1]/div/table[2]/tbody/tr[5]/td[2]/div/div/div/input")
    public WebElement costPrice;

    @FindBy(xpath = "//div[1]/div[2]/div[5]/h1/input")
    public WebElement productName;

    @FindBy(xpath = "//div[3]/div[3]/button[2]")
    public WebElement listButton;

    @FindBy(xpath = "//button[@data-original-title='Kanban']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement getSearchBox;

    @FindBy(xpath = "//div/div/div/div[1]/div[2]/strong/span")
    public WebElement TshirtProduct;

    @FindBy(xpath = "//div[2]/div/div[3]/button")
    public WebElement actionDropdown;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[1]/div/div[1]/button[1]")
    public WebElement editButton;

    @FindBy(xpath = "//div/div[3]/ul/li[1]/a")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[5]/div[2]/strong/span")
    public WebElement CarProduct;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[1]/h4")
    public WebElement DeleteWarning;

    @FindBy(xpath = "//div/table/thead/tr/th[1]/div/input")
    public WebElement NameListBox;

    @FindBy(xpath = "//div/div[1]/div[2]/strong/span")
    public WebElement firstProduct;




    }



    
    
    
    

