package week3day2;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	
	public static  RequestSpecification inputRequest;
    public static  Response response;
    public static String sys_id;
	
	@BeforeMethod
	public void setUp() {
		
		// Add base uri

				RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";
				
				//Add AUth
				
				RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
	}
}
