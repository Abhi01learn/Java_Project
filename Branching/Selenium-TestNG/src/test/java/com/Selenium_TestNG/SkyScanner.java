package com.Selenium_TestNG;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SkyScanner {

	WebDriver driver;

	@BeforeSuite

	public void loadChrome() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch the skyscanner site
		driver.navigate().to("https://www.spicejet.com/");
	}

	@Test
	public void fill_From_To() throws InterruptedException {
		
		//FROM
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Kolkata (CCU)')]")).click();
		Thread.sleep(2000);
		/*
		 * List<WebElement> option = driver.findElements(By.cssSelector(
		 * "[class*='BpkAutosuggest_bpk-autosuggest']"));
		 * 
		 * for (WebElement element : option) {
		 * 
		 * if (element.getText().equalsIgnoreCase("Barcelona (BCN)")) { element.click();
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * //To
		 * driver.findElement(By.cssSelector("[name='fsc-destination-search']")).clear()
		 * ; Thread.sleep(2000);
		 * driver.findElement(By.cssSelector("[name='fsc-destination-search']")).
		 * sendKeys("ccu");
		 * 
		 * List<WebElement> option2 =
		 * driver.findElements(By.cssSelector("[class*='1q0sD']"));
		 * 
		 * for (WebElement element : option2) {
		 * 
		 * if (element.getText().equalsIgnoreCase("Kolkata (")) { element.click();
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * @Test public void class_Traveller() throws InterruptedException {
		 * 
		 * Thread.sleep(2000);
		 * driver.findElement(By.cssSelector("[class*='CabinClassTravellersSelector']"))
		 * .click();
		 * 
		 * Thread.sleep(2000); Select select = new
		 * Select(driver.findElement(By.cssSelector(
		 * "[class*='BpkSelect_bpk-select__1e3Uj']")));
		 * 
		 * List<WebElement> selectOptions = select.getOptions();
		 * 
		 * for (WebElement webElement : selectOptions) {
		 * 
		 * System.out.println(webElement.getText());
		 * 
		 * }
		 */
		
	}

}
