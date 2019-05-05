package demo;

import com.github.javafaker.Faker;

public class Demo {
	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println("This is the testst that we will be using for the ");
		System.out.println("Test Execution of our web applicaiton");
		System.out.println( faker.name().firstName() );
		System.out.println( faker.company().name()   );
		System.out.println( faker.address().countryCode() );
		System.out.println( faker.commerce().price()   );
		System.out.println( faker.number().numberBetween(-10, -2));
		System.out.println( faker.internet().emailAddress()  );
	}
}
