package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));	
		return this;
	}
	
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();	
		return new HomePage(driver);
	}
}
