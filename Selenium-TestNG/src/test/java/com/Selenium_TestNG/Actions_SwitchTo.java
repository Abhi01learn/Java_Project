package com.Selenium_TestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		 * // driver.findElement(By.linkText("Free Access to //
		 * InterviewQues/ResumeAssistance/Material")).click();
		 * 
		 * // 1. Getting the count of link present on a page
		 * 
		 * System.out.println(driver.findElements(By.tagName("a")).size());
		 * 
		 * // 2. Getting the count of link present on the footers. (This concept is
		 * based // on limiting scoping on the WebElement)
		 * 
		 * WebElement subElement = driver.findElement(By.id("gf-BIG"));
		 * 
		 * System.out.println(subElement.findElements(By.tagName("a")).size());
		 * 
		 * Thread.sleep(2000); WebElement subElement1 =
		 * driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]"));
		 * 
		 * System.out.println(subElement1.findElements(By.tagName("a")).size()); Actions
		 * actions = new Actions(driver);
		 * 
		 * List<WebElement> elements = subElement1.findElements(By.tagName("a"));
		 * 
		 * for (WebElement webElement : elements) {
		 * System.out.println(webElement.getText()); System.out.println("**********");
		 * Thread.sleep(2000); String clicktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		 * webElement.sendKeys(clicktab);
		 * 
		 * } Set<String> window = driver.getWindowHandles();
		 * 
		 * Iterator<String> iterator = window.iterator(); while (iterator.hasNext()) {
		 * Thread.sleep(2000); String tabs = iterator.next(); WebDriver webdriver =
		 * driver.switchTo().window(tabs); System.out.println(webdriver.getTitle());
		 * 
		 * }
		 * 
		 * driver.quit();
		 */
		
		// Drag and Drop
		
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://jqueryui.com/droppable/");
		webDriver.manage().window().maximize();
		
		// Switching to the frame		
		
		Thread.sleep(2000);
		webDriver.switchTo().frame(webDriver.findElement(By.className("demo-frame")));
		Actions  actions= new Actions(webDriver);
		
		WebElement source = webDriver.findElement(By.id("draggable"));
		WebElement target = webDriver.findElement(By.id("droppable"));
		
		actions.dragAndDrop(source, target).build().perform();
		
		
		

	}

}
