package marathon.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class OrderMobile {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		
		//1. Launch ServiceNow application
		driver.get("https://dev86669.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//	2. Login with username as "admin" and password as "Testleaf@123"
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Testleaf@123");
		driver.findElement(By.id("sysverb_login")).click();
		
		//	3. Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
		Shadow s = new Shadow(driver);
		s.setImplicitWait(20);
		s.findElementByXPath("//div[@class='starting-header-zone']//div[text()='All']").click();
		s.findElementByXPath("//span[text()='Service Catalog']/ancestor::a").click();
		
		//	4. Click on mobiles
		Actions a = new Actions(driver);
		WebElement frame = s.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		WebElement findElement = driver.findElement(By.xpath("//table//a[text()='Mobiles']"));
		a.moveToElement(findElement).click().perform();
		
		//	5. Select Apple iphone13pro
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']/ancestor::a")).click();
		
		//	6. Update color field to gold and storage field to 128GB
		
		//	7. Select  Order now option
		
		//	8. Verify order is placed and copy the request number"
	}
}
