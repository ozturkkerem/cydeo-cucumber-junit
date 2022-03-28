package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPage {

    public WikipediaSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='searchInput']")
    public WebElement searchBox;

    @FindBy(xpath = "//h1[@id='firstHeading']")
    public WebElement header;

    @FindBy(xpath = "//input[@id='searchButton']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@href='/wiki/File:Steve_Jobs_Headshot_2010-CROP_(cropped_2).jpg']")
    public WebElement imagine;
}
