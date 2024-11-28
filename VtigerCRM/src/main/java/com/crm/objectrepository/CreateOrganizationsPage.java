package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationsPage {
	@FindBy(name = "accountname")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement organizationHaderText;
	
	@FindBy(name = "industry")
	private WebElement industryDropDown;
	
	@FindBy(id = "dtlview_Industry")
	private WebElement industryField;

	public WebElement getIndustryField() {
		return industryField;
	}

	public CreateOrganizationsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getOrganizationHaderText() {
		return organizationHaderText;
	}

	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}
	

}
