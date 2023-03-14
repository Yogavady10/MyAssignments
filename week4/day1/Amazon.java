package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
	public static void main(String[] args) throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		//	1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//	2.search as oneplus 9 pro 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		//	3.Get the price of the first product
		String price = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the first product : " +price);
		
		//	4. Print the number of customer ratings for the first displayed product
//		String rating = driver.findElement(By.xpath("//div[@data-component-type='s-search-result'][1]//span[@class='a-size-base']")).getText();
//		System.out.println("Rating given for the first product : " +rating);

		//	5. Click the first text link of the first image
		driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'][1]//a)[2]")).click();
		Set<String> window = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		
		//	6. Take a screen shot of the product displayed 
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./testData/oneplus.png"));
		
		//	7. Click 'Add to Cart' button
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//	8. Get the cart subtotal and verify if it is correct.
		String subTotal = driver.findElement(By.className("a-price-whole")).getText();
		if(price.equals(subTotal)) {
			System.out.println("Subtotal matches the price");
		}
		else {
			System.out.println("Subtotal not matches the price");
		}
		//	9.close the browser
		driver.quit();
	}
}
