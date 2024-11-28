package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage {
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;	
	
	@FindBy(xpath = "(//img[@title='Select'])[1]")
	private WebElement selectIcon;

	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;

	public CreateContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getSelectIcon() {
		return selectIcon;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
