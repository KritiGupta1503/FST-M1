package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class activity2 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the page is :" +driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.className("ui button")).click();
        //driver.findElement(By.class("button")).click();
        System.out.println("message on confirmation page is :" +driver.findElement(By.id("action-confirmation")).getText());
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.close();
    }
}
