package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
public class activity4 {

    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("page title is:" +driver.getTitle());
        System.out.println("3rd header title is:" +driver.findElement(By.xpath("//h3[@Id='third-header']")).getText());
        System.out.println("5th header color is :"+driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color"));
        System.out.println("classes of violet button :" + driver.findElement(By.className("violet")).getAttribute("class"));
        System.out.println("text of grey button is :" + driver.findElement(By.className("grey")).getText());
   driver.close();
    }
}
