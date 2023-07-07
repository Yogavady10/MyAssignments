package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void verifyHomepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
			System.out.println("Homepage is displayed");
		else
			System.out.println("Homepage is not displayed");
	}
	
	public MyHomePage clickCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}
