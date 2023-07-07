package week3day2;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertResponseBodyContains {
	
	@Test
	public void assertResponse() {
		
		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Add AUth
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		// Add Request
		
		File inputFile=new File("./src/test/resources/CreateIncident.json");
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body(inputFile);
		
		
		
		// Send Request
		Response response = inputRequest.post("/incident");
		
		
		response.then().assertThat().body("result.description", Matchers.containsString("Updated"));
	}

}
