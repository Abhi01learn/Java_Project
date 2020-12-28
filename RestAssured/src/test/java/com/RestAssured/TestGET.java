package com.RestAssured;

import org.apache.tools.ant.property.ParseProperties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;

import static io.restassured.RestAssured.given;
import Files.Resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestGET {
	Properties prop =  new Properties();
	
	@BeforeTest
	public void getData() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\omabh\\eclipse-workspace\\RestAssured\\src\\test\\java\\Files\\env.properties");
		prop.load(file);
	}

	@Test
	public void GETCall() {
		RestAssured.baseURI = prop.getProperty("HOST").concat(Resources.resourceURL());
		String  response= given().request(Method.GET).andReturn().prettyPrint();
		
		
		  when().
		  request(Method.GET).
		  then().assertThat().contentType(ContentType.JSON).and().statusCode(200);
		  
		  System.out.println("TEST COMPLETED");
		  
		  
		 

	}

}
 