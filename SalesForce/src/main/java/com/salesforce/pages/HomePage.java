package com.salesforce.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.salesforce.testng.api.base.ProjectSpecificMethods;

import io.cucumber.java.en.Then;


public class HomePage extends ProjectSpecificMethods{

	public HomePage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			
	}
	
	@Then("Homepage should be displayed")
	public HomePage verifyHomepage() {
		verifyDisplayed(locateElement("link","CRM/SFA"));
		return this;
	}

}










