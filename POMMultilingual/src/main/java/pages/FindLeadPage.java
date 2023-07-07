package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class FindLeadPage extends ProjectSpecificMethods{
	public static String leadID;

	public FindLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadPage enterPhoneNo() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}

	public FindLeadPage clickFindLeads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public ViewLeadPage clickFirstRecord() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		if(MergeLeadPage.allhandles != null)
			driver.switchTo().window(MergeLeadPage.allhandles.get(0));
		return new ViewLeadPage(driver);
	}
	
	public FindLeadPage enterLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public void verifyRecordExists() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	public FindLeadPage enterFirstName(String fname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		return this;
	}
	
	
}