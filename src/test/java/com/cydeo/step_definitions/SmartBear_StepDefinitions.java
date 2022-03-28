package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearLoginPage;
import com.cydeo.pages.SmartBearWebOrderPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


public class SmartBear_StepDefinitions {

    SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
    SmartBearWebOrderPage smartBearWebOrderPage = new SmartBearWebOrderPage();
    String nameOfCustomer;


    @When(":User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?Return\n" +
                "Url=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx");
        smartBearLoginPage.usernameInput.sendKeys("Tester");
        smartBearLoginPage.passwordInput.sendKeys("test");
        smartBearLoginPage.loginButton.click();
        smartBearWebOrderPage.orderButton.click();


    }

    @When(":User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select productSel = new Select(smartBearWebOrderPage.productSelect);
        productSel.selectByVisibleText(string);

    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        // Write code here that turns the phrase above into concrete actions
        smartBearWebOrderPage.quantityInput.sendKeys(string);
    }



    @When(":User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearWebOrderPage.customerNameInput.sendKeys(customerName);
        nameOfCustomer = customerName;
    }

    @When(":User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearWebOrderPage.streetInput.sendKeys(string);

    }

    @When(":User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearWebOrderPage.city.sendKeys(string);

    }

    @When(":User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearWebOrderPage.state.sendKeys(string);

    }

    @When(":User enters {string} zipcode")
    public void user_enters(String string) {
        smartBearWebOrderPage.zip.sendKeys(string);

    }

    @When(":User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        if (smartBearWebOrderPage.visaPayment.getAttribute("value").contains(string))
            smartBearWebOrderPage.visaPayment.click();
        if (smartBearWebOrderPage.americanExpress.getAttribute("value").contains(string))
            smartBearWebOrderPage.americanExpress.click();
        if (smartBearWebOrderPage.masterCardPayment.getAttribute("value").contains(string))
            smartBearWebOrderPage.masterCardPayment.click();

    }

    @When(":User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearWebOrderPage.cardNumber.sendKeys(string);
    }

    @When(":User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearWebOrderPage.expiredDay.sendKeys(string);
    }

    @When(":User clicks process button")
    public void user_clicks_process_button() {
        // Write code here that turns the phrase above into concrete actions
        smartBearWebOrderPage.processButton.click();
    }

    @Then(":verifies {string} is in the list")
    public void verifies_is_in_the_list(String string) {
        ;
        smartBearWebOrderPage.viewAllOrder.click();
        Assert.assertEquals(nameOfCustomer,smartBearWebOrderPage.tableCustomerName.getText());
    }


}
