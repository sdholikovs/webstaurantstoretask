package com.webstaurantstore.pages.webstaurantstore;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebstaurantstoreHomePage extends BasePage {

    @FindBy(id = "searchval")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;




}
