package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        String Url = "http://11.11.7.250:8888/account/login?ReturnUrl=%2F";
        /*String Title = driver.getTitle();
        System.out.println(Title);*/
        driver.navigate().to(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts();
        WebElement myUser = driver.findElement(By.cssSelector("#Username"));

        WebElement myPass = driver.findElement(By.cssSelector("#Password"));

        myUser.sendKeys("sksadmin1");
        myPass.sendKeys("123456x@l");
        System.out.println("Text Field Set");

        myPass.clear();
        myUser.clear();
        System.out.println("Text Field Cleared");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.get(Url);
        driver.findElement(By.cssSelector("#Username")).sendKeys("Sysadmin1");
        driver.findElement(By.cssSelector("#Password")).sendKeys("123456x@X");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println("successfully");
        driver.findElement(By.cssSelector("a[title='Master Schedule']")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Add Contact']")).click();

    }
}