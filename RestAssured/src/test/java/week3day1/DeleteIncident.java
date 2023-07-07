package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIncident {
	@Test
	public void delete() {
		
		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Add AUth
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		// Add Request
		
		RequestSpecification inputRequest = RestAssured.given();
		
		//Send Request
		
		Response response = inputRequest.delete("/incident/2c99016c2fe3211081e256f62799b60a");
		
		//To get the status code
		
		int statusCode = response.getStatusCode();
		
		System.out.println("The status code is -------------"+statusCode);
		
		
		
	}

}
