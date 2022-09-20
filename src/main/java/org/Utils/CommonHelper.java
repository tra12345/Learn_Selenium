package org.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonHelper {

    public static WebDriver GetChromeDriver(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public static void AccessURL(WebDriver driver, String url){
        driver.get(url);
    }
}
