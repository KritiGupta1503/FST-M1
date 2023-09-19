package Project_CRMSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity3_Java {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
       String copyrighttext = driver.findElement(By.id("admin_options")).getText();
       System.out.println("First copyright text is :" + copyrighttext);
       driver.close();
    }
}
