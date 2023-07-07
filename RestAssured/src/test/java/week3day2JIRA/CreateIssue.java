package week3day2JIRA;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateIssue extends BaseClass{

	@Test
	public void issue() {
		inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"TES\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in Adaxa project\",\r\n"
				+ "        \"description\": \"Creating of an issue using the REST Assured\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Task\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}");
		
		response = inputRequest.post("/issue/");
		
		response.prettyPrint();
		
		issue_id = response.jsonPath().getInt("id");
		
		System.out.println("Issue ID : " +issue_id);
	}
}
