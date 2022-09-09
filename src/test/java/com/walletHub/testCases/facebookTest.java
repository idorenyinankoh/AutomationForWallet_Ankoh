package com.walletHub.testCases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.FailedLoginException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.tools.ant.launch.Launcher;
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
	public void loginTest() throws InterruptedException, IOException {

		logger = Logger.getLogger("SelectInsuranceTest");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\logging\\log4j.properties");
		logger.info("------- STARTING LOGIN TEST -------");
		logger.info("Lanching browser");
		utils = new Utils();
		driver = utils.launchBrowser();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		try {

		// Navigating to the url
		logger.info("Navigating to URL");
		driver.navigate().to("https://web.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		logger.info("CLick on create new account");
		driver.findElement(By.linkText("Create New Account")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@aria-label,'First name')]")));
		String name = "Bamidele";
		FacebookPages fbPages = new FacebookPages(driver);
		logger.info("Input first name");
		fbPages.getFirstName().sendKeys(name);

		logger.info("Input last name");
		fbPages.getlastName().sendKeys("cone");		

		logger.info("Input email");
		fbPages.getRegEmail().sendKeys("ambicolonel@gmail.com");

		logger.info("Input confirm email");
		fbPages.getConfrimRegEmail().sendKeys("ambicolonel@gmail.com");

		logger.info("Input password");
		fbPages.getPasswrd().sendKeys("ambicolonel@mailinator.com");


		logger.info("Choose DOB");
		fbPages.getDay().sendKeys("22");
		fbPages.getmonth().sendKeys("Jun");
		fbPages.getYear().sendKeys("1993");


		logger.info("Choose gender");
		fbPages.getGender().click();


		logger.info("Submit");
		fbPages.getSubmitbtn().click();


		String actual = driver.findElement(By.xpath("//span[contains(text(),'"+name+"')]")).getText();
		sAssert.assertEquals(actual, name);
		System.out.println(actual+ "" +name);
		logger.info("Asserted that registration is successful");
		} 
		catch (Exception e) {

			logger.info("Rgeistration  unsuccessful. see error \n"+e);
		}
	}


	@AfterClass
	public void tearDown() {
		utils.quitBrowser(driver);
	}
}
