package com.webstaurantstore.pages.webstaurantstore;


import com.webstaurantstore.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver;
    public BasePage() {PageFactory.initElements(Driver.getDriver(), this);
    }
}
