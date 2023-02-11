package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApplication {
	public static void main(String[] args) {
		ChromeDriver cDriver = new ChromeDriver();
		cDriver.get("https://www.facebook.com/");
		
		EdgeDriver eDriver = new EdgeDriver();
		eDriver.get("https://www.salesforce.com/");
	}
}
