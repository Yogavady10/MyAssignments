package uibank;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UiBankLogin {
	public static String id;
	@BeforeMethod
	public void setUp() {
		
		RestAssured.baseURI="https://uibank-api.azurewebsites.net/api/";
		
		RequestSpecification inputRequest = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "    \"username\": \"FebApiuser\",\r\n"
				+ "    \"password\": \"Eagle@123\"\r\n"
				+ "}");
		Response response = inputRequest.post("users/login");
		response.prettyPrint();
		id=response.jsonPath().get("id");
	}
	@Test
	public void createAcc() {
		RequestSpecification inputRequest = RestAssured.given()
				.contentType("application/json").header("authorization",id).
				when().body("{\r\n"
				+ "    \"friendlyName\": \"TestShan Account\",\r\n"
				+ "    \"type\": \"savings\",\r\n"
				+ "    \"userId\": \"64290731ba9f8a0047adacfc\",\r\n"
				+ "    \"balance\": 100,\r\n"
				+ "    \"accountNumber\": 3737722\r\n"
				+ "}");
		
		Response response = inputRequest.post("accounts");
		response.prettyPrint();
	}

}
