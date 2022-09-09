package com.walletHub.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import TestCases.Pages;

public class TestInsuranceHomePage {
	WebDriver driver;

	//Constructor that will be automatically called as soon as the object of the class is created
	public TestInsuranceHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Locator for rating header
	@FindBy (xpath = "//h3[contains(text(),\"What's Your Rating?\")]")
	private WebElement ratingHeader;

	//Method to rating header
	public WebElement getRatingHeader() {
		return ratingHeader;

	}
	//Locator for rating stars
	@FindBy (xpath =  "//h3[contains(text(),\"What's Your Rating?\")]/following-sibling::review-star/descendant::div")
	private WebElement ratingStars;

	//Method to rating stars
	public WebElement getRatingStars() {
		return ratingStars;
	}	

	//Locator for insurance dropdown
	@FindBy(xpath = "//span[contains(text(),'Select...')]")
	private	WebElement insDropDwn;
	//Method to click on Login
	public WebElement getInsDropDwn() {
		return insDropDwn;
	}

	//Locator for text field
	@FindBy(xpath = "//textarea[@placeholder = 'Write your review...']")
	private	WebElement reviewTxtFld;

	//Method to click on text field
	public WebElement getReviewTxtFld() {
		return reviewTxtFld;
	}

	//Locator for login tab
	@FindBy(xpath = "//body/main[1]/div[1]/form[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")
	private WebElement loginTab;
	public WebElement getLoginTab() {
		return loginTab;
	}
	
	//Locator for usernmae
	@FindBy(xpath = "//body[1]/main[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement usernameFld;
	public WebElement getUsernameFld() {
		return usernameFld;
	}
	//Locator for password
	@FindBy(xpath = "//body[1]/main[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
	private WebElement pwrdFld;
	public WebElement getPwrdFld() {
		return pwrdFld;
	}
	
	//Locator for login button
	@FindBy(xpath = "//body/main[1]/div[1]/form[1]/div[1]/div[3]/button[1]")
	private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
}



