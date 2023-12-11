package WaysToCreateRequestBody;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;


public class PostReq4 {
//using external json file 
	@Test
	public void PostReqef4() throws FileNotFoundException {
	File f= new File (".\\Body1.json");
	FileReader fr= new FileReader(f);
JSONTokener jt= new JSONTokener(fr);
JSONObject data = new JSONObject(jt);

given()
.contentType("application/json")
.body(data.toString())
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
