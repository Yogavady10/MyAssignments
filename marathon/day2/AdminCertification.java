package marathon.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class AdminCertification {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		
		//	1. Launch Salesforce application https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//	2. Login with username as "hari.radhakrishnan@qeagle.com" and password as "Leaf@123"
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		//	3. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		
		//	4. Click confirm on Confirm redirect
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//	5. Click Learning 
		Shadow s = new Shadow(driver);
		s.findElementByXPath("//span[text()='Learning']").click();
		
		//	6. And mouse hover on Learning On Trailhead
		WebElement element = s.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		
		//	7. Click on Salesforce Certifications
		s.findElementByXPath("//a[text()='Salesforce Certification']").click();
		
		//	8. Click on first resulting Certificate
		driver.findElement(By.xpath("//div[@class='credentials-card ']")).click();
		
		//	9. verify - Administrator Overview page
		String title = driver.getTitle();
		if(title.equals("Certification - Administrator"))
			System.out.println("Title matches");
		else
			System.out.println("Title not matches");
		
		//	10.Print the Certifications available for Administrator Certifications (List)
		List<WebElement> cert = driver.findElements(By.xpath("//div[@class='credentials-card ']//div[@class='credentials-card_title']"));
		System.out.println("Administrator Certifications are :");
		for(int i = 0; i < cert.size(); i++)
			System.out.println(cert.get(i).getText());
	}
}