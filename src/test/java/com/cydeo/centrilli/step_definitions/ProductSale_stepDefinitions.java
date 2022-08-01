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
import org.apache.commons.collections.functors.WhileClosure;
import org.bouncycastle.jce.provider.BrokenPBE;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class ProductSale_stepDefinitions {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    ProductSalePage productSalePage = new ProductSalePage();

    Faker faker = new Faker();

    @Given("user is on the centrilli login page as posmanager")
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
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[1]/div/button[1]")).click();
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
        //   Thread.sleep(3000);
        //    BrowserUtils.sleep(5);
        //    productSalePage.salePrice.sendKeys("2.00");

        //cost price
        //   BrowserUtils.sleep(5);
        //  String costPrice=faker.commerce().price();
        //   productSalePage.costPrice.sendKeys("1.00");
    }


    @Then("user clicks save button for product")
    public void userClicksSaveButton() {
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div/div[2]/button[1]")).click();

    }

    @Then("product is saved successfully")
    public void productCanBeFoundInTheSearch() {
        BrowserUtils.sleep(5);
        String expectedResult = "Tshirt - Odoo";
        Assert.assertEquals(expectedResult, Driver.getDriver().getTitle());


    }


    @Given("user is on product dashboard")
    public void user_is_on_product_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(3);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);
    }

    @Then("user clicks create button for product")
    public void userClicksCreateButtonForProduct() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[1]/div/button[1]")).click();
        Thread.sleep(3000);

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
    public void userSeesTheDiscardIsDone() throws InterruptedException {
        BrowserUtils.sleep(5);
        // Assert.assertTrue(productSalePage.WarningPopUp.isDisplayed());

        BrowserUtils.sleep(5);

        Driver.getDriver().findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]/span")).click();

        Thread.sleep(300);
        BrowserUtils.sleep(5);
        String expectedTitle = "Products - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Given("user is on products list dashboard")
    public void userIsOnProductDashboard() throws InterruptedException {
        BrowserUtils.sleep(5);
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[6]/ul[3]/li[1]/a/span")).click();
        Thread.sleep(3000);

        String expectedTitle = "Products - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());

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

        Thread.sleep(3000);
        String expectedTitle = "Products - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("user clicks on list button for product")
    public void userClicksOnListButton() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[3]/div[3]/button[2]")).click();
        Thread.sleep(3000);
    }

    @And("user should be able to see list view of products")
    public void userShouldBeAbleToSeeListViewOfProducts() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        String expectedTitle = "Products - Odoo";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        // Assert.assertTrue(productSalePage.NameListBox.isDisplayed());
        Thread.sleep(300);

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
        Driver.getDriver().findElement(By.xpath("//input[@class='o_searchview_input']")).sendKeys("Tshirt" + Keys.ENTER);
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
    public void userClicksEditButtonForProduct() throws InterruptedException {
        Thread.sleep(300);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[2]/div[1]/div[2]/div[1]/div/div[1]/button[1]")).click();
        Thread.sleep(300);

    }

    @And("user changes the data of product")
    public void userChangesTheDataOfProduct() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);

        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div[2]/div[5]/h1/input")).sendKeys("T-shirt");
        Thread.sleep(3000);

    }


    @And("user clicks save button in product")
    public void userClicksSaveButtonInProduct() throws InterruptedException {
        Thread.sleep(3000);
        BrowserUtils.sleep(5);
        Driver.getDriver().findElement(By.xpath("//div[1]/div/div[2]/button[1]")).click();
    }

    @Then("user should see the product edit is done")
    public void userShouldSeeTheProductEditIsDone() {
        String expectedProduct = "Tshirt - Odoo";
        Assert.assertEquals(expectedProduct, Driver.getDriver().getTitle());

    }















    }







