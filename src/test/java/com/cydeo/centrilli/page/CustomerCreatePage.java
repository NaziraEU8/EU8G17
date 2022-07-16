package com.cydeo.centrilli.page;


import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerCreatePage {

    public CustomerCreatePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[data-menu='447'] span")
    public WebElement customerButton;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy(name = "street")
    public WebElement addressBox;

    @FindBy(className = "o_input_dropdown")
    public WebElement companyBox;

    @FindBy(name = "function")
    public WebElement jobPosition;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    public WebElement findingCustomer(String Anna) {
        String element ="html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/ul/li[1]";
        return Driver.getDriver().findElement(By.xpath(element));
    }

  @FindBy(xpath = "//td/div/input[@name='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li[1]/a")
    public WebElement customerChanged;

    @FindBy(xpath = "/div[1]/div/div[3]/h1/input")
    public WebElement nameInput;

    @FindBy(id = "o_field_input_658")
    public WebElement streetInput;

    @FindBy(id = "o_field_input_666")
    public WebElement getJobPosition;

    @FindBy(id = "o_field_input_667")
    public WebElement phoneInput;

    @FindBy(id = "o_field_input_655")
    public WebElement getCompanyBox;

    @FindBy(css = ".o_form_button_edit")
    public WebElement EditButton;

    @FindBy(css = ".o_form_button_save")
    public WebElement saveButton;

}
