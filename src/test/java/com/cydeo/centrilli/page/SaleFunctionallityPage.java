    package com.cydeo.centrilli.page;


    import com.cydeo.centrilli.utilities.Driver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

    public class SaleFunctionallityPage {

        public SaleFunctionallityPage() {

            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(id = "login")
        public WebElement emailInput;


        @FindBy(name = "password")
        public WebElement passwordInput;

        @FindBy(xpath = "//*[text() = 'Log in']")
        public WebElement btnButton;


        @FindBy(css = "a[data-menu='445'] span")
        public WebElement getSaleButton;


        @FindBy( xpath = "//div//span[2]/button[2] ")
        public WebElement nextButton;

        @FindBy(xpath = "//button[.='Previous']")
        public WebElement previousButton;

        @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/thead/tr/th[2]")
        public WebElement listButton;

       // @FindBy(xpath = "//tr/th[.='Name']")
       // public WebElement listDisplayed;

        @FindBy(xpath = "//button[@data-original-title='Kanban']")
        public WebElement kanbanButton;

        @FindBy(xpath = "//input[@class='o_searchview_input']")
        public WebElement getSearchBox;

       @FindBy(xpath = "//div[20]/div[2]/strong/span")
       public WebElement AnnaCreatedCustomer;

          @FindBy(xpath = "//div[2]/div[1]/div/button[2]")
        public WebElement importButton;

          @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/form/div[1]/div[2]/div/span[1]/label")
        public WebElement loadFileButton;

         @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol")
        public WebElement customerDashboard;

        @FindBy(css = "a[data-menu='447'] span")
        public WebElement customerButton;

        @FindBy(xpath = "//div[2]/form/div[1]/div[2]/div/input")
        public WebElement ImportBox;




















    }
