from selenium import webdriver
from selenium.webdriver.common.keys import Keys
import time

options = webdriver.ChromeOptions()
options.use_chromium = True

driver= webdriver.Chrome(options=options)


# Open YouTube
driver.get("https://www.youtube.com")

# Find the search bar by name and enter your search query (e.g., "python tutorial")
search_box = driver.find_element("name", "search_query")
search_box.send_keys("python tutorial")
search_box.send_keys(Keys.RETURN)

# Wait for search results to load
time.sleep(3)

# Find the first video link and click on it
first_video_link = driver.find_element_by_xpath('//*[@id="contents"]/ytd-video-renderer[1]/div[1]/div[1]/div[1]/h3/a')
first_video_link.click()

# Wait for the video to load
time.sleep(3)

# Play the video (you might need to locate the play button using appropriate selectors)
play_button = driver.find_element_by_xpath('//*[@id="movie_player"]/div[25]/div[2]/div[1]/button')
play_button.click()

# You may need to adjust the XPath or other locators based on the current structure of YouTube's website.

# Close the browser after a short delay (you can adjust the delay based on your needs)
time.sleep(5)
driver.quit()
