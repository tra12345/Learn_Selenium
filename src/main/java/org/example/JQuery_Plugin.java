package org.example;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Locale;

public class JQuery_Plugin {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/tooltip.html";
        driver.get(baseUrl1);
        String expectedTooltip = "What's new in 3.2";
        WebElement Download = driver.findElement(By.xpath("//a[@id='download_now']"));
        Actions builder = new Actions(driver);
        builder.clickAndHold().moveToElement(Download);
        builder.moveToElement(Download).build().perform();
        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
        String actualTooltip = toolTipElement.getText();
        System.out.println("Actual Title of Tool Tip  "+ actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        else {
            System.out.println("Test case failed");
        }
        driver.close();
    }
}
