package demo;

import com.github.javafaker.Faker;

public class FakerDemo {
	// main method
	// Demonstration of JavaFaker library
	public static void main(String[] args) {

		Faker faker = new Faker();

		System.out.println(faker.name().firstName());
		System.out.println(faker.company().name());
		System.out.println(faker.address().countryCode());
		System.out.println(faker.commerce().price());
		System.out.println(faker.number().numberBetween(-10, -2));
		System.out.println(faker.internet().emailAddress());
	}
}
