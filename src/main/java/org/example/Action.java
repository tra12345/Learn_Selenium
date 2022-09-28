package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/social-icon.html";
        driver.get(baseUrl1);
        String expectedTooltip = "Github";
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
        String actuaTootip = github.getAttribute("title");
        System.out.println("Actual Tootip is" + actuaTootip);
        if(actuaTootip.equals(expectedTooltip)){
            System.out.println("Test case passed");
        }
        driver.close();
    }
}
