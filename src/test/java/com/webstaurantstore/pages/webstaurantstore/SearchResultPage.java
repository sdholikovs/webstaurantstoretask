package com.webstaurantstore.pages.webstaurantstore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage{

    @FindBy(xpath= "//a[@data-testid='itemDescription']")
    public List<WebElement> results;


    }




