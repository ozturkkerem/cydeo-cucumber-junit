package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage{

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//select[@name='product']")
    public WebElement productDropdown;

    @FindBy (xpath = "//input[@name='quantity']")
    public WebElement inputQuantity;

    @FindBy (xpath = "//input[@placeholder='Enter the price for an individual unit']")
    public WebElement priceForUnit;

    @FindBy(xpath = "//input[contains(@placeholder,'discount')]")
    public WebElement discount;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement inputName;

    @FindBy (xpath = "//input[@name='street']")
    public WebElement inputStreet;

    @FindBy (xpath = "//input[@name='city']")
    public WebElement inputCity;

    @FindBy (xpath = "//input[@name='state']")
    public WebElement inputState;

    @FindBy (xpath = "//input[@name='zip']")
    public WebElement inputZip;

    @FindBy (name = "card")
    public List<WebElement> cardType;



    @FindBy (xpath = "//input[@name='cardNo']")
    public WebElement inputCardNo;

    @FindBy (xpath = "//input[@name='cardExp']")
    public WebElement cardExp;

    @FindBy (xpath = "//button[.='Process Order']")
    public WebElement processOrder;

    @FindBy (xpath = "//table[@class='table is-fullwidth']/tbody//tr[1]/td[1]")
    public WebElement webTable;

}
