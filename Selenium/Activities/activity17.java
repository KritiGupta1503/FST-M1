package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.sl.draw.geom.GuideIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class activity17 {
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.v1.training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.id("single-select"));
        Select singleSelect = new Select(dropdown);
        singleSelect.selectByVisibleText("Option 2");
        System.out.println("2nd option is : " +singleSelect.getFirstSelectedOption().getText());

        singleSelect.selectByIndex(3);
        System.out.println("3rd selected option is :" + singleSelect.getFirstSelectedOption().getText());


        singleSelect.selectByValue("4");
        System.out.println("4ht select option is :" + singleSelect.getFirstSelectedOption().getText());

        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("options in dropdown : ");
        for(WebElement Option : allOptions)
        {
            System.out.println(Option.getText());
        }
        driver.quit();

    }
}
