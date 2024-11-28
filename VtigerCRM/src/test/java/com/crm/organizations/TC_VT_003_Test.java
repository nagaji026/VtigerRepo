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
public class TC_VT_003_Test extends BaseClass {
	@Test (groups = "smoke")
	public void createOrganization() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getOrganizationsLink().click();
		
		OrganizationsPage orgPage = new OrganizationsPage(driver);
		orgPage.getCreateOrganizationIcon().click();
		
		CreateOrganizationsPage createOrgPage =  new CreateOrganizationsPage(driver);
		Assert.assertTrue(createOrgPage.getOrganizationNameTextField().isDisplayed(),"Create organization page is not display");
		test.log(Status.PASS, "Create organization page is not display");
		
		String organizationName = eUtil.getStringDataFromExcel("Organizations", 1, 1)+jUtil.getRandomNumber();
		createOrgPage.getOrganizationNameTextField().sendKeys(organizationName);
		createOrgPage.getSaveButton().click();
		
		String headerText = createOrgPage.getOrganizationHaderText().getText();
		System.out.println(headerText);
				
		Assert.assertTrue(headerText.contains(organizationName), "Organization not created");
		test.log(Status.PASS, "Organization Created");		
		
		
	}

}
