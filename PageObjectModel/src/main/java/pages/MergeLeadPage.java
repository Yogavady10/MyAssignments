package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MergeLeadPage extends ProjectSpecificMethods{

	public static Set<String> allWindows;
	public static List<String> allhandles;
	
	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadPage clickLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadPage(driver);
	}
	
	public FindLeadPage clickSecondLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadPage(driver);
	}
	
	public ViewLeadPage clickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
	}
}
