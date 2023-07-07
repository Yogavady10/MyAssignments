package week3day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident extends BaseClass {
	
	@Test(dependsOnMethods = "week3day2.UpdateIncident.update")  //packagename.classname.methodname
	public void delete() {
		
		 response = inputRequest.delete("/incident/"+sys_id);
		int statusCode = response.getStatusCode();
		
		System.out.println("Delete status code"+statusCode);

		
	}

}
