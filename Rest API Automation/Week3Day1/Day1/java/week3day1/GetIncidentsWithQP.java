package week3day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentsWithQP {

     @Test
	public void getIncident() {

		// Add base uri

		RestAssured.baseURI="https://dev90367.service-now.com/api/now/table";

		//Add AUth

		RestAssured.authentication=RestAssured.basic("admin", "d-J+lC2Hk7Aj");
		
        //Form Request body with query parameters
		
		RequestSpecification inputRequest = RestAssured.given().queryParam("sysparm_fields", "sys_id,category").when();
		
		//Send Request
		
		Response response = inputRequest.get("/incident");
		
		//Print the response 
		response.prettyPrint();


	}

}
