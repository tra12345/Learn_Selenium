package org.example;
import java.text.ParseException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoTables4 {
        public static void main(String[] args) throws ParseException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ntmtra\\Downloads\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/test/table.html");
            WebElement myTable = driver.findElement(By.xpath("/html/body/table/tbody"));
            List<WebElement> Row_table = myTable.findElements(By.tagName("tr"));
            int Row_Count = Row_table.size();
            for(int row = 0; row < Row_Count; row++){
                List<WebElement> Column_Row = Row_table.get(row).findElements(By.tagName("td"));
                int Column_Count = Column_Row.size();
                System.out.println("Number of cells In Row " + row + " are " + Column_Count);
                for(int column = 0; column<Column_Count; column++){
                    String celtext = Column_Row.get(column).getText();
                    System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);

                }
                System.out.println("-------------------------------------------------- ");
            }
        }
}
