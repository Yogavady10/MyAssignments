package week3day2;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertWithCondition {

	@Test
	public void createIncident() {
		
		// Add base uri

				RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
				
				//Add AUth
				
				RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
				
				
				// Add Request
				
				File inputFile=new File("./src/test/resources/createincident.json");
				
				RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body(inputFile);
				
				
				
				// Send Request
				Response response = inputRequest.post("/incident");
				
				
				//validate response code
				
				int statusCode = response.getStatusCode();
				
				if(statusCode==201){
					
					System.out.println("Testcase Pass");
				}
				
				else {
					System.out.println("Testcase fail");
				}
				
				
				
				
				
				
				
				
				
				
				
	}
}
