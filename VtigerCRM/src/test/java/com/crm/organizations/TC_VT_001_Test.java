package com.crm.organizations;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ListenerUtility;
import com.crm.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Test extends BaseClass {
	@Test(groups = "smoke")
	public void clickOnOrganizations() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getOrganizationsLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Organizations", 1, 0));
		test.log(Status.PASS, "Contacts page is displayed");
	}

}
