package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WebTable_StepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();


    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));

    }
    @When("user enter username {string}")
    public void user_enter_username(String string) {
        webTableLoginPage.inputUsername.sendKeys(string);

    }
    @When("user enter password {string}")
    public void user_enter_password(String string) {
        webTableLoginPage.inputPassword.sendKeys(string);
    }
    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLoginPage.LoginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        BrowserUtils.verifyUrlContains("orders");
    }

    @When("user enter username {string} password {string} and logins")
    public void user_enter_username_password_and_logins(String username, String password) {
       webTableLoginPage.login(username,password);
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String,String> credentials) {

            //webTableLoginPage.inputUsername.sendKeys(credentials.get("username"));
            //webTableLoginPage.inputPassword.sendKeys(credentials.get("password"));
            //  webTableLoginPage.LoginButton.click();

        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));

    }

}
