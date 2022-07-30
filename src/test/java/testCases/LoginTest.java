package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Main;

public class LoginTest {


	WebDriver driver;
	SoftAssert sAssert = new SoftAssert();
	
	public void useDriver (WebDriver driver) {
		this.driver = driver;
	}
	
	@Test
	public void loginTest() throws InterruptedException {

		System.out.println("------- STARTING LOGIN TEST -------");
		
		//launching the browser
		Utils utils = new Utils();
		driver = utils.launchBrowser();
		
		// Navigating to the url
		driver.get("https://test.paylawma.ng/app/login.php");

		//Creating object of Login page
		Main login = new Main(driver);

		//Enter username & password
		login.getUsername().sendKeys("odawodu");
		login.getPassword().sendKeys("w@ckyRing90");

		//Click on login button
		login.getLogIn().click();
		Thread.sleep(3000);
		String dashboardTextString = driver.findElement(By.xpath("//span[contains(text(),'WasteMgr')]")).getText();
		sAssert.assertEquals(dashboardTextString.toLowerCase(), "WasteMgr".toLowerCase());
		sAssert.assertAll();

		System.out.println("-------  TEST COMPLETED-------");
	}
	
	@AfterSuite
	public void quit() {
		driver.quit();
	}
	
	public WebDriver returnDriver() {
		return driver;
	}
}
