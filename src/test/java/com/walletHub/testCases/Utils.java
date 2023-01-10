package com.walletHub.testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hamcrest.DiagnosingMatcher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {

	WebDriver driver;
	
	public void useDriver (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		// test
	}

	public void quitBrowser (WebDriver driver) {
			driver.quit();
	}
	
	public String getProperty(String name) throws IOException {
		Properties properties = new Properties();
		FileInputStream filepath = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\dev_data.properties");
		properties.load(filepath);
		String bString = properties.getProperty(name);
		return bString;
	}
}
