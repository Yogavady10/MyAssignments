package week3day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident extends BaseClass {

	@Test(dependsOnMethods = "week3day2.CreateIncident.incident")
	public void update() {
		
		// Add Request
		
				 inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
						+ "    \"short_description\": \"Updated via RA\",\r\n"
						+ "    \"description\": \"Updated via RA\"\r\n"
						+ "}");
				
				
				//Send Request
				
				 response = inputRequest.put("/incident/"+sys_id);
				 
				 System.out.println("am sys_id from update Request-------------"+sys_id);
		
		
	}
}
