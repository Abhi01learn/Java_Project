package com.Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		// Working with static dropdown
		WebElement element = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));

		element.click();
		Select select = new Select(element);
		select.selectByIndex(3);
		System.out.println(select.getFirstSelectedOption().getText());

		select.selectByValue("INR");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());

		// Working with static dropdown - with click option

		driver.findElement(By.xpath("//*[@id='flightSearchContainer']/div[6]")).click();
		Thread.sleep(2000);

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(2000);

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}

		Thread.sleep(2000);

		for (int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// working with dynamic dropdown

		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Bengaluru (BLR)')]")).click();

		// selecting the the second drop down
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//*[@id='dropdownGroup1']/div/ul[4]/li[5]/a)[2]")).click();

		driver.findElement(By.xpath(
				"//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//*[@id='dropdownGroup1']/div/ul[4]/li[5]/a"))
				.click();

		// Auto suggestive dropdowns

		driver.findElement(By.xpath("//*[@id='autosuggest']")).sendKeys("Ind");

		Thread.sleep(2000);
		List<WebElement> optionsElements = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		Thread.sleep(2000);
		for (WebElement option : optionsElements) {

			System.out.println(option.getText() + "++++");
			System.out.println("Test");
			if (option.getText().equalsIgnoreCase("India")) {
				System.out.println("*********************");
				option.click();
				break;
			}

		}

		/*
		 * // checkbox
		 * 
		 * 
		 * driver.findElement(By.cssSelector("*[id*='friendsandfamily']")).click();
		 * 
		 * List<WebElement> optionsElements2 =
		 * driver.findElements(By.cssSelector("*[id*='ctl00_mainContent']"));
		 * 
		 * 
		 * for (WebElement webElement : optionsElements2) {
		 * 
		 * System.out.println(webElement.getText()); webElement.click();
		 * 
		 * }
		 */
		  
		  
		  //Mouse hover-over
		  
		  Actions actions = new Actions(driver);
		  
		  actions.moveToElement(driver.findElement(By.cssSelector("a.spiceFare"))).build().perform();
		  
		 

		/*
		 * //clicking on the search
		 * 
		 * Thread.sleep(2000);
		 * 
		 * driver.findElement(By.xpath("//*[@id='ctl00_mainContent_btn_FindFlights']")).
		 * click(); System.out.println("Clicked**");
		 */

		Thread.sleep(1000);

		driver.quit();

	}
}
