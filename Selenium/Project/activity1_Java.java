package Project_CRMSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.reactor.Command;
import org.bouncycastle.asn1.x509.OtherName;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1_Java {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
    WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();

    driver.get("https://alchemy.hguy.co/crm/");

}


@Test
    public void exampleTestCase() {
    String title = driver.getTitle();
    System.out.println("Page title is: " + title);

    org.testng.Assert.assertEquals("SuiteCRM", title);
    driver.quit();


}

    }


