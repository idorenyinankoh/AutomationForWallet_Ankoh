package com.walletHub.testCases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.FailedLoginException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.tools.ant.launch.Launcher;
import org.apache.tools.ant.taskdefs.Input;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.walletHub.pages.*;

public class facebookTest {


	WebDriver driver;
	SoftAssert sAssert = new SoftAssert();
	Logger logger;
	Utils utils;

	public void useDriver (WebDriver driver) {
		this.driver = driver;
	}


	@BeforeClass
	public void setup() throws InterruptedException  {

		logger = Logger.getLogger("SelectInsuranceTest");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\logging\\log4j.properties");
		logger.info("------- STARTING LOGIN TEST -------");
		logger.info("Lanching browser");
		utils = new Utils();
		driver = utils.launchBrowser();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
		@Test
		public void loginTest() throws InterruptedException, IOException {
		try {

		// Navigating to the url
		logger.info("Navigating to URL");
		driver.navigate().to(utils.getProperty("facebookUrl"));

		//Login
		FacebookPages fb = new FacebookPages(driver);
		logger.info("Input email");
		fb.getEmail().sendKeys(utils.getProperty("fbEmail"));
		logger.info("Input password");
		fb.getPasswrd().sendKeys(utils.getProperty("fbPwrd"));
		logger.info("Click on login button");
		fb.getloginBtn().click();
		logger.info("Login Successful");
		
		//Make post
		fb.getPostField().click();
		fb.postTextBox().sendKeys("Hello World");
		fb.getPostBtn().click();
		logger.info("Post successful made");
		
		} 
		catch (Exception e) {

			logger.info("Post  unsuccessful. see error \n"+e);
		}
	}


	@AfterClass
	public void tearDown() {
		utils.quitBrowser(driver);
	}
}
