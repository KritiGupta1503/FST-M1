package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class activity13 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("Home page title: " + driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("No. of rows in 1st table :" +rows.size());
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("no. of rows in 2nd table : "+cols.size());

// Print the cells values of the third row
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement cell : thirdRow) {
            System.out.println(cell.getText());
        }

        WebElement secondRowSecVal = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("2ndrow 2nd value is :" +secondRowSecVal.getText());

        driver.close();

    }
}
