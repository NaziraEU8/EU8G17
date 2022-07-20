package com.cydeo.centrilli.page;

import com.cydeo.centrilli.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSale {

    public PointOfSale(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
