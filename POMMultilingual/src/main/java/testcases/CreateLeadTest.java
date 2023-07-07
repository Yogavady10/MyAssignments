package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethods{
	
	@BeforeTest
	public void getExcelName() {
		fileName =  "";
	}
	
	@Test
	public void runVerifyCreateLead() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickCreateLead()
		.enterCompanyName().enterFirstName().enterLastName().clickSubmit()
		.verifyLeadCreated();
	}

}
