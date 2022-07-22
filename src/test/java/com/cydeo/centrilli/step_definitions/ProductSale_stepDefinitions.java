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
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ProductSale_stepDefinitions {

    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();

    ProductSalePage productSalePage=new ProductSalePage();

    Faker faker = new Faker();

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


    }
    @And("user clicks create button on product")
    public void userClicksCreateButtonOnProduct() throws InterruptedException {
        BrowserUtils.sleep(5);
        productSalePage.createButton.click();
        Thread.sleep(3000);


    }

    @And("user enters product name and price")
    public void userFillsTheProductsData() throws InterruptedException {

        //users fill the product data

        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys("Tshirt");
        Thread.sleep(3000);


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

    @Then("product can be found in the search")
    public void productCanBeFoundInTheSearch() {
        BrowserUtils.sleep(5);
   productSalePage.getSearchBox.sendKeys("Tshirt");

    }


    @Given("user is on product dashboard")
    public void user_is_on_product_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);
    }
    @Then("user clicks create button for product")
    public void userClicksCreateButtonForProduct() {
        BrowserUtils.sleep(5);
        productSalePage.createButton.click();
    }


    @And("user fills the products name")
    public void userFillsTheProductsName() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys("Tshirt");
        Thread.sleep(3000);
    }

    @And("user clicks discard button displayed for product")
    public void userClicksDiscardButton() throws InterruptedException {
        Thread.sleep(3000);

     Driver.getDriver().findElement(By.xpath("//div[1]/div/div[2]/button[2]")).click();

    }

    @Then("user sees the discard is done for product")
    public void userSeesTheDiscardIsDone() {
        BrowserUtils.sleep(5);
       // Assert.assertTrue(productSalePage.WarningPopUp.isDisplayed());

        BrowserUtils.sleep(5);
       Driver.getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]/span")).click();


       BrowserUtils.sleep(5);
         Assert.assertTrue(productSalePage.discardButton.isDisplayed());
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
    public void userShouldBeAbleToSeeKanbanList() throws InterruptedException {
        Thread.sleep(300);
        BrowserUtils.sleep(5);
        Assert.assertTrue(productSalePage.kanbanButton.isEnabled());
    }

    @Then("user clicks on list button for product")
    public void userClicksOnListButton() throws InterruptedException {
        Thread.sleep(3000);
       productSalePage.listButton.click();
    }

    @And("user should be able to see list view of products")
    public void userShouldBeAbleToSeeListViewOfProducts() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(productSalePage.listButton.isEnabled());

    }

    @Given("user search for the product")
    public void userSearchForTheProduct() throws InterruptedException {
        BrowserUtils.sleep(3);
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);


       //user search for the product
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//input[@class='o_searchview_input']")).sendKeys("Tshirt"+ Keys.ENTER);
        Thread.sleep(3000);


        BrowserUtils.sleep(5);
        Thread.sleep(3000);
       Driver.getDriver().findElement(By.xpath("//div/div/div/div[1]/div[2]/strong/span")).click();
        Thread.sleep(3000);
      // while (!(productSalePage.TshirtProduct.isDisplayed())){
         //  productSalePage.TshirtProduct.click();
         //  BrowserUtils.sleep(5);
    //  }
    //    Thread.sleep(3000);
      //  System.out.println(productSalePage.TshirtProduct.getText());
       // Assert.assertTrue(productSalePage.TshirtProduct.isDisplayed());

    }
    @And("user clicks edit button for product")
    public void userClicksEditButtonForProduct() {
        BrowserUtils.sleep(5);
        productSalePage.editButton.click();
        BrowserUtils.sleep(5);
    }

    @And("user changes the data of product")
    public void userChangesTheDataOfProduct() throws InterruptedException {
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//input[@class='o_searchview_input']")).clear();
        Thread.sleep(3000);

        BrowserUtils.sleep(40);

        productSalePage.productName.sendKeys("T-shirt");
    }

    @And("user clicks save button in product")
    public void userClicksSaveButtonInProduct() {
        BrowserUtils.sleep(5);
        productSalePage.saveButton.click();
    }



    @Then("user should see the product edit is done")
    public void userShouldSeeTheProductEditIsDone() {
      String expectedProduct="Tshirt";
      Assert.assertEquals(expectedProduct,Driver.getDriver().getTitle());

    }


    @Given("user is on product data")
    public void userIsOnProductData() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);

        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//input[@class='o_searchview_input']")).sendKeys("Tshirt"+ Keys.ENTER);

        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div/div/div/div[1]/div[2]/strong/span")).click();

    }



    @Then("user clicks action button on product")
    public void userClicksActionDropbutton() throws InterruptedException {
        Thread.sleep(3000);
      BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[2]/div/div[3]/button")).click();

        Thread.sleep(3000);
      BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div/div[3]/ul/li[1]/a")).click();

    }

    @Then("user should see the confirmation message and clicks ok for product")
    public void userShouldSeeTheConfirmationMessageAndCliksOk() {
    BrowserUtils.sleep(2);

    Assert.assertTrue(productSalePage.WarningPopUp.isDisplayed());

    }

    @And("user clicks ok button on product")
    public void userClicksDeleteButton() {
        BrowserUtils.sleep(2);
        Driver.getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]/span")).click();
    }



    @And("user should see the product is deleted")
    public void userShouldSeeTheProductIsDeleted() {
    String expectedTittle="Odoo Server Error";
   Assert.assertTrue(expectedTittle,productSalePage.DeleteWarining.isDisplayed());

    }



}
