package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithoutBody {

	@Test
	public void incident() {
		
		//Endpoint url
		
		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Authentication
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		//Add Request (contenttype and request body) --Always specify the content type in Rest Assured
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("");
		
		// Send Request
		Response response = inputRequest.post("/incident");
		
		response.prettyPrint();
		
		
		
	}
}
