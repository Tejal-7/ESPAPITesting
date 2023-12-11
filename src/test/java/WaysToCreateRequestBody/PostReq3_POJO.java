package WaysToCreateRequestBody;
import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class PostReq3_POJO {

	@Test
	public void Pojopost() {
		POJO_Postreq3 data = new POJO_Postreq3();
		data.setEmail("eve.holt@reqres.in");
		data.setPassword("pistol");
		
		given()
		.contentType("application/json")
		.body(data)
.when()
.post("https://reqres.in/api/register")
.then()
.statusCode(200)
.body("id", equalTo(4))
.body("token",equalTo("QpwL5tke4Pnpja7X4"))
.header("Content-Type", "application/json; charset=utf-8")
.log().all(); 


	
	
	}
}
