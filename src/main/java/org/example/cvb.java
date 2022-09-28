package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
public class cvb {
    String driverPath = "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe";
    private WebDriver driver;
    public String url = "http://demo.guru99.com/test/newtours/";

    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    @Test
    public void verifyHomepageTitle() {

        System.out.println("launching chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }
}

