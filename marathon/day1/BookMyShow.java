package marathon.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
	public static void main(String[] args) throws InterruptedException {
		//01) Launch Edge / Chrome  add  implicitlyWait
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//02) Load https://in.bookmyshow.com/
		driver.get("https://in.bookmyshow.com/");
		
		//03) Type the city as ""Hyderabad"" in Select City
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//strong[text()='Hyderabad']")).click();

		//04) Confirm the URL has got loaded with Hyderabad 
		String currentURL = driver.getCurrentUrl();
		if(currentURL.contains("hyderabad"))
			System.out.println("Resulting page is in Hyderabad");
		else
			System.out.println("Resulting page not found");
		
		//05) Search for your favorite movie 
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		WebElement movie = driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']"));
		movie.sendKeys("Avatar: The Way of Water");
		
		driver.findElement(By.xpath("//span[contains(text(),'Avatar')]")).click();
		
		//06) Click on movie
		driver.findElement(By.xpath("//span[text()='Book tickets']/ancestor::button")).click();
		driver.findElement(By.xpath("//span[text()='3D']")).click();
		
		//07) Print the name of the theater displayed first
		String firstTheaterName = driver.findElement(By.xpath("//div[@class='__title']/a")).getText();
		System.out.println("First Theater Name : " +firstTheaterName);
		
		//08) Click on the info of the theater
		driver.findElement(By.xpath("//div[text()='INFO']")).click();
		
		//09) Confirm if there is a parking facility in the theater
		By loc = By.xpath("//div[@class='facility-text']");
		List<WebElement> facility = driver.findElements(loc);
		int count = 0;
		for(int i = 0; i <= facility.size(); i++) {
			WebElement element = facility.get(i);
			if(element.getText().contains("Parking")){
				count = 1;
				break;
			}
		}
		if(count == 1){
			System.out.println("Parking facility in the theater is confirmed");
		}
		else {
			System.out.println("Parking facility in the theater is not confirmed");
		}
		
		//10) Close the theater popup
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
		
		//11) Click on the first green (available) timing
		driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
		
		//12) Click Accept
		driver.findElement(By.id("btnPopupAccept")).click();
		
		//13) Choose 1 Seat and Click Select Seats
		driver.findElement(By.id("pop_1")).click();
		driver.findElement(By.id("proceed-Qty")).click();
		
		//14) Choose any available ticket and Click Pay
		driver.findElement(By.id("B_H_06")).click();
		driver.findElement(By.id("btmcntbook")).click();
		
		//15) Print the sub total
		String subTotal = driver.findElement(By.xpath("//span[@class='__sub-total']")).getText();
		System.out.println("Sub Total: " +subTotal);
	}
}