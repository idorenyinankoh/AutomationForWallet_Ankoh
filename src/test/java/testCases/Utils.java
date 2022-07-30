package testCases;

import org.hamcrest.DiagnosingMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	WebDriver driver;
	
	public void useDriver (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void quitBrowser (WebDriver driver) {
			driver.quit();
	}
}
