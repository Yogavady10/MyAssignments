package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EditIssue {

	@Test
	public void edit() {

		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net/rest/api/2";
		
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0rPOMqZxGdflGlBxWDAIHzeQZBdlMj7sgcKXAOJ54WMNlnwyfIvKBnxOSrA1sInG3WsqRX0VYRU11V-ntVJ6jTnO3BRuPHOreT4SSt6hkQjEUD2zev40-J0WJJ1v5LPSUtneKaZ1miG3y3XABr2RJsUIPiF1WDzv_5h1PPzI7Vdw=5E54F4E7");
		
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Bug creation using REST Assured for Testing\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		Response response = inputRequest.put("/issue/11175");
		
		response.prettyPrint();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("status code-----------"+statusCode);
	
	}


}
