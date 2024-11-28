package com.crm.contacts;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericUtility.BaseClass;
import com.crm.genericUtility.ListenerUtility;
import com.crm.objectrepository.ContactPage;
import com.crm.objectrepository.CreateContactPage;
import com.crm.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_VT_003_Test extends BaseClass {
	@Test
	public void createContactWithOrganozation() {
		hp = new HomePage(driver);
		hp.getContactsLink().click();
		
		ContactPage cp = new ContactPage(driver);
		cp.getCreateContactIcon().click();
		
		CreateContactPage createConpage = new CreateContactPage(driver);
		createConpage.getLastNameTextField().sendKeys(null);
		createConpage.getSelectIcon().click();
		
		wUtil.switchToWindow(driver, null);
		driver.findElement(By.xpath(null));
	}
	

}
