package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class DuplicateLeadPage extends ProjectSpecificMethods{

	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}