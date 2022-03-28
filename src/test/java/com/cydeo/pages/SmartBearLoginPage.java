package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {

    public SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//input[@id='ctl00_MainContent_username']" )
    public WebElement usernameInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement loginButton;


}
