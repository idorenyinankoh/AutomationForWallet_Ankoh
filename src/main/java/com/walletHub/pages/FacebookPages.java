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


	//Locator for email field
	@FindBy (id = "email")
	private WebElement email;
	public WebElement getEmail() {
		return email;

	}
	//Locator for password field
	@FindBy (id =  "pass")
	private WebElement passwrd;
	public WebElement getPasswrd() {
		return passwrd;
	}	

	//Locator for login button
	@FindBy(name = "login")
	private	WebElement loginBtn;
	//Method to click on Login
	public WebElement getloginBtn() {
		return loginBtn;
	}
	
	//Locator for post field
	@FindBy (xpath =  "//span[contains(text(),\"What's on your mind, Grey?\")]//parent::div")
	private WebElement postField;
	public WebElement getPostField() {
		return postField;
	}	

	//Locator for test field
	@FindBy(xpath = "//div[contains(text(),\"What's on your mind\")]//preceding-sibling::div[1]/p")
	private	WebElement postTextBox;
	//Method to click on Login
	public WebElement postTextBox() {
		return postTextBox;
	}

	//Locator for post button
	@FindBy (xpath =  "//div[@aria-label = 'Post']")
	private WebElement postBtn;
	public WebElement getPostBtn() {
		return postBtn;
	}	


}



