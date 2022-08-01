package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    @FindBy (xpath="(//span[contains(text(),'Create')])[1]")
    public WebElement createBtnAlert;


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

   @FindBy (xpath = "//div[contains(text(),'Purchase')]")
    public  WebElement PurchasePageTitle;

    public void clickPurchaseTab(){
        purchasesTab.click();
    }

    @FindBy(xpath="//a[contains(text(),'[312] apple')]")
    public  WebElement Data312;

    @FindBy(xpath="//a[contains(text(),'Abata')]")
    public  WebElement AbataData;

    public boolean purchasePageIsDisplayed(){
        return  PurchasePageTitle.isDisplayed();
    }

    public void clickCreateBtn(){
        createBtn.click();
    }
    public void clickTab(){
        SelectVendorBox.sendKeys(Keys.TAB);
    }
    public void selectVendor(String vendor){
        SelectVendorBox.sendKeys(vendor);
        ///SelectVendorBox.sendKeys(Keys.TAB);
    }

    public void  clickAddItem(){
//        Actions action = new Actions(Driver.getDriver());
//        action.doubleClick(AddItemBtn).perform();
        AddItemBtn.click();
    }

    public void selectProduct(String product){
        ProductDropDownBtn.sendKeys(product);
//        Actions pressBtn= new Actions(Driver.getDriver());
//        pressBtn.sendKeys(Keys.chord(Keys.SPACE)).perform();
//        pressBtn.sendKeys(Keys.chord(Keys.ENTER)).perform();

        Data312.click();
        BrowserUtils.waitFor(2);



    }
    public void clickSaveBtn(){
        Savebtn.click();
    }


    public void clickCreateBtnAlert(){
        createBtnAlert.click();
    }


    @FindBy(xpath = "//span[contains(text(),'New')])")
    public WebElement newTexboxTitle;





}
