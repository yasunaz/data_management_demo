package demo;

import utility.JsonUtils;

public class Demo {
	// main method
	// Demonstration of using JSON data management
	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + "/src/main/resources/testdata/user.json";

		JsonUtils jutils = new JsonUtils(filePath);

		String username = jutils.data("manager.username");
		System.out.println(username);
	}
}
