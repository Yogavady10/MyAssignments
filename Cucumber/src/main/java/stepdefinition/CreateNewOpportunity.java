package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewOpportunity {
	public ChromeDriver driver;
	public String oppName;
	@Given("Open browser and load sales force application using {string}")
	public void loadApp(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@And("Enter Username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	@And("Enter Password as {string}")
	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click Login")
	public void clickLogin() {
		driver.findElement(By.id("Login")).click();
	}
	@Then("Verify Login")
	public void verifyLogin() {
		String title = driver.getTitle();
		if(title.contains("Home"))
			System.out.println("Login is verified");
		else
			System.out.println("Login is not verified");
	}
	@But("Verify error message")
	public void verfiyPassword() {
		String error = driver.findElement(By.id("error")).getText();
		if(error.contains("Please enter your password."))
			System.out.println("Verified error message");
		else
			System.out.println("Error message is not verified");
	}
	@And("Click App Launcher")
	public void clickAppLauncher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}
	@And("Click View All")
	public void clickViewAll() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And("Click Sales from App Launcher")
	public void clickSales() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	@And("Click Opportunities tab")
	public void clickOpportunities() {
		WebElement element = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", element);
	}
	@And("Click on New button")
	public void clickNew() {
		driver.findElement(By.xpath("//div[text()='New']/parent::a")).click();
	}
	@And("Enter Opportunity name as {string}")
	public void enterOpportunityName(String name) {
		WebElement nameElement = driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input"));
		nameElement.sendKeys(name);
		oppName = nameElement.getAttribute("value");
	}
	@And("Choose close date as Today")
	public void selectCloseDate() {
		//driver.findElement(By.xpath("//input[@name='CloseDate' ]")).click();
	}
	@And("Select Stage as {string}")
	public void selectStage(String stage) {
		driver.findElement(By.xpath("//label[text()='Stage']/following::div")).click();
		driver.findElement(By.xpath("//span[text()='"+stage+"']")).click();
	}
	@When("Click Save")
	public void clickSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then("VerifyOppurtunity Name as {string}")
	public void verifyOpportunityName(String name) {
		if(oppName.equals(name))
			System.out.println("Opportunity Name is verified");
		else
			System.out.println("Opportunity Name is not verified");
	}
}