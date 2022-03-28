package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement LoginButton;

    public void login(String username, String password){


        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.LoginButton.click();

    }


    public void login(){


        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.LoginButton.click();

    }

    public void loginWithConfig(){
        inputUsername.sendKeys("web.table.username");
        inputPassword.sendKeys("web.table.pw");
         LoginButton.click();
    }
}

