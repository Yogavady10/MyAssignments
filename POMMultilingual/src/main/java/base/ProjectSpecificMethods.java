package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public Properties prop;
	public String fileName;
	@BeforeMethod
	public void preCondition() throws IOException {
		FileInputStream fis = new FileInputStream("src/main/resources/config_english.properties");
		prop = new Properties();
		prop.load(fis);
		
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] str = TestData.getData(fileName);
		return str;
	}
}
