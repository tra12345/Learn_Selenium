package org.example;

import org.Utils.CommonHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/radio.html";
        driver.get(baseUrl1);
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
        //Radio Button1 is selected
        radio1.click();
        System.out.println("Radio Button Option 1 Selected");
        radio2.click();
        System.out.println("Radio Button Option 2 Selected");
        radio3.click();
        System.out.println("Radio Button Option 3 selected");
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));
        option1.click();

        if (option1.isSelected()) {
            System.out.println("Checkbox is Toggled On");

        } else {
            System.out.println("Checkbox is Toggled Off");
        }
    }
}
