package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
        System.out.println("title of the page: " + driver.getTitle());
        //driver.findElement(By.className("ui inverted huge green button")).click();
        driver.findElement(By.xpath("//a[@ID='about-link']")).click();
        System.out.println("title of the next page: " + driver.getTitle());

        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Home page title: " + driver.getTitle());
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class='ui button']")).click();
        System.out.println("heading of the login page: " + driver.findElement(By.xpath("//div[@class='ui massive green label']")).getText());
driver.close();
    }}
