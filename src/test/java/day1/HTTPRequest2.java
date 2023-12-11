package day1;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

public class HTTPRequest2 {

@Test
public void getUser() {
	given()
	
	
	
	.when()
	.get("https://reqres.in/api/users/2")
	
	.then()
	.statusCode(200)
	.body("id",equalTo(2))
	.log().all();
	
	
}
}
