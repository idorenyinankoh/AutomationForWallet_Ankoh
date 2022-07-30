package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.Main;

public class downloadFinancialStatus extends Main{

	public downloadFinancialStatus(WebDriver driver) {
		super(driver);
	}
	@Test
	public static void main(String[] args) throws InterruptedException {
		//[Dashboard] Click on the 'Payments Today' data box

		//Set property
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();

		//Login
		driver.get("https://test.paylawma.ng/app/login.php");

		//Creating object of Login page
		Main login = new Main(driver);

		//Enter username & password
		login.getUsername().sendKeys("odawodu");
		login.getPassword().sendKeys("w@ckyRing90");

		//Click on login button
		login.getLogIn().click();
		Thread.sleep(3000);
		
		//Click on the 'Report Menu 
		login.getReportMenu ().click();

		//Click to view the 'Financial Status 
		login.getFinancialStatus().click();
		Thread.sleep(3000);

		login.getDownloadFinancialStatus();

		Thread.sleep(3000);

		login.getLogout().click();

		Thread.sleep(3000);

		System.out.println
		("-------  TEST COMPLETED-------");

		//Close browser
		Thread.sleep(3000);
		driver.quit();



	}
}
