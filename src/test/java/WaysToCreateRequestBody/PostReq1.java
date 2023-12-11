 package WaysToCreateRequestBody;
 import static  io.restassured.RestAssured.*;
 import static io.restassured.matcher.RestAssuredMatchers.*;
 import static  org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class PostReq1 {
	
       // post req using hashmap
	
	@Test
	public void postUsingHM() {
	HashMap data = new HashMap();
	data.put("email","eve.holt@reqres.in");
	data.put("password","pistol");
	
	/*To store multiple values we need array 
	 like 
	 String CourseArr[]={"c","c++"};
	 data.put("Key","CourseArr");
	 */
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
	 
/*Expected Response 
{
    "id": 4,
    "token": "QpwL5tke4Pnpja7X4"
}*/
	
	}
 }
