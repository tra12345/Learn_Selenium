package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import java.sql.Driver;

public class AlertDemo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/delete_customer.php";
        driver.get(baseUrl1);
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Hello word");
        driver.findElement(By.xpath("//input[@name='submit']")).submit();
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();
        // Displaying alert message
        System.out.println(alertMessage);
        // Accepting alert
        alert.dismiss();
        // alert.accept();
    }
}
