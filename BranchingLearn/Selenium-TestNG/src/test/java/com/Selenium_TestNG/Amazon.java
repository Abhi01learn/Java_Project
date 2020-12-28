package com.Selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement element = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		element.click();
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		

	}

}
