package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepairOrderPage extends BasePage {



    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement inboxDashboard;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement CongratulationTitle;


    @FindBy(xpath = "//a[@data-menu-xmlid=\"mrp_repair.menu_repair_order\"]/span")
    public WebElement repairsBTM;


    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createBTM;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveBTM;

    @FindBy(xpath = "//button[@accesskey=\"j\"]")
    public WebElement discardBTM;

   @FindBy(xpath = "//button[@accesskey=\"k\"]")
    public WebElement kanbanBTM;





}
