from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.core import driver
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())
with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/selects")
    # Print the title of the page
    print("Page title is: ", driver.title)
    single_select = driver.find_element(By.ID, "single-select")
    dropdown = Select(single_select)
    dropdown.select_by_visible_text("Option 2")
    print("2nd option is : ",dropdown.first_selected_option.text)

    dropdown.select_by_index(3)
    print("3rd option is :",dropdown.first_selected_option.text)

    dropdown.select_by_value("4")
    print("4th option is :",dropdown.first_selected_option.text)

    selectOptions = dropdown.options
    for option in selectOptions:
        print("all drop down options : ",option.text)
