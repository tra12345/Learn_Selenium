package org.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test {
        private static String URL = "http://demo.guru99.com/test/radio.html";

        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");

            var driver = CommonHelper.GetChromeDriver();
            CommonHelper.AccessURL(driver, URL);

            WebElement Radio1 = driver.findElement(By.id("vfb-7-1"));
            WebElement Radio2 = driver.findElement(By.id("vfb-7-2"));
            WebElement Radio3 = driver.findElement(By.id("vfb-7-3"));
            Radio1.click();
            System.out.println("Choose Radio 1");
        }

    }
