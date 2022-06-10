package com.webstaurantstore.tests.task;

import com.webstaurantstore.pages.webstaurantstore.SearchResultPage;
import com.webstaurantstore.pages.webstaurantstore.WebstaurantstoreHomePage;

import com.webstaurantstore.utils.BrowserUtils;
import com.webstaurantstore.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SearchItemTest extends WebstrauntstoreTestBase {

    WebstaurantstoreHomePage webstaurantstoreHomePage = new WebstaurantstoreHomePage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Test
    public void stainlessWorkTableSearchTest() throws InterruptedException {

        // I just want make sure that I am at correct homepage to continue my testing
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        webstaurantstoreHomePage.searchBox.clear();
        webstaurantstoreHomePage.searchBox.sendKeys("stainless work table" + Keys.ENTER);

        List<String> elementsText = BrowserUtils.getElementsText(searchResultPage.results);
        for (String each : elementsText) {
            Assert.assertTrue(each.contains("Table"));
        }

        driver.findElement(By.xpath("//li[@class='rc-pagination-item rc-pagination-item-9']/a[.='9']")).click();
        driver.findElement(By.xpath("(//a[@data-testid='itemDescription'])[60]")).click();
        driver.findElement(By.xpath("//input[@id='buyButton']")).click();
        driver.findElement(By.xpath("//span[.='Cart']")).click();
        driver.findElement(By.xpath("//button[.='Empty Cart']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(.,'Empty')])[2]"))).click();

        WebDriverWait waitAgain = new WebDriverWait(driver, 10);
        waitAgain.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartItemCountSpan")));
        Thread.sleep(1234);// usually,I dont use java's this type of wait in real projects, i just used for this task.
        int countOfCartItems = Integer.parseInt(driver.findElement(By.id("cartItemCountSpan")).getText());
        System.out.println("countOfCartItems = " + countOfCartItems);
        Assert.assertTrue(countOfCartItems == 0);// I want make sure cart is really empty


    }


}





