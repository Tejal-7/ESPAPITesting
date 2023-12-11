package day1;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

/*given()


when()


then()
*/


public class HTTPRequests1 {
@Test
public void getUsers() {
	given()
	
	.when()
.get("https://reqres.in/api/users?page=2")

	.then()
.statusCode(200) 
.body("page",equalTo(2))
.log().all();

 }
}
