package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class activity1 {

    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        System.out.println("Title of the Page :"+ driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println("Title of the new page is :"+driver.getTitle());
        //Thread.sleep(2000);
        driver.close();
    }

}
