package week3day2JIRA;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class EditIssue extends BaseClass{

	@Test(dependsOnMethods = "week3day2JIRA.SearchIssue.search")
	public void edit() {
		inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"description\": \"Bug creation using REST Assured for Testing\"\r\n"
				+ "    }\r\n"
				+ "}");
		
		response = inputRequest.put("/issue/"+issue_id);
		
		response.prettyPrint();
		
		int statusCode = response.getStatusCode();
		
		System.out.println("status code-----------"+statusCode);
	
//		response.then().assertThat().body("description", Matchers.containsStringIgnoringCase("Rest Assured"));
	}


}
