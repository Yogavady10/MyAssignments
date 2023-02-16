package week2.day2.selenuim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookApp {
	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create new account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Yogavady");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Ulaganathan");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("9876432150");
		
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("yoga");
		
		// Step 11: Handle all the three drop downs
		WebElement date = driver.findElement(By.id("day"));
		Select ddDate = new Select(date);
		ddDate.selectByIndex(9);
		
		WebElement month = driver.findElement(By.id("month"));
		Select ddMonth = new Select(month);
		ddMonth.selectByValue("1");
		
		WebElement year = driver.findElement(By.id("year"));
		Select ddYear = new Select(year);
		ddYear.selectByVisibleText("1994");
		
		// Step 12: Select the radio button "Female" 
		// ( A normal click will do for this step) 
		driver.findElement(By.xpath("//input[@value='1']")).click();

	}
}