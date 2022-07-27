package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class Sales_PriceListsPage {


    public Sales_PriceListsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//change to pricelists
    @FindBy (xpath = "//div[1]/div[1]/div[1]/div[6]/ul[1]/li[2]/a/span")
    public WebElement ordersButton;



    public  WebElement selectRandomWebElement(List<WebElement> listWebElements) {

        Random random = new Random();

        int index = random.nextInt(listWebElements.size());

        return listWebElements.get(index);


    }


    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[6]/ul[3]/li[2]/a")
    public WebElement priceListsButton;


    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButtonPriceLists;


    @FindBy(xpath = "//div[1]/div[2]/div[2]//div[2]/h1/input")
    public  WebElement nameInputBox;

    @FindBy(xpath = "//div[1]/div[2]/div[2]//div/table/tbody/tr[2]/td[2]/input")
    public  WebElement ecommerceInputBox;

    @FindBy(xpath = "//div[1]/div[2]/div[2]//div/table/tbody/tr[5]/td[2]//div/input")
    public  WebElement allowToUseDropButton;

    @FindBy(xpath = "//body/ul[2]/li")
    public List<WebElement> selectAllowToUse;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]//div[2]/button[1]")
    public WebElement saveButton;


    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[3]/div[3]/button[1]")
    public WebElement listButton;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    public  WebElement kanbanButton;


    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]//div[2]/button[2]")
    public WebElement discardButton;


    @FindBy(xpath = "//div[5]//div[3]/button[1]/span")
    public WebElement okWarningButton;


    @FindBy (xpath = "//div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public  WebElement newSaveButton;

    @FindBy(xpath = "//div[1]/div[2]/div[2]//div/table/tbody/tr/td[3]")
    public List<WebElement> selectPriceList;


    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[2]//div[3]/button")
    public  WebElement actionButton;


    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[2]/div[2]//div[3]/ul/li[1]/a")
    public  WebElement deleteButton;


    @FindBy(xpath = "//div[5]//div[3]/button[1]/span")
    public WebElement okDeleteButton;



}


