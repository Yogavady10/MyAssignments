package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods{
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LeadsPage clickLead() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		return new LeadsPage(driver);
	}
}
