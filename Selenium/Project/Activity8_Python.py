from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service)as driver:
    titlepage = driver.get("https://alchemy.hguy.co/crm/")
    print("title of the page is :",driver.title)
    driver.find_element(By.ID,"user_name").send_keys("admin")
    driver.find_element(By.ID,"username_password").send_keys("pa$$w0rd")
    driver.find_element(By.ID,"bigbutton").click()

#getting into sales tab and then accounts tab
    driver.findElement(By.id,"grouptab_0").click()
    driver.findElement(By.id,"moduleTab_9_Accounts").click()

#waiting till element is visible
#WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10))
    WebDriverWait(driver,30).until(driver.find_element(By.XPATH,"//a[@id = 'pagination']")).is_displayed()

#getting no. of rows
    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"))
    print("no. of rows" +rows.size())
