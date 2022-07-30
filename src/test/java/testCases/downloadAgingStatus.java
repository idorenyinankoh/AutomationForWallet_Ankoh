package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Main;

public class downloadAgingStatus extends Main{

	public downloadAgingStatus(WebDriver driver) {
		super(driver);
	}
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

		//Click to view the 'Aging Status 
		login.getAgingStatus().click();

		//Download Aging Status
		login.getDownloadAgingStatus();
		
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
