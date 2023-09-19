package Project_CRMSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class activity2_Java {
    public static void main (String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://alchemy.hguy.co/crm");
       // System.out.println("logo name: "+driver.findElement(By.className("companylogo")).getText());
        System.out.println("image url :"+driver.findElement(By.cssSelector("img")).getAttribute("src"));
      //  System.out.println("logo name: "+driver.findElement(By.xpath("//div[@class='companylogo']")).getText());
    driver.close();
    }
}
