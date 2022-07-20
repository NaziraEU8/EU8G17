package com.cydeo.centrilli.step_definitions;

import com.cydeo.centrilli.page.BasePage;
import com.cydeo.centrilli.page.LoginPage;
import com.cydeo.centrilli.page.ProductSalePage;
import com.cydeo.centrilli.page.EmployeeButtonPage;
import com.cydeo.centrilli.utilities.BrowserUtils;
import com.cydeo.centrilli.utilities.ConfigurationReader;
import com.cydeo.centrilli.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductSale_stepDefinitions {

    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();

    ProductSalePage productSalePage=new ProductSalePage();

   // Faker faker = new Faker();

    @Given("user is on the centrilli login page")
    public void userIsOnTheCentrilliLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("user enters username and password as posmanager")
    public void userEntersUsernameAndPassword() {
       loginPage.emailInputBox.sendKeys(ConfigurationReader.getProperty("email"));
       loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();
    }

    @Given("user clicks on sale button")
    public void userClicksOnCRMModule() {
        BrowserUtils.sleep(4);
        basePage.salesModule.click();

    }


    @When("user clicks products button")
    public void userClicksProductsButton() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);

        //productSalePage.productButton.click();
        
    }

    @And("user fills the products data")
    public void userFillsTheProductsData()  {
        BrowserUtils.sleep(5);
        productSalePage.createButton.click();

        //users fill the product data
      //  String name=faker.commerce().productName();
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys("Tshirt");
        //checkbox
        BrowserUtils.sleep(5);
    if(!productSalePage.canBeSoldCheckBox.isSelected()){
         productSalePage.canBeSoldCheckBox.click();
     }else{
         System.out.println("Can be sold check box is selected");
     }

      BrowserUtils.sleep(5);
        //product type
         Select selectObj=new Select(productSalePage.ProductTypeSelect("selectingProductType"));
       selectObj.selectByIndex(2);
     //selecting category of product
        BrowserUtils.sleep(5);
        Select productCategory=new Select(productSalePage.categorySelected);
        productCategory.selectByIndex(4);

        //sale price
       // String salePrice= faker.commerce().price();
        BrowserUtils.sleep(5);
        productSalePage.salePrice.sendKeys("20");

        //cost price
        BrowserUtils.sleep(5);
      //  String costPrice=faker.commerce().price();
        productSalePage.costPrice.sendKeys("10");
    }


    @Then("user clicks save button for product")
    public void userClicksSaveButton() {
    BrowserUtils.sleep(5);
    productSalePage.saveButton.click();

    }

    @Given("user is on product dashboard")
    public void user_is_on_product_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);
    }


    @And("user fills the products name")
    public void userFillsTheProductsName() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys("Tshirt");
        Thread.sleep(3000);
    }

    @And("user clicks discard button displayed")
    public void userClicksDiscardButton() throws InterruptedException {
        Thread.sleep(3000);

     Driver.getDriver().findElement(By.xpath("//div[1]/div/div[2]/button[2]")).click();

    }

    @Then("user sees the discard is done")
    public void userSeesTheDiscardIsDone() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(productSalePage.WarningPopUp.isDisplayed());

        BrowserUtils.sleep(5);
       Driver.getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]/span")).click();

    }

    @Given("user is on product  dashboard")
    public void userIsOnProductDashboard() throws InterruptedException {
        BrowserUtils.sleep(3);
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);

        String expectedTitle = "Products - Odoo";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

    }

    @Then("user clicks on kanban button for product")
    public void userClicksOnKanbanButton() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(10);
        Driver.getDriver().findElement(By.xpath("//button[@data-original-title='Kanban']")).click();
        Thread.sleep(3000);
    }

    @And("user should be able to see Kanban list")
    public void userShouldBeAbleToSeeKanbanList() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(basePage.kanbanButton.isEnabled());
    }

    @Then("user clicks on list button for product")
    public void userClicksOnListButton() throws InterruptedException {
        Thread.sleep(3000);
        basePage.listButton.click();
    }

    @And("user should be able to see list view of products")
    public void userShouldBeAbleToSeeListViewOfProducts() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(basePage.listButton.isEnabled());

    }

    @Given("user search for the product")
    public void userSearchForTheProduct() throws InterruptedException {
        BrowserUtils.sleep(3);
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);


       //user search for the product
            BrowserUtils.sleep(2);
        productSalePage.getSearchBox.sendKeys("Tshirt");
        while (!(productSalePage.TshirtProduct.isDisplayed())){
            productSalePage.kanbanButton.click();
            BrowserUtils.sleep(2);
        }
        System.out.println(productSalePage.TshirtProduct.getText());
        Assert.assertTrue(productSalePage.TshirtProduct.isDisplayed());

       productSalePage.TshirtProduct.click();
        BrowserUtils.sleep(2);


    }


    @And("user changes the data")
    public void userChangesTheData() {
        BrowserUtils.sleep(4);
        productSalePage.editButton.click();
        BrowserUtils.sleep(2);
     productSalePage.productName.sendKeys("T-shirt");
    }

    @Then("user should see the product edit is done")
    public void userShouldSeeTheProductEditIsDone() {

      String expectedProduct="Tshirt";
      Assert.assertEquals(expectedProduct,Driver.getDriver().getTitle());

    }

    @Given("user is on product data")
    public void userIsOnProductData() {

        Assert.assertTrue(productSalePage.TshirtProduct.isDisplayed());

    }

    @Then("user clicks action button")
    public void userClicksActionDropbutton() {
      BrowserUtils.sleep(4);
      productSalePage.actionDropdown.click();
    BrowserUtils.sleep(3);
    productSalePage.deleteButton.click();

    }

    @Then("user should see the confirmation message and clicks ok")
    public void userShouldSeeTheConfirmationMessageAndCliksOk() {
    BrowserUtils.sleep(3);

    Assert.assertTrue(productSalePage.WarningPopUp.isDisplayed());

    }

    @And("user clicks ok button")
    public void userClicksDeleteButton() {
        BrowserUtils.sleep(2);
        productSalePage.OkButton.click();
    }



    @And("user should see the product is deleted")
    public void userShouldSeeTheProductIsDeleted() {
    String expectedTittle="Product - Odoo";
    Assert.assertEquals(expectedTittle,Driver.getDriver().getTitle());

    }


}
