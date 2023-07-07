package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithStringBody {

	@Test
	public void createIncident() {


		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
		
		//Add AUth
		
		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
		
		// Add Request
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"This is my first description\",\r\n"
				+ "    \"short_description\": \"This is my first SD\",\r\n"
				+ "    \"category\": \"software\"\r\n"
				+ "}");
		
		//Send Request
		
		Response response = inputRequest.post("/incident");
		
		//Print
		
		response.prettyPrint();
		
		//Extract value of sys_id
		
		String sys_id = response.jsonPath().get("result.sys_id");
		
		//response.jsonPath().get("result.sys_id")
		
		System.out.println("System ID------------->"+sys_id);
		
	}

}