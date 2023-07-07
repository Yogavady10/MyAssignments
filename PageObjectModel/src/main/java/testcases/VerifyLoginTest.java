package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLoginTest extends ProjectSpecificMethods{

	@Test
	public void runVerifyCreateLead() {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin().verifyHomepage();
	}
}
