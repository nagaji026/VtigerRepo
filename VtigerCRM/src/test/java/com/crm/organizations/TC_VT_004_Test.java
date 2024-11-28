package com.crm.organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ListenerUtility;
import com.crm.objectrepository.CreateOrganizationsPage;
import com.crm.objectrepository.HomePage;
import com.crm.objectrepository.OrganizationsPage;

@Listeners(ListenerUtility.class)
public class TC_VT_004_Test extends BaseClass {
	@Test
	public void createOrganizationWithIndustryDropDown() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getOrganizationsLink().click();
		
		OrganizationsPage orgPage = new OrganizationsPage(driver);
		orgPage.getCreateOrganizationIcon().click();
		
		CreateOrganizationsPage createOrgPage = new CreateOrganizationsPage(driver);
		String orgName = eUtil.getStringDataFromExcel("Organizations", 1, 1)+jUtil.getRandomNumber();
		createOrgPage.getOrganizationNameTextField().sendKeys(orgName);
		
		wUtil.handleDropdownByVisibleText(createOrgPage.getIndustryDropDown(), eUtil.getStringDataFromExcel("Organizations", 2, 2));
		createOrgPage.getSaveButton().click();
		
		Assert.assertEquals(createOrgPage.getIndustryField().getText(), eUtil.getStringDataFromExcel("Organizations", 2, 2));
		test.log(Status.PASS, "Organizations is created with industry name ====> "+createOrgPage.getIndustryField().getText());
		
		
	}

}
