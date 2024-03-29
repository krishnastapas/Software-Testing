from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

from time import sleep

# URL of the site
url = "https://takeuforward.org/"

def getBrowser():
    options = webdriver.ChromeOptions()
    options.use_chromium = True
    
    # options.add_argument('--headless')  # Run Edge in headless mode
    return webdriver.Chrome()
  



# Function to perform  search
def search(query):
    


    try:
        # Open the  website
       browser = getBrowser()
       print("Browser completed")
       browser.get(url)
       sleep(5)
       search_box=browser.find_element(By.XPATH,"//*[@id='wp-block-search__input-1']")
       search_box.send_keys(query)
       search_box.send_keys(Keys.RETURN)
       
       
    except Exception as e:
        print(f"An error occurred: {e}")

    finally:
        # Close the WebDriver
        browser.quit()

# Example usage

search("atoz")