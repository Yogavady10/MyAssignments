package week3day2JIRA;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SearchIssue extends BaseClass {

	@Test(dependsOnMethods = "week3day2JIRA.CreateIssue.issue")
	public void search() {
		inputRequest = RestAssured.given().contentType("application/json");
		
		response = inputRequest.get("/issue/"+issue_id);
		
//		response.prettyPrint();
		
//		response.then().assertThat().body("id", Matchers.equalTo(issue_id));
	}
}
