package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity15 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        System.out.println("Home page title: " + driver.getTitle());

        driver.findElement(By.xpath("//input[starts-with(@class,'username-')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class,'password-')]")).sendKeys("password");
        //driver.findElement(By.xpath("//button[@class,'ui button'")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Print the login message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();
    }
    }
