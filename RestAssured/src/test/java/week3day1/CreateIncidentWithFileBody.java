package week3day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithFileBody {

	
	@Test
	public void createIncidentWithFile() {
		
		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Add AUth
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		// Add Request
		
		File inputFile=new File("./src/test/resources/createincident.json");
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body(inputFile);
		
		
		
		// Send Request
		Response response = inputRequest.post("/incident");
		
		response.prettyPrint();
	}
}
