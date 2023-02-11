package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// 1. Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		// 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// 5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		// 6. Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		// 7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Srikesh Infotech");
		
		// 8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Keerthana");
		
		// 9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		// 10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Keerthi");
		
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		
		// 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.name("description")).sendKeys("Testing");
		
		// 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("keerthana@gmail.com");
		
		// 14. Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("New York");
				
		// 15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
		// 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
		// 17. Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		// 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing note");
		
		// 19. Click on update button 
		driver.findElement(By.name("submitButton")).click();
		
		// 20. Get the Title of Resulting Page. using driver.getTitle()
		String title = driver.getTitle();		
		System.out.println("Title of the current page: " +title);
	}
}
