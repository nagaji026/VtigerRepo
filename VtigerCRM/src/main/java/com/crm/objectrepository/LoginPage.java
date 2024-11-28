package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "user_name")
	private WebElement userNameTextField;
	
	@FindBy(name = "user_password")
	private  WebElement passwordtextfield;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {		// ctrl+space
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	
	public WebElement getPasswordTextField() {
		return passwordtextfield;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

}
