package steps;


import java.io.File;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Incidents {

	public static RequestSpecification inputRequest;
	public static Response response;
	public static String sys_id;

	@Given("Set the Endpoint")
	public void setURI() {

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
	}

	@And("Set the Auth")
	public void addAuth() {
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
	}
	@When("get incidents")
	public void getIncident() {

		inputRequest = RestAssured.given();
		response = inputRequest.get("/incident");
		//response.prettyPrint();

	}
	@Then("validate response code as {int}")
	public void validateStatusCode(int responseCode) {

		response.then().assertThat().statusCode(responseCode);
	}

	@When("Create Incident with String body as {string}")
	public void incidentWithStringBody(String body) {
		inputRequest = RestAssured.given().contentType("application/json")
				.when()
				.body(body);
		response=inputRequest.post("/incident");
	//	response.prettyPrint();
		sys_id=response.jsonPath().get("result.sys_id");
	}
	@When("create Incident with file {string}")
	public void createIncidentWithFile(String fileName) {
		
		File filePath=new File("./src/test/resources/"+fileName);
		
		inputRequest = RestAssured.given().contentType("application/json")
				.when()
				.body(filePath);
		response=inputRequest.post("/incident");
		
	}
	@When("get incidents with query param {string} and {string}")
	public void getIncidentsWithQP(String key,String value) {
		
		inputRequest = RestAssured.given().queryParam(key, value);
		response = inputRequest.get("/incident");
		response.prettyPrint();
		
	}




}
