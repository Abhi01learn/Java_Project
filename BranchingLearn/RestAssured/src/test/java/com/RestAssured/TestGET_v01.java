package com.RestAssured;

import org.apache.tools.ant.property.ParseProperties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.xml.crypto.Data;
import Files.Resources;
import static io.restassured.RestAssured.*;
import Files.Reusuable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@SuppressWarnings("unused")
public class TestGET_v01 {
	Properties prop = new Properties();

	@BeforeTest
	public void getData() throws IOException {
		FileInputStream file = new FileInputStream(
				"C:\\Users\\omabh\\eclipse-workspace\\RestAssured\\src\\test\\java\\Files\\env.properties");
		prop.load(file);
	}

	@Test
	public void GETCall() {
		RestAssured.baseURI = prop.getProperty("HOST").concat(Resources.resourceURL());
		given().request(Method.GET).andReturn().prettyPrint();
		

		Response rawResponse = given().log().all().get(prop.getProperty("HOST").concat(Resources.resourceURL())).then().assertThat()
				.contentType(ContentType.JSON).and().statusCode(200).extract().response();

		JsonPath jsonPath = Reusuable.rawToJson(rawResponse);

		int count = jsonPath.get("data.size()");

		for (int i = 0; i < count; i++) {

			String empName = jsonPath.get("data[" + i + "].employee_name");
			System.out.println(i + 1 + " : " + empName);
			
		

		}
		given().log().all();
		
		

	}
	

}
