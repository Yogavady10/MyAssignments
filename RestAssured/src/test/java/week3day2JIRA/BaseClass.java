package week3day2JIRA;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	public static RequestSpecification inputRequest;
	public static Response response;
	public static int issue_id;

	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://testjirafeb2023.atlassian.net/rest/api/2";
		
		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF0rPOMqZxGdflGlBxWDAIHzeQZBdlMj7sgcKXAOJ54WMNlnwyfIvKBnxOSrA1sInG3WsqRX0VYRU11V-ntVJ6jTnO3BRuPHOreT4SSt6hkQjEUD2zev40-J0WJJ1v5LPSUtneKaZ1miG3y3XABr2RJsUIPiF1WDzv_5h1PPzI7Vdw=5E54F4E7");
		
	}
}
