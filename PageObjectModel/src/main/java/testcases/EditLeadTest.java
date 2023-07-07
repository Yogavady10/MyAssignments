package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLeadTest extends ProjectSpecificMethods{
	@BeforeTest
	public void sendData() {
		testName = "Edit Lead";
		testDescription = "Edit Company Name for the Lead";
		testCategory = "Regression";
		testAuthor = "Yoga";
	}
	
	@Test
	public void runVerifyEditLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickFindLead()
		.clickPhone().enterPhoneNo().clickFindLeads().clickFirstRecord()
		.clickEdit().enterCompanyName().clickSubmit().verifyLeadEdited();
	}
}
