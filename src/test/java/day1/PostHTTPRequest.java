 

package day1;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostHTTPRequest {

	@Test 
	public void createUser() {
		HashMap data = new HashMap();
		data.put("name", "Tejal");
		data.put("job", "QA");
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		 
		
		.then()
		.statusCode(201)
		.log().all();
		
	}
}
