package selenium_rc;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;


public class codechef {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "https://www.codechef.com/");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
	}
}
