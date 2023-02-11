package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesForce {
	public static void main(String[] args) {
		// Launch browser
		ChromeDriver cDriver = new ChromeDriver();
		// Load URL
		cDriver.get(" https://login.salesforce.com/");
		// Maximize window
		cDriver.manage().window().maximize();
		//Get element
		WebElement element = cDriver.findElement(By.id("username"));
		// Input element
		element.sendKeys("hari.radhakrishnan@qeagle.com");
		
		cDriver.findElement(By.id("password")).sendKeys("Leaf@123");
		
		WebElement button = cDriver.findElement(By.id("Login"));
		// Click button
		button.click();
		// Get Title of the page
		String title = cDriver.getTitle();
		System.out.println("Title: " +title);
		
		/* Dropdown
		Select dd = new Select(webElement);
		dd.selectByVisbleText("Direct Mail");
		dd.selectByValue("LEAD_COLDCALL");
		dd.selectByIndex(5);
		*/
		
	}
}
