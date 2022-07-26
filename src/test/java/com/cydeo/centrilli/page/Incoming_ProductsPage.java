package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Incoming_ProductsPage {

    public Incoming_ProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[1]/div[1]/div[1]/div[9]/ul[2]/li[1]/a/span")
    public WebElement incomingProductsButton;

}
