package week7.day2.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps {
	public ChromeDriver driver;
	
	@Given("Open browser and load Leaftaps application using {string}")
	public void loadApp(String url) {
		driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Enter Username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	
	@And("Enter Password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);	
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
	
	@But("Verfiy error is displayed")
	public void verfiyError() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if(text.contains("password was empty reenter")) {
			System.out.println("Verified error message");
		}
		else {
			System.out.println("Not verified error message");
		}
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
	@And("Enter Company Name as {string}")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@And("Enter First Name as {string}")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("Enter Last Name as {string}")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@When("Click Submit button")
	public void clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Verify Lead is created")
	public void verifyLeadCreated() {
		String name = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(name.equals("Hari") || name.equals("Babu"))
			System.out.println("Lead is created");
		else
			System.out.println("Lead is not created");
	}
}