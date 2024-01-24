package selenium_rc;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class irctc {
 // TODO Auto - generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium selenium = new DefaultSelenium("localhost", 4444, "firefox", "https://www.irctc.co.in/");
		selenium.start();
		selenium.open("/");
		selenium.type("id=twotabsearchtextbox", "Books");
		selenium.click("nav-search-submit-button");
		selenium.windowMaximize();
	}
}



