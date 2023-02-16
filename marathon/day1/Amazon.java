package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		// 01) Launch Chome  add  implicitlyWait
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//02) Load https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		//03) Type "Bags" in the Search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		//04) Choose the item in the result (bags for boys)
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'for boys')]/parent::div")).click();
		
		//05) Print the total number of results (like 40000)
		//1-48 of over 40,000 results for "bags for boys"
		WebElement result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println(result.getText());
		
		//06) Select the first 2 brands in the left menu
		//(like American Tourister, Generic)
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li//div")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//li[3]//div")).click();
		
		//07) Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[text()='Sort by:']/parent::span")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		//08) Print the first resulting bag info (name, discounted price)
		WebElement firstBagName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		WebElement firstBagPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		WebElement secondBagName = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
		WebElement secondBagPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
		
		System.out.println("First Bag Name: " +firstBagName.getText());
		System.out.println("First Bag Price : " +firstBagPrice.getText());
		System.out.println("Second Bag Name : " +secondBagName.getText());
		System.out.println("Second Bag Price : " +secondBagPrice.getText());
		
		//09) Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println("Title of the page: " +title);
		
		driver.close();
	}
}