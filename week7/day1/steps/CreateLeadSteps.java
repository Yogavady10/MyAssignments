package week7.day1.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps {
	public ChromeDriver driver;
	
	@Given("Open browser and load Leaftaps application")
	public void loadApp() {
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Enter Username")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
	
	@And("Enter Password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");	
	}
	
	@When("Click Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();	
	}
	
	@Then("Verfiy homepage is displayed")
	public void verifyHomepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if(text.contains("Welcome"))
			System.out.println("Homepage is displayed");
		else
			System.out.println("Homepage is not displayed");
	}
	
	@And("Click CRM\\/SFA button")
	public void clickCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@And("Click Leads tab")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@And("Click Create Lead Tab")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And("Enter Company Name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	}
	@And("Enter First Name")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pranav");
	}
	@And("Enter Last Name")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sakthidasan");
	}
	@When("Click Submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Verify Lead is created")
	public void verifyLeadCreated() {
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name.equals("Pranav"))
			System.out.println("Lead is created");
		else
			System.out.println("Lead is not created");
	}
}