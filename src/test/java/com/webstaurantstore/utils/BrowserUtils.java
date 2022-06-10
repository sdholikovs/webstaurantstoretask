package com.webstaurantstore.utils;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static List<String> getElementsText(List<WebElement> webElementList){

        List<String> actualAsString = new ArrayList<>();

        for (WebElement each : webElementList) {

            actualAsString.add(each.getText());

        }

        return actualAsString;

    }

}
