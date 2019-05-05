package demo;

import com.github.javafaker.Faker;
import com.github.javafaker.FunnyName;

import utility.JsonUtils;

public class FakerDemo {
	// main method
	public static void main(String[] args) {
	
		String filePath = System.getProperty("user.dir")+"/src/main/resources/testdata/user.json";
		
		JsonUtils jutils = new JsonUtils(filePath);
		
		String username = jutils.data("manager.username");
		System.out.println(username);
		
	}
}
