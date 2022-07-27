package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepairOrdersPage extends BasePage {



    @FindBy(xpath = "//li[.=\"#Inbox\"]")
    public WebElement inboxDashboard;

    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement CongratulationTitle;


    @FindBy(xpath = "//a[@data-menu-xmlid=\"mrp_repair.menu_repair_order\"]/span")
    public WebElement repairsBTM;


    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createBTM;
    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement form_sheet;

    @FindBy(xpath = "//div[@name='product_id']/div/input")
    public WebElement productToRepair;
    @FindBy(xpath = "//a[.='Create and Edit...']")
    public WebElement createEditForProduct;
    @FindBy(xpath = "//button/span[.='Save']")
    public WebElement saveBtmForProduct;
    @FindBy(xpath = "//input[@name='product_qty']")
    public WebElement productQuantity;
    @FindBy(xpath = "//div[@name='partner_id']/div/input")
    public WebElement customerInfo;
    @FindBy(xpath = "(//a[.='Create and Edit...'])[2]")
    public WebElement createEditForCustomer;
    @FindBy(xpath = "//button/span[.='Save']")
    public WebElement saveBtmForCustomer;

    @FindBy(xpath = "//div[@name='address_id']/div/input")
    public WebElement deliveryAddress;


    @FindBy(xpath = "//a[contains(.,'Create and Edit')]")
    public WebElement createEditForDeliveryAddress;

    // sorun burda

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span[.='Create']")
    public WebElement saveCreateEditS;

   /* @FindBy(xpath = "//button/span[.='Save']")
    public WebElement saveBtmForDeliveryAddress;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span")
    public WebElement createBtmForDeliveryAddressSally;

    @FindBy(xpath = "//button/span[.=\'Create\']")
    public WebElement createEditBTMForDeliveryAddressSally;

    */


    @FindBy(xpath = "//div[@name='location_id']/div/input")
    public WebElement currentLocation;
    @FindBy(xpath = "//div[@name='location_dest_id']/div/input")
    public WebElement deliveryLocation;
    @FindBy(xpath = "//input[@name='guarantee_limit']")
    public WebElement warrantyExpiration;
    // SELECT Dropdown
    @FindBy(xpath = "//select[@name='invoice_method']")
    public WebElement invoiceMethod;







    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveBTM;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBTM;

    @FindBy(xpath = "//button[@accesskey=\"j\"]")
    public WebElement discardBTM;

   @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanbanBTM;

   @FindBy(xpath = "//div[@class=\'o_kanban_view o_kanban_mobile o_kanban_ungrouped\']")
    public WebElement kanban_view;








}
