package com.cydeo.centrilli.page;


import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class    EmployeeButtonPage extends BasePage {

    public EmployeeButtonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "login")
    public WebElement loginInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[text() = 'Log in']")
    public WebElement btnButton;

    @FindBy(xpath = "//li[.='#Inbox']")
    public WebElement InboxHeader;


    @FindBy(xpath = "//button[@data-original-title='List']")
    public WebElement listButton;

    @FindBy(xpath = "//tr/th[.='Name']")
    public WebElement listDisplayed;

    @FindBy(xpath = "//button[@data-original-title='Kanban']")
    public WebElement kanbanButton;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;



    @FindBy(xpath = "//span[.='David Samson']")
    public WebElement davidEmployeeContact;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;



}
