from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from time import sleep

# URL of the site
url = "https://vedabase.io/en/"

def getBrowser():
    options = webdriver.ChromeOptions()
    options.use_chromium = True
    
    # options.add_argument('--headless')  # Run chrome in headless mode
    return webdriver.Chrome(options=options)
  


def readBG():
    


    try:
        # Open the  website
       browser = getBrowser()
       print("Browser completed")
       browser.get(url)
       browser.find_element(By.XPATH,"/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/a[1]").click()
       browser.find_element(By.XPATH,"//*[@id='bb179']/a").click()
      
       sleep(5)
      
       
       
    except Exception as e:
        print(f"An error occurred: {e}")

    finally:
        # Close the WebDriver
        browser.quit()

# Example usage


readBG()

