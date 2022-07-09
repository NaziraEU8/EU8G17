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
}
