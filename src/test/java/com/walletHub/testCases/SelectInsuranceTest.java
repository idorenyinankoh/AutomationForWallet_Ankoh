package com.walletHub.testCases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.FailedLoginException;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.tools.ant.launch.Launcher;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.walletHub.pages.*;

public class SelectInsuranceTest {


	WebDriver driver;
	SoftAssert sAssert = new SoftAssert();
	Logger logger;
	Utils utils;

	public void useDriver (WebDriver driver) {
		this.driver = driver;
	}
	

	@Test
	public void loginTest() throws InterruptedException, IOException {

		logger = Logger.getLogger("SelectInsuranceTest");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\logging\\log4j.properties");
		logger.info("------- STARTING LOGIN TEST -------");

		//launching the browser
		utils = new Utils();
		try {
			logger.info("Lanching browser");
			driver = utils.launchBrowser();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			// Navigating to the url
			logger.info("Navigating to URL");
			driver.get(utils.getProperty("baseUrl"));
			TestInsuranceHomePage insPageObj = new TestInsuranceHomePage(driver);
			logger.info("Scroll to star ratings");
			WebElement ratingHeader = insPageObj.getRatingHeader();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", ratingHeader);
			logger.info("Hovering over stars");
			List<WebElement> stars = insPageObj.getRatingStars().findElements(By.tagName("svg"));
			int round = 1;
			for(WebElement star : stars){
				Actions actions = new Actions(driver);
				actions.moveToElement(star).build().perform();
				Thread.sleep(2000);		
				if (round == 4) {
					star.click();
					logger.info("Clicked star number: "+ 4);
					break;
				}
			}
			logger.info("Hovered over star number: " + round);
			round++;


			logger.info("Selecting Health Insurance");

			insPageObj.getInsDropDwn().click();		
			driver.findElement(By.xpath("//li[contains(text(),'Health Insurance')]")).click();
			logger.info("Health Insurance selected");
			String text = "Editorial and user-generated content on this page is not reviewed or otherwise endorsed by any financial institution. In addition, it is not the financial institution’s responsibility to ensure all posts and questions are answered";

			logger.info("Adding review text");	
			insPageObj.getReviewTxtFld().click();
			insPageObj.getReviewTxtFld().sendKeys(text);
			driver.findElement(By.xpath("//div[contains(text(),'Submit')]")).click();



			logger.info("Logging in");
			insPageObj.getLoginTab().click();
			insPageObj.getUsernameFld().sendKeys(utils.getProperty("walletUsername"));
			insPageObj.getPwrdFld().sendKeys(utils.getProperty("walletPassword"));
			insPageObj.getLoginBtn().click();
			Thread.sleep(2000);
			String reviewTextString= driver.findElement(By.xpath("//div[contains(text(),'Editorial and user-generated content on this page ')]")).getText();
			sAssert.assertEquals(text, reviewTextString);
			sAssert.assertAll();
			logger.info("Test Completed" );
			
		} catch (Exception e) {
			logger.error("Failed to Complete test. See error \n" + e);
		}

	}
	@AfterClass
	public void tearDown() {
		utils.quitBrowser(driver);
	}
}
