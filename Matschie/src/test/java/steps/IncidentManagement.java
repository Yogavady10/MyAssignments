package steps;


import java.io.File;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class IncidentManagement extends Common{
	
	

	@Given("Set the endpoint")
	public  void SetEndpoint() {
		RestAssured.baseURI="https://dev140572.service-now.com/api/now/table/";
	}
	
	@And("Set the Auth")
	public void setAuth() {
		RestAssured.authentication=RestAssured.basic("admin", "P-qQ7@umSYz8");
	}
	
	@When("get incidents")
	public void getIncidents() {
		
		inputRequest = RestAssured.given();
		response = inputRequest.get("incident");
	}
	
	@Then("validate response code as {int}")
	public void validateRespons(int responseCode) {
		
		response.then().assertThat().statusCode(responseCode);
		//response.prettyPrint();
	}
	
	@When("create incident with String body {string}")
	public void createIncident(String body) {
	
		inputRequest = RestAssured.given().contentType("application/json").body(body);
		response = inputRequest.post("incident");
		//response.prettyPrint();
	}
	
	@When("get incidents with queryparam {string} and {string}")
	public void getIncidentQP(String key, String value) {
		
		inputRequest = RestAssured.given().queryParam(key, value);
		response = inputRequest.get("incident");
	}
	
	@When("create incident with file {string}")
	public void createIncidentFile(String fileName) {
		
		File file =new File ("./data/"+fileName);
		inputRequest = RestAssured.given().contentType("application/json").body(file);
		response = inputRequest.post("incident");
		
		
	}	


}


