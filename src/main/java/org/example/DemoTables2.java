package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class DemoTables2 {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseUrl1 = "http://demo.guru99.com/test/web-table-element.php";
        driver.get(baseUrl1);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement BaseTable = driver.findElement(By.tagName("table"));
        WebElement row = BaseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        System.out.println(row.getText());
        WebElement col = BaseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        System.out.println(col.getText());


    }
}
