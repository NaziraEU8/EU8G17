package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement emailInputBox;


    @FindBy(name = "password")
    public WebElement passwordInputBox;

    @FindBy(xpath= "//button[.='Log in']")
    public WebElement loginButton;


    //saadet login information
    @FindBy(xpath = "//input[@id='login']")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.=\"Log in\"]")
    public WebElement submit;

    @FindBy(xpath = "//li[.='#Inbox']")
    public WebElement inboxSubTitle;


/*

    public void login(String username, String password) {
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submit.submit();
    }
*/










}
