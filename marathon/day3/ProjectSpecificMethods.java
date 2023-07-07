package marathon.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public RemoteWebDriver driver;
	public String filename;
	
	@BeforeMethod
	@Parameters({"url", "browser", "username", "password"})
	public void openBrowser(String url, String browser, String username, String password) {
		switch(browser) {
			case "chrome":
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() {
		String[][] str = TestData.getData("");
		return str;
	}
}