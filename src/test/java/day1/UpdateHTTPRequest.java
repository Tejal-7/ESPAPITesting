package day1;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;

public class UpdateHTTPRequest {
int id;
	@Test(priority=1)
	public void createUser1() {
		HashMap data = new HashMap();
		data.put("name", "Manu");
		data.put("job", "Develpoer");
		
		id=given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	}
	
	@Test (priority=2, dependsOnMethods= {"createUser1"})
	public void updateUser() {
		HashMap data1= new HashMap();
		data1.put("name", "Rani");
		data1.put("job", "Tester");
		given()
		.contentType("application/json")
		.body(data1)
		.when()
		.put("https://reqres.in/api/users/" + id)
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
}
