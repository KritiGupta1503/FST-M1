from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    driver.get("https://www.v1.training-support.net/selenium/selects")
    # Print the title of the page
    print("Page title is: ", driver.title)
    multiselect = driver.find_element(By.ID,"multi-select")
    dropdown = Select(multiselect)

    dropdown.select_by_visible_text("Javascript")
    print("selected option is (JS): ",dropdown.first_selected_option.text)

    for option in dropdown.all_selected_options:
        print("options selected in multiselect are : ",option.text)

    for x in range(4,6):
        dropdown.select_by_index(x)
    for option in dropdown.all_selected_options:
        print("options selected are :",option.text)

    dropdown.deselect_by_index(7)
    for option in dropdown.all_selected_options:
        print("options selected are :",option.text)
