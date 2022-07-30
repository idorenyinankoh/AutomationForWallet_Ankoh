package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import TestCases.Pages;

public class Main {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public Main(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locator for username field
	@FindBy (xpath = "//input[@id='username']")
	private WebElement username;

	//Method to enter username
	public WebElement getUsername() {
		return username;

	}
	//Locator for password field
	@FindBy (xpath =  "//input[@id='password']")
	private WebElement Password;

	//Method to enter password
	public WebElement getPassword() {
		return Password;
	}	

	//Locator for login button
	@FindBy(xpath = "//input[@id='login']")
	private	WebElement login;

	//Method to click on Login
	public WebElement getLogIn() {
		return login;
	}

	//Locator for logout button
	@FindBy(xpath = "//div[@id='navigation']/ul[@class='navigation-menu']//span[.=' Logout ']")
	private	WebElement logout;

	//Method to click on Logout
	public WebElement getLogout() {
		return logout;
	}

	//Locator to View PSP Payment on the dashbord
	@FindBy(xpath = "//tbody/tr[@id='pdocrud-row-0']/td[7]/a[1]")
	private WebElement viewPayment;

	//Method to Click View
	public WebElement getViewPayment () {
		return viewPayment;
	}

	//Filter or search Facilities
	//Locator for Facilities from the dashboard menu
	@FindBy(xpath = "//span[normalize-space()='Facilities']")
	private WebElement facilities;

	//Method to Click View
	public WebElement getFacilities () {
		return facilities;
	}

	//Enter search keyword
	@FindBy (xpath = "//input[@id='pdocrud_search_box']")
	private WebElement search_box;

	public WebElement getSearch_box () {
		return search_box;
	}

	//Click on seacrh (GO) button
	//Locator for GO button
	@FindBy(xpath = "//a[@id='pdocrud_search_btn']")
	private WebElement GoButton;

	//Method to Click View
	public WebElement getGoButton () {
		return GoButton;
	}
	//View Cunrrent month payments
	//Locator for Current Month Payment
	@FindBy(xpath = "//h6[normalize-space()='Current Month Payments']")
	private	WebElement CurrentMonthPayments;

	//Method to click on Logout
	public WebElement getCurrentMonthPayments () {
		return CurrentMonthPayments;
	}

	//View Payments Today
	//Locator for Payment Today
	@FindBy(xpath = "//h6[@class='text-muted text-uppercase m-b-20']")
	private	WebElement PaymentsToday;

	//Method to click on Logout
	public WebElement getPaymentsToday () {
		return PaymentsToday;
	}

	//View Approved Faciloities
	//Locator for Approved Facilitiest
	@FindBy(xpath = "//span[normalize-space()='Facilities']")
	private	WebElement ApprovedFacilities;

	//Method to click on Logout
	public WebElement getApprovedFacilities () {
		return ApprovedFacilities;

	}


	//click on Financials
	//Locator for Financials
	@FindBy(xpath = "//span[normalize-space()='Financials']")
	private WebElement Financials;

	//Method to click on Financials
	public WebElement getFinancials () {
		return Financials;

	}

	//Register New PSP
	//Locator for Register a new PSP
	@FindBy(xpath = "//a[normalize-space()='Register New PSP']")
	private	WebElement RegisterPSP;

	//Method to click on Logout
	public WebElement getRegisterPSP () {
		return RegisterPSP;	

	}
	//Click on Report on Menu
	//Locator for Report Menu
	@FindBy(xpath = "//span[normalize-space()='Reports']")
	private	WebElement ReportMenu;

	//Method to click on Logout
	public WebElement getReportMenu () {
		return ReportMenu;	

	}
	//Click on Payment Report on Menu
	//Locator for Report Menu
	@FindBy(xpath = "//a[@href='reports_payments_period.php']")
	private	WebElement PaymentReport;

	//Method to click on Logout
	public WebElement getPaymentReport () {
		return PaymentReport;	
	}

	//Click on Financial Status
	//Locator for Financial Status Menu
	@FindBy(xpath = "//a[@class='btn align-bottom btn-primary waves-effect waves-light']")
	private	WebElement FinancialStatus
	;

	//Method to click on Logout
	public WebElement getFinancialStatus () {
		return FinancialStatus;	

	}
	//Click on Aging Status
	//Locator for AgingStatus Menu
	@FindBy(xpath = "//a[@href='reports_aging.php']")
	private	WebElement AgingStatus
	;

	//Method to click on Logout
	public WebElement getAgingStatus () {
		return AgingStatus;	

	}
	//Click on Download Aging Status
	//Locator for AgingStatus Menu
	@FindBy(xpath = "//i[@class='fa fa-file']")
	private	WebElement DownloadAgingStatus
	;

	//Method to click on Logout
	public WebElement getDownloadAgingStatus () {
		return DownloadAgingStatus;	

	}
	//Click on Download Aging Status
	//Locator for AgingStatus Menu
	@FindBy(xpath = "//a[@title='CSV']")
	private	WebElement DownloadFinancialStatus
	;

	//Method to click on Logout
	public WebElement getDownloadFinancialStatus() {
		return DownloadFinancialStatus;	




	}
	// Click on PSPs(Menu)
	//Locator for PSPs Menu
	@FindBy(xpath = "//span[normalize-space()='PSPs']")
	private	WebElement PSPs;

	//Method to click on PSPs Menu
	public WebElement getPSPs() {
		return PSPs;

	}
	// Click on manage PSPs (sub-Menu)
	//Locator for manage PSPs (sub-Menu)
	@FindBy(xpath = "//a[normalize-space()='Manage PSPs']")
	private	WebElement ManagePSPs;

	//Method to click on manage PSPs (sub-Menu)
	public WebElement getManagePSPs() {
		return ManagePSPs;

	}
	//Manage PSPs by Region
	//Locator for Region filter in managing PSP
	@FindBy(xpath = "//input[@id='pdocrud_search_box']")
	private WebElement regionFilter;

	//Method to Click View
	public WebElement getregionFilter () {
		return regionFilter;
	}

	//Enter search keyword
	@FindBy (css = "#pdocrud_search_box")
	private WebElement ManagePSP;

	//Method to Click View
	public WebElement getManagePSP() {
		return ManagePSP;
	}

	//Click on seacrh (GO) button
	//Locator for GO button
	@FindBy(xpath = "//a[@id='pdocrud_search_btn']")
	private WebElement GoButton2;
	public Object getSearch_box;

	//Method to Click View
	public WebElement getGoButton2 () {
		return GoButton;

	}
	// Click on Register a new PSP (sub-Menu)
	//Locator for Register a new PSP 
	@FindBy(xpath = "//a[normalize-space()='Register New PSP']")
	private	WebElement RegisterPSPs;

	//Method to click on register PSPs (sub-Menu)
	public WebElement getRegisterPSPs() {
		return RegisterPSPs;
	}

	//Select new PSp tab
	@FindBy(xpath = "//h6[normalize-space()='New PSP']")
	private	WebElement NewPSPs;

	//Method to select new PSp(option)
	public WebElement getNewPSPs() {
		return NewPSPs;
	}

	//Enter new PSp name
	@FindBy(xpath = "//div[@class='card-box new']//input[@id='psp_name']")
	private	WebElement EnterPSPsName;

	//Method to click on typy area
	public WebElement getEnterPSPsName() {
		return EnterPSPsName;

	}

	//Enter new PSp address
	@FindBy(xpath = "//div[@class='card-box new']//textarea[@id='contact_address']")
	private	WebElement Address;

	//Method to click typy area
	public WebElement getAddress() {
		return Address;

	}

	//Enter new PSp phoneNumber
	@FindBy(xpath = "//div[@class='card-box new']//input[@id='mobile_number']")
	private	WebElement phoneNumber;

	//Method to click typy area
	public WebElement getphoneNumber() {
		return phoneNumber;

	}

	//Enter new PSp Email
	@FindBy(xpath = "//div[@class='card-box new']//input[@id='email_address']")
	private	WebElement Email;

	//Method to click typy area)
	public WebElement getEmail() {
		return Email;

	}

	//Enter new PSp Region
	@FindBy(xpath = "//div[@class='card-box new']//select[@id='region_code']")
	private	WebElement Region;

	//Method to click on typy area
	public WebElement getRegion() {
		return Region;
	}
	//click on register New PSP Button
	@FindBy(xpath = "//div[@class='card-box new']//button[@id='submit']}")
	private	WebElement registerBtn;

	//Method to click on typy area
	public WebElement getregisterBtn() {
		return registerBtn;

	}
	//Select update PSp tab
	@FindBy(xpath = "//h6[normalize-space()='Update PSP']")
	private	WebElement UpdatePSPs;

	//Method to click on update typy area
	public WebElement getUpdatePSPs() {
		return UpdatePSPs;
	}
	//Select update PSp tab
	@FindBy(xpath = "//h6[normalize-space()='Update PSP']")
	private	WebElement UpdatePSPsbtn;

	//Method to click on update typy area
	public WebElement getUpdatePSPsbtn() {
		return UpdatePSPsbtn;
	}
	//Update PSP detail
	//Enter PSP CODE
	@FindBy(xpath = "//div[@class='card-box update']//input[@id='psp_code']")
	private	WebElement PSPCode;

	//Method to click typy area
	public WebElement getPSPCode() {
		return PSPCode;

	}

	//Enter new PSp phoneNumber
	@FindBy(xpath = "//div[@class='card-box update']//textarea[@id='contact_address']")
	private	WebElement ContactAddress;

	//Method to click typy area
	public WebElement getContactAddress() {
		return ContactAddress;

	}

	//Enter new PSp Email
	@FindBy(xpath = "//div[@class='card-box update']//input[@id='email_address']")
	private	WebElement EmailAdd;

	//Method to click typy area)
	public WebElement getEmailAdd() {
		return EmailAdd;

	}

	//Enter new PSp Region
	@FindBy(xpath = "//div[@class='card-box update']//input[@id='mobile_number']")
	private	WebElement mobilenumber;

	//Method to click on typy area
	public WebElement getmobilenumber() {
		return mobilenumber;
	}
}



