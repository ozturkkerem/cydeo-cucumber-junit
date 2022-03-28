package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

public class Wikipedia_StepDefinitions {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();

    @When(":User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

        wikipediaSearchPage.searchBox.sendKeys(string);
    }

    @When(":User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        // Write code here that turns the phrase above into concrete actions
        wikipediaSearchPage.searchButton.click();
    }

    @Then(":User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
        // Write code here that turns the phrase above into concrete actions

        String expectedTitle = string+" - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then(":User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        String expectedHeader = string;

        String actualHeader = wikipediaSearchPage.header.getText();

        Assert.assertEquals(expectedHeader,actualHeader);
    }

    @When(":User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }


    @Then(":User sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        String expectedImagePath= "https://en.wikipedia.org/wiki/File:Steve_Jobs_Headshot_2010-CROP_(cropped_2).jpg";
        String actualImagePath= wikipediaSearchPage.imagine.getAttribute("href");
        Assert.assertEquals(expectedImagePath,actualImagePath);
    }



}
