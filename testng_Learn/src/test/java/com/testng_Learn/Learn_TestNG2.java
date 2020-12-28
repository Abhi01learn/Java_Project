package com.testng_Learn;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Learn_TestNG2 {

	@Parameters({ "URL", "Name", "task" })

	@Test

	public void testCase1(String URL, String Name, String task) {
		System.out.println("URL ::" + URL);
		System.out.println("Name ::" + Name);
		System.out.println("task  ::" + task);
	}

	@Parameters({ "URL", "Name", "task" })
	@Test(groups = {"Regression"})

	public void testCase2(String URL) {
		System.out.println("URL" + URL);

	}

	@Test(groups = {"Smoke"})

	public void testCase3(String Name) {

		System.out.println("Name" + Name);

	}

	@Test

	public void testCase4(String task) {

		System.out.println("task" + task);
	}

}
