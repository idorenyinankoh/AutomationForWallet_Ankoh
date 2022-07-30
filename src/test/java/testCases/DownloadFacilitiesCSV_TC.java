package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Main;

public class DownloadFacilitiesCSV_TC {

	public static void main(String[] args) throws InterruptedException {
		// Download Approved facilities As CSV file
		
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
		
		//Find facility page
        driver.findElement(By.xpath("//span[normalize-space()='Facilities']")).click();
		Thread.sleep(3000);

		// Scrolling down the page till the element is found		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3350)", "");
		Thread.sleep(3000);
				
	   driver.findElement(By.cssSelector("a[title='CSV']")).click();
		Thread.sleep(2000);



        System.out.println
		("-------  TEST COMPLETED-------");
        
		//Close browser
        driver.quit();

	}

}
