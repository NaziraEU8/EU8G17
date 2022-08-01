        package com.cydeo.centrilli.step_definitions;


        import com.cydeo.centrilli.page.CustomerCreatePage;
        import com.cydeo.centrilli.page.SaleFunctionallityPage;
        import com.cydeo.centrilli.utilities.BrowserUtils;
        import com.cydeo.centrilli.utilities.Driver;
        import com.github.javafaker.Faker;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.Keys;

        public class CustomerCreated_stepDefinitions {

         CustomerCreatePage customerCreatePage = new CustomerCreatePage();
         SaleFunctionallityPage sale= new SaleFunctionallityPage();
         Faker faker = new Faker();
         String name = faker.name().fullName();

         @When("user clicks on customer button")
         public void user_clicks_on_customer_button() {
         BrowserUtils.sleep(4);
          customerCreatePage.customerButton.click();

          }

         @Then("user clicks create button for customer")
         public void user_clicks_create_button() {
          BrowserUtils.sleep(5);
          customerCreatePage.createButton.click();

         }

         @Then("user fills all the fields for the customer")
         public void user_fills_all_the_fields() {
          //send full name
          customerCreatePage.nameBox.sendKeys("Anna");
          //address box
        //  String address = faker.address().fullAddress();
        // customerCreatePage.streetInput.sendKeys(address);
          //job Position
         customerCreatePage.getJobPosition.sendKeys("Sales Director");
        //  //enter phone number
        String phone = faker.phoneNumber().cellPhone();
         customerCreatePage.phoneInput.sendKeys(phone);
          BrowserUtils.sleep(3);

         }

         @Then("user clicks save button at customer created")
         public void user_clicks_save_button() {
         customerCreatePage.saveButton.click();
         BrowserUtils.sleep(5);

         }

         @Then("user should see the new created customer from Sale module")
        public void user_should_see_the_new_created_customer_from_sale_module() {
          String expectedtittle = "Anna - Odoo";
          Assert.assertEquals(expectedtittle, Driver.getDriver().getTitle());


         }


         // User should be able to change the name of the customer, after creating new customer
         @When("user is on customer data")
         public void userIsOnCustomerData() {
          customerCreatePage.customerButton.click();
          String expectedtittle = "Odoo";
           Assert.assertEquals(expectedtittle,Driver.getDriver().getTitle());
           BrowserUtils.sleep(3);
         }

         @And("user clicks on  edit button for customer")
         public void userClicksOnEditButton() {
          BrowserUtils.sleep(4);
          sale.getSearchBox.sendKeys("Anna");
          while (!(sale.AnnaCreatedCustomer.isDisplayed())){
           sale.nextButton.click();
           BrowserUtils.sleep(2);
          }
          System.out.println(sale.AnnaCreatedCustomer.getText());
          Assert.assertTrue(sale.AnnaCreatedCustomer.isDisplayed());

          sale.AnnaCreatedCustomer.click();
          BrowserUtils.sleep(2);
          customerCreatePage.EditButton.click();
         }
         @And("user changes customer name")
         public void userChangesCustomerName() {
          customerCreatePage.nameBox.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
         }

         @Then("user should see the customer name is changed")
         public void userShouldSeeTheCustomerNameIsChangers() {
          String expectedTittle="Odoo";
          Assert.assertTrue(customerCreatePage.customerChanged.isDisplayed());

         }


         //User should be able to see created customer is listed after
        //              clicking the Customers module.

         @When("user clicks on customer module")
         public void userClicksOnCustomerModule() {
          BrowserUtils.sleep(3);
         customerCreatePage.customerButton.click();

         }


         @Then("user should be able to see new created customer listed")
         public void userShouldBeAbleToSeeNewCreatedCustomerListed() {

         while (!(customerCreatePage.findingCustomer("Anna").isDisplayed())) {
           sale.nextButton.click();
          BrowserUtils.sleep(2);
          }
          System.out.println(customerCreatePage.findingCustomer("Anna").getText());
          Assert.assertTrue(customerCreatePage.findingCustomer("Anna").isDisplayed());
         }



        //User should be able to see that the page title changes to customer
         //           name after creating the new customer

         @When("user clicks on costumer module")
         public void userClicksOnCostumerModule() {
          BrowserUtils.sleep(3);
         customerCreatePage.customerButton.click();
         }


         @And("user fills minimum requirement field for customer")
         public void userFillsMinimumRequirementField() {
          //send full name
          customerCreatePage.createButton.click();
          BrowserUtils.sleep(2);
          customerCreatePage.nameBox.sendKeys(name);

         }

         @Then("user should be able to see the title change to customer name")
         public void userShouldBeAbleToSeeTheTitleChangeToCustomerName() {

          String expectedCustomer= name + " - Odoo";
          Assert.assertEquals(expectedCustomer, Driver.getDriver().getTitle());

         }
        }