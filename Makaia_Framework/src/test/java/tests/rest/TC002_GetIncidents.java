package tests.rest;

import java.io.File;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;


public class TC002_GetIncidents extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Get All Incidents";
		testDescription = "Get All incidents";
		nodes = "Incident";
		authors = "Sudarshan";
		category = "REST";
	}

	@Test
	public void getIncident() {		
				
		Response response = get("incident");
		response.prettyPrint();
		verifyContentType(response, "application/json");
		verifyResponseCode(response, 200);
		
		
	}


}




















