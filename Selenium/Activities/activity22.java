package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class activity22 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions builder = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/popups");
        System.out.println("Home page title: " + driver.getTitle());
        WebElement button = driver.findElement(By.className("ui huge inverted orange button"));
        builder.moveToElement(button).build().perform();
        System.out.println(button.getAttribute("data-tooltip"));
        button.click();
    }
}

