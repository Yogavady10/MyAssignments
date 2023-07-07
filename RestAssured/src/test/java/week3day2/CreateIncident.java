package week3day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident extends BaseClass{
	
	@Test
	public void incident() {
		
		
		//Form request body
		 inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"description\": \"This is my first description\",\r\n"
				+ "    \"short_description\": \"This is my first SD\",\r\n"
				+ "    \"category\": \"software\"\r\n"
				+ "}");
		 //Send Request
		 
		  response = inputRequest.post("/incident");
		  
		  sys_id= response.jsonPath().get("result.sys_id");
		  
		  System.out.println(sys_id);
		  
		  
		 
		
	}

}
