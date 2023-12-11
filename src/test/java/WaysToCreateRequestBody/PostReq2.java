package WaysToCreateRequestBody;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import org.json.JSONObject;
import org.testng.annotations.Test;
 public class PostReq2{
   @Test
	 public void PostReqUsingorgJSON() {
		 JSONObject data = new JSONObject();
		   data.put("email","eve.holt@reqres.in");
			data.put("password","pistol");	 
			
			given ()
			.contentType("application/json")
			.body(data.toString())
			
			.when()
			.post("https://reqres.in/api/register")

			.then()
			.statusCode(200)
			.body("id",equalTo(4))
			.body("token",equalTo("QpwL5tke4Pnpja7X4"))
		    .header("Content-Type", "application/json; charset=utf-8")	  
		    .log().all();
	 
	 
	 
	 
	 
	 }
}
