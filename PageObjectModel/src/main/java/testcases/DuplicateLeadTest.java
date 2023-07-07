package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DuplicateLeadTest extends ProjectSpecificMethods{
	@BeforeTest
	public void sendData() {
		testName = "Duplicate Lead";
		testDescription = "Duplicate the Lead";
		testCategory = "Smoke";
		testAuthor = "Yoga";
	}
	
	@Test
	public void runVerifyDuplicateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickFindLead()
		.clickPhone().enterPhoneNo().clickFindLeads().clickFirstRecord()
		.clickDuplicate().clickCreateLead();
	}
}
