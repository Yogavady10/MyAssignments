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

public class ArchitectCertification {
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
		driver.findElement(By.xpath("//span[text()='Learn More']//..")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//	4. Click  On Learning
		Shadow s = new Shadow(driver);
		s.findElementByXPath("//span[text()='Learning']").click();
		
		//	5. And mouse hover on Learning On Trailhead
		WebElement element = s.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		
		//	6. Click on Salesforce Certifications
		s.findElementByXPath("//a[text()='Salesforce Certification']").click();

		//	7. Choose Your Role as Salesforce Architect
		driver.findElement(By.xpath("//div[text()='Architect']")).click();
		
		//	8. Get the Text(Summary) of Salesforce Architect 
		String text = driver.findElement(By.xpath("//h1[text()='Salesforce Architect']/following-sibling::div")).getText();
		System.out.println("Text(Summary) of Salesforce Architect : " +text);
		
		//	9. Get the List of Salesforce Architect Certifications Available
		System.out.println("Salesforce Architect Certifications are :");
		ArchitectCertification ac = new ArchitectCertification();
		ac.getCertifications(driver);
		
		//	10.Click on Application Architect 
		driver.findElement(By.partialLinkText("Application Architect")).click();
		
		//	11.Get the List of Certifications available
		System.out.println("Application Architect Certifications are :");
		ac.getCertifications(driver);
	}
	
	public void getCertifications(ChromeDriver driver) {
		List<WebElement> cert = driver.findElements(By.xpath("//div[@class='credentials-card ']//div[@class='credentials-card_title']"));
		for(int i = 0; i < cert.size(); i++)
			System.out.println(cert.get(i).getText());
	}
}