package week3day2JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteIssue extends BaseClass {
	
	@Test(dependsOnMethods = "week3day2JIRA.EditIssue.edit")
	public void delete() {
		inputRequest = RestAssured.given();
		
		response = inputRequest.delete("/issue/"+issue_id);
		
		response.prettyPrint();
	
		int statusCode = response.statusCode();
		
		System.out.println("Status Code -----" +statusCode);
	
	}

}
