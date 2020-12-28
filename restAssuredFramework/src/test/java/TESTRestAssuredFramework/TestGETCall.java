package TESTRestAssuredFramework;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TestGETCall {
	
	@Test
	 public void GetCall() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
		
		given().request(Method.GET).andReturn().prettyPeek();
	}

}
