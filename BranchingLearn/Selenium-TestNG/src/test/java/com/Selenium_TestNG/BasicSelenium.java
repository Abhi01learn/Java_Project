package com.Selenium_TestNG;

import java.awt.KeyboardFocusManager;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardEndHandler;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardHomeHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicSelenium {

	WebDriver driver;

	@BeforeSuite

	public void beforeSuite() {
		System.out.println("Selenium Script loading...");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println();
		System.out.println("Launching Test...");

	}

	@BeforeMethod

	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();

	}

	@Test (priority = 0 , groups = {"TEST1"})
	public void testMethod1() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Abhishek Pandey");
	
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
		System.out.println("******TEST TEST TEST***********");
		driver.wait(10000);

		
	}
	
	@Test (priority = 1 , groups = {"TEST2"})
	public void testMethod2() {
		System.out.println("TEST1");
	}
	
	@Test (priority = 2 , groups = {"TEST3"})
	public void testMethod3() {
		System.out.println("TEST2");
	}
	
	
	
	@AfterMethod
	
	public void afterMethod() throws InterruptedException {
	
		driver.quit();
		
	}
	
	

}
