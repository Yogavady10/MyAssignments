package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethods{
	
	@Test
	public void runVerifyDeleteLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickFindLead()
		.clickPhone().enterPhoneNo().clickFindLeads().clickFirstRecord()
		.clickDelete().clickFindLead().enterLeadID().clickFindLeads().verifyRecordExists();
	}

}
