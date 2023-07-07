package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void verifyLeadCreated() {
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name.equals("Pranav"))
			System.out.println("Lead is created");
		else
			System.out.println("Lead is not created");
	}
	
	public EditLeadPage clickEdit() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public void verifyLeadEdited() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyName.contains("TCS"))
			System.out.println("Company name is updated");
		else
			System.out.println("Company name is not updated");
	}
	
	public LeadsPage clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new LeadsPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicate() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
}
