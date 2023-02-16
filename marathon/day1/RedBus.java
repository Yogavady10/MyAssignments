package marathon.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.redbus.in/");
		
//		03) Type ""Chennai"" in the FROM text box
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		
//		04) Click the first option from the pop up box
		//driver.findElement(By.xpath("//li[@class='selected']")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
//		05) Type ""Bangalore"" in the TO text box
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		
//		06) Click the first option from the pop up box
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
//		07) Select tomorrow's date in the Date field
		driver.findElement(By.xpath("//td[text()='17']")).click();
		
//		08) Click Search Buses
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
//		09) Print the number of buses shown as results (104 Buses found) (use .getText())
		String noOfBus =  driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(noOfBus);
		
//		10) Choose SLEEPER in the left menu 
		WebElement sleeper = driver.findElement(By.xpath("//input[@id='bt_SLEEPER']"));
        driver.executeScript("arguments[0].click();", sleeper);
		
//		11) Print the name of the second resulting bus (use .getText())
		WebElement busName = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
		System.out.println("Second Resulting Bus: " +busName.getText());
        
//		12) Get the Title of the page(use .getTitle())
		String title = driver.getTitle();
		System.out.println("Title of the page: " +title);
	}
}