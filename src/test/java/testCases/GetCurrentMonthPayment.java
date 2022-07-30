package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Main;

public class GetCurrentMonthPayment {
	WebDriver driver;
	@Test
	public  void getCurrentMonthPayment() throws InterruptedException {
		
//		//Click on login button
		LoginTest login = new LoginTest();
		login.useDriver(driver);
		
		login.loginTest();
		driver = login.returnDriver();
		Thread.sleep(3000);
		
		//Click on the 'Current Months to view payments made for the current month
		Main main = PageFactory.initElements(driver, Main.class);
		main.getCurrentMonthPayments().click();
		
				
		main.getLogout().click();
		Thread.sleep(6000);
		
		
		System.out.println
		("-------  TEST COMPLETED  -------");

		//Close browser
		Thread.sleep(500);
		//driver.quit();
	}

}
