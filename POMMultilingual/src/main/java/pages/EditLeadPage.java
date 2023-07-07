package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	public EditLeadPage enterCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}

	public ViewLeadPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
}
