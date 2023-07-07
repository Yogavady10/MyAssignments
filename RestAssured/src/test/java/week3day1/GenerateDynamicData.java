package week3day1;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class GenerateDynamicData {

	@Test
	public void generateData() {

		Faker fake =new Faker();
		String firstName = fake.name().firstName();
		String lastName = fake.name().lastName();
		String emailAddress = fake.internet().emailAddress();
		System.out.println("FN-------"+firstName);
		System.out.println("LN----------"+lastName);
		System.out.println("EmailAddress----------"+emailAddress);

	}
}
