package tests.rest;

import com.github.javafaker.Faker;

public class TestDataGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Faker fake=new Faker();
		String firstName = fake.name().firstName();
		String emailAddress = fake.internet().emailAddress();
		String digits = fake.number().digits(10);
		System.out.println("FirstName------"+firstName);
		System.out.println("Email Address------"+emailAddress);
		System.out.println(digits);
		

	}

}
