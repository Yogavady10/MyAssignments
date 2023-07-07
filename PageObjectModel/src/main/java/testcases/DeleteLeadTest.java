package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class DeleteLeadTest extends ProjectSpecificMethods{
	@BeforeTest
	public void sendData() {
		testName = "";
		testDescription = "";
		testCategory = "";
		testAuthor = "";
	}
	
	@Test
	public void runVerifyDeleteLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickFindLead()
		.clickPhone().enterPhoneNo().clickFindLeads().clickFirstRecord()
		.clickDelete().clickFindLead().enterLeadID().clickFindLeads().verifyRecordExists();
	}

}
