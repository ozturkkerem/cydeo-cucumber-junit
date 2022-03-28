package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmartBearWebOrderPage {

    public SmartBearWebOrderPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//a[text()='Order']")
    public WebElement orderButton;

    @FindBy (xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productSelect;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantityInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerNameInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")
    public WebElement streetInput;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement city;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")
    public WebElement state;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zip;

    @FindBy (xpath = "//input[@value='Visa']")
    public WebElement visaPayment;

    @FindBy (xpath = "//input[@value='MasterCard']")
    public WebElement masterCardPayment;

    @FindBy (xpath = "//input[@value='American Express']")
    public WebElement americanExpress;


    public List<WebElement> list = new ArrayList<>(Arrays.asList(visaPayment,masterCardPayment,americanExpress));

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNumber;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")
    public WebElement expiredDay;

    @FindBy (xpath = "//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")
    public WebElement processButton;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrder;

    @FindBy (xpath = "//tr[2]/td[2]")
    public WebElement tableCustomerName;





}
