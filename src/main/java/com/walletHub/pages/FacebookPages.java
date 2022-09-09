package com.walletHub.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import TestCases.Pages;

public class FacebookPages {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public FacebookPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	//Locator for first name
	@FindBy (name = "//input[contains(@aria-label,'First name')]")
	private WebElement firstName;
	public WebElement getFirstName() {
		return firstName;

	}
	//Locator for last name
	@FindBy (name =  "//input[contains(@name, 'lastname')]")
	private WebElement lastName;
	public WebElement getlastName() {
		return lastName;
	}	

	//Locator for email
	@FindBy(name = "//input[@name='reg_email__']")
	private	WebElement regEmail;
	//Method to click on Login
	public WebElement getRegEmail() {
		return regEmail;
	}

	//Locator for email confirmation field
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	private	WebElement confrimRegEmail;
	//Method to click on text field
	public WebElement getConfrimRegEmail() {
		return confrimRegEmail;
	}


	//Locator for pasword
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement passwrd;
	public WebElement getPasswrd() {
		return passwrd;
	}

	//Locator for day
	@FindBy(xpath = "//select[@aria-label='Day']")
	private WebElement day;
	public WebElement getDay() {
		return day;
	}
	//Locator for month
	@FindBy(xpath = "//select[@aria-label='Month']")
	private WebElement month;
	public WebElement getmonth() {
		return month;
	}
	//Locator for year
	@FindBy(xpath = "//select[@aria-label='Year']")
	private WebElement year;
	public WebElement getYear() {
		return year;
	}
	
	// Locator for gender
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}

	//Locator to click submit
	@FindBy(xpath = "//button[@name='websubmit']")
	private WebElement submit;
	public WebElement getSubmitbtn() {
		return submit;
	}


}



