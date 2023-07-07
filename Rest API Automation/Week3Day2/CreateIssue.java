package week3day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateIssue {
	
	
	@Test
	public void create() {
		
		// Add base uri

				RestAssured.baseURI="https://testjirafeb2023.atlassian.net/rest/api/2";

				//Add AUth

		RestAssured.authentication=RestAssured.preemptive().basic("Feb2023restAPI@gmail.com", "ATATT3xFfGF08mjXA8IMy4YNulKUbXyVdhEPvaizUSTRl7a-VDtABKuyLGev9iZVx66Cq3LH-tnvdEMzf_BKapLgJuVN3quYEB0Mo4ee9VFrCV_Ei_pgcZYSvtpxgEBgNBJW-O4RVxBCWfdAISekIAQw3fuRGIexgb1B3SiQXCnl6AanHHxDtjk=A739D6A7");	
	}

}
