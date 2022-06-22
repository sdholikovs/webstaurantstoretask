package com.webstaurantstore.tests.task;

import com.webstaurantstore.utils.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class WebstrauntstoreTestBase {
    protected WebDriver driver;
    String url = "https://webstaurantstore.com";

    @BeforeMethod
    public void setUp() {

        driver = Driver.getDriver();
        driver.get(url);

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
