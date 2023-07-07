package week3day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentsWithQPS {

     @Test
	public void getIncident() {

		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";

		//Add AUth

		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
        //Form Request body with query parameters
		
	/*	RequestSpecification inputRequest = RestAssured.given()
				.queryParam("sysparm_fields", "sys_id,category")
				.queryParam("sysparm_limit", "2")
				.when(); */
		
		Map<String,String> queryParameters=new HashMap<String,String>();
		queryParameters.put("sysparm_fields", "sys_id,category");
		queryParameters.put("sysparm_limit", "2");
		
		RequestSpecification inputRequest = RestAssured.given().queryParams(queryParameters)
				.when();
		
		//Send Request
		
		Response response = inputRequest.get("/incident");
		
		//Print the response 
		response.prettyPrint();


	}

}
