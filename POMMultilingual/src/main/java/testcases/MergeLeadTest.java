package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.MergeLeadPage;

public class MergeLeadTest extends ProjectSpecificMethods{
	
	@Test
	public void runVerifyMergeLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername().enterPassword().clickLogin()
		.clickCRM().clickLead().clickMergeLead()
		.clickLookup().enterFirstName("Hema").clickFindLeads().clickFirstRecord();
		
		driver.switchTo().window(MergeLeadPage.allhandles.get(0));
		
		MergeLeadPage mlp = new MergeLeadPage(driver);
		mlp.clickSecondLookup().enterFirstName("jeeva").clickFindLeads().clickFirstRecord();
		
		driver.switchTo().window(MergeLeadPage.allhandles.get(0));
		mlp.clickMerge();
	}

}
