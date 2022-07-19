package com.cydeo.centrilli.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CRMPage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Pipeline')]")
    public WebElement pipelineMenu;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement opportunityTitleInput;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    public WebElement customerInputBox;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMoreCustomerLink;

    @FindBy(xpath = "//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr")
    public List<WebElement> customersList;

    @FindBy(xpath = "//input[@name='planned_revenue']")
    public WebElement expectedRevenueInputBox;

    @FindBy(xpath = "//table[@class='o_group o_inner_group o_group_col_6']/tbody/tr[4]/td[2]/div/a")
    public List<WebElement> priorityList;

    @FindBy(xpath = "//span[.='Create']")
    public WebElement createButtonFromCreateOpportunity;

    @FindBy(xpath = "//div[@class='o_kanban_view o_kanban_small_column o_opportunity_kanban o_kanban_grouped ui-sortable']")
    public WebElement kanbanViewTable;

    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanChangeViewButton;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[3]/div[3]/button[2]")
    public WebElement listChangeViewButton;

    @FindBy(xpath = "//table/tbody/tr")
    public List<WebElement> opportunitiesList;

    @FindBy(xpath = "//button[contains(text(),'Edit')]")
    public WebElement editButton;

    @FindBy(xpath = "//a[@class='o_form_uri o_field_widget']")
    public WebElement customerName;

    @FindBy(xpath = "//button[contains(text(),'Discard')]")
    public WebElement discardButton;

    @FindBy(xpath = "//span[.='Ok']")
    public WebElement okPopUpButton;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;




}
