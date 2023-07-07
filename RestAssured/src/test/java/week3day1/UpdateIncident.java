package week3day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident {

	@Test
	public void update() {
		
		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Add AUth
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		// Add Request
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"short_description\": \"Updated via RA\",\r\n"
				+ "    \"description\": \"Updated via RA\"\r\n"
				+ "}");
		
		
		//Send Request
		
		Response response = inputRequest.put("/incident/6d3681e82fe3211081e256f62799b66e");
		
		//print response
		
		response.prettyPrint();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("status code-----------"+statusCode);
		
		
	}
}
