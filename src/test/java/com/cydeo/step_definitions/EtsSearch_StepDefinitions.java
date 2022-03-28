package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsSearch_StepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();
    String searchWord;

    @When("user is on www.etsy.com")
    public void user_is_on_https_www_etsy_com() {

        Driver.getDriver().get("https://www.etsy.com/");
    }
    @Then("User sees title is as expected")
    public void user_sees_title_is_as_expected() {
        Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",Driver.getDriver().getTitle());
    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        String actualTitle= Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Wooden spoon";

        Assert.assertTrue(actualTitle.contains(expectedTitle));


    }
    @When("user is on {string}")


    public void user_is_on(String string) {
        Driver.getDriver().get(string);
    }
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String string) {
        searchWord = string;
        etsySearchPage.searchBox.sendKeys(searchWord);
    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String string) {
        etsySearchPage.searchButton.click();
    }
}



