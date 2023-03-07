package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//  - Load amazon.in
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// - Type mobiles in the search box and do keys.Enter
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		
		// - Find a common value to locate all the prices
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		
		// - Print all the mobile prices by replacing all the comma(String.replaceAll(","),"");
		//System.out.println("Mobile prices are:");
		String p = "";
		List<Integer> mprice = new ArrayList<Integer>();
		for(int i = 0; i<  prices.size(); i++) {
			p = prices.get(i).getText().replace(",", "");
			//System.out.println(p);
			if(!p.isEmpty()) {
				// - Convert String to Integer using Integer.parseInt(replacedString); // - Add it to list
				mprice.add(Integer.parseInt(p));
			}
		}
		
		// - Sort the list to find the minimum value(Collections.sort())
		Collections.sort(mprice);
		
		// - Print the least mobile price
		System.out.println("Least mobile price is : " +mprice.get(0));
	}
}
