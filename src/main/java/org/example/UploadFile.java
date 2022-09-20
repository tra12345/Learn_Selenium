package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;

public class UploadFile {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/upload/";
        driver.get(baseUrl1);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//        uploadElement.click();
        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("C:\\Users\\ntmtra\\Downloads\\SamplePDFForm.pdf");
        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        HashMap<String, Object> test = new HashMap<String, Object>();
        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
    }
}
