package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {
	public static List<String> getWindow(ChromeDriver d){
		Set<String> windowHandles = d.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		return list;
	}
	public static void main(String[] args) {
		
		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 	
		 * 6. Click on Merge Contacts using Xpath Locator
		 * 
		 * 7. Click on Widget of From Contact
		 * 
		 * 8. Click on First Resulting Contact
		 * 
		 * 9. Click on Widget of To Contact
		 * 
		 * 10. Click on Second Resulting Contact
		 * 
		 * 11. Click on Merge button using Xpath Locator
		 * 
		 * 12. Accept the Alert
		 * 
		 * 13. Verify the title of the page
		 */
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//div[@id='left-content-column']//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::a")).click();
		List<String> window = getWindow(driver);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-body']//table//tr[1]//a")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::a)[2]")).click();
		List<String> window1 = getWindow(driver);
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//table)[2]//tr[1]//a")).click();
		driver.switchTo().window(window1.get(0));
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::a)[3]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title = driver.getTitle();
		if(title.contains("Contact")) {
			System.out.println("Title matches");
		}
		else {
			System.out.println("Title not matches");
		}
	}
}
