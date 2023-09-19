package Project_CRMSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class activity4_Java {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
        System.out.println("login page title :"+driver.getTitle());
        driver.findElement(By.id("user_name")).sendKeys("admin");
        driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String url = driver.getCurrentUrl();
        System.out.println("new page title : "+url);
        assertTrue(url.contains("Home"));


        driver.close();
    }
}
