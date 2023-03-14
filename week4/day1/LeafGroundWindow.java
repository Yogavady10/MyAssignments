package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafGroundWindow {
	public static List<String> getWindow(ChromeDriver d){
		Set<String> windowHandles = d.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		return list;
	}
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click and Confirm new Window Opens
		String url = driver.getCurrentUrl();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		List<String> list = getWindow(driver);
		driver.switchTo().window(list.get(1));
		String newURL = driver.getCurrentUrl();
		if(!url.equals(newURL))
			System.out.println("New window opens");
		
		driver.switchTo().window(list.get(0));
		
		// Find the number of opened tabs
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		list = getWindow(driver);
		int count = list.size();
		System.out.println("Number of tabs opened: " + (count-1));
		
		driver.switchTo().window(list.get(0));
		
		// Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		list = getWindow(driver);
		for(int i = 1; i < list.size(); i++) {
			driver.switchTo().window(list.get(i));
			driver.close();
		}
		
		driver.switchTo().window(list.get(0));
		
		// Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		boolean waitUntil = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Waited for opening two tabs " +waitUntil);
	}
}
