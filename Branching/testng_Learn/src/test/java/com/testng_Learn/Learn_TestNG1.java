package com.testng_Learn;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learn_TestNG1 {
	
	@BeforeClass
	public void beforeClass() {

		System.out.println("before Class--------------");
	}
	
	
	@BeforeSuite
	public void beforeSuite() {

		System.out.println("before Suite++++++");
	}
	
	
	@BeforeTest

	
	public void beforeTest() {

		System.out.println("First Line");
	}
	
	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");
	}
	
	@Test
	
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test
	
	public void testCase2() {
		
		System.out.println("Test Case 2");
	}
	@Test
	
	public void testCase3() {

		System.out.println("Test Case 3");
		
		
	}
	
	@AfterMethod
	public void afterMethod() {

		System.out.println("after Method");
	}
	
	@Test
	
	public void testCase4() {

		System.out.println("Test Case 4");
	}

	
	@AfterTest
	
	public void afterTest() {
		
		System.out.println("last line");
	}
}
