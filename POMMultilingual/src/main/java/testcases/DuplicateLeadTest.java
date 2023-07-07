package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethods{

	@Test
	public void runVerifyDuplicateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickFindLead()
		.clickPhone().enterPhoneNo().clickFindLeads().clickFirstRecord()
		.clickDuplicate().clickCreateLead();
	}
}
