package week3day2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AssertWithTestNG {
	
	@Test
	public void delete() {
		
		// Add base uri

				RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
				
				//Add AUth
				
				RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
				
				
				// Add Request
				
				RequestSpecification inputRequest = RestAssured.given();
				
				//Send Request
				
				Response response = inputRequest.delete("/incident/75f2b1342f27611081e256f62799b60e");
				
				//To get the status code
				
				int statusCode = response.getStatusCode();
				
				Assert.assertEquals(statusCode, 204);
		
		
	}

}
