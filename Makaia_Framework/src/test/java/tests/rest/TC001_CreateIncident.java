package tests.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;
import lib.utils.ConfigurationManager;


public class TC001_CreateIncident extends RESTAssuredBase{
	
	@BeforeTest//Reporting
	public void setValues() {
		testCaseName = "Create a new Incident (REST)";
		testDescription = "Create a new Incident and Verify";
		nodes = "Incident";
		authors = "Sarath";
		category = "REST";
		//dataProvider
		dataFileName = "TC001";
		dataFileType = "JSON";
	}

	@Test(dataProvider = "fetchData")
	public void createIncident(File file) throws FileNotFoundException, IOException {		
		
      /*  Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./src/test/resources/response.properties")));
		String code = prop.getProperty("responsecodeforPost");
		int statusCode = Integer.parseInt(code);
		System.out.println(statusCode);*/
		System.out.println(ConfigurationManager.configuration().responsecodeforPost());
		Response response = postWithBodyAsFileAndUrl(file, "incident");
		//response.prettyPrint();
		verifyContentType(response, "application/json");
		//verifyResponseCode(response, statusCode);
		verifyResponseCode(response, ConfigurationManager.configuration().responsecodeforPost());
		verifyContentWithKey(response, "result.short_description", "This is Rest Assured Automation framework - Makaia");
		
	}


}




















