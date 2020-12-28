import java.awt.event.ItemEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpathCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Vegetable booking site
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		// Printing the title on the console
		System.out.println(driver.getTitle());

		// Adding items in the cart
		for (int i = 0; i <= 5; i++) {
			driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div[2]/div[2]/a[2]")).click();
		}

		// Add item
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[2]/div[3]/button")).click();

		// Adding 10items in the cart
		for (int i = 0; i <= 8; i++) {
			driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[3]/div[2]/a[2]")).click();
		}

		// Add item
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[3]/div[3]/button")).click();

		// Adding 12 items in the cart
		for (int i = 0; i <= 10; i++) {
			driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[23]/div[2]/a[2]")).click();
		}

		// Add item
		driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[23]/div[3]/button")).click();

		// Navigating to the cart
		driver.findElement(By.xpath("//*[@id='root']/div/header/div/div[3]/a[4]")).click();

		// Navigating to the cart
		driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		System.out.println("++******TEST******++");

		// Placing the order
		WebDriverWait wait = new WebDriverWait(driver, 50);

		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='root']/div/div/div/div/button")));
		element.click();
		// System.out.println("TEST");

		Thread.sleep(15000);

		// Handling the dropdown
		Select select = new Select(driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/select")));
		select.selectByVisibleText("India");

		// Clicking on the linkText
		driver.findElement(By.linkText("Terms & Conditions")).click();

		// Thread.sleep(3000);
		// driver.navigate().back();

		// Handling Check box
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='chkAgree']"));
		// WebElement checkbox =
		// driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/input"));
		checkbox.click();

		if (checkbox.isSelected()) {
			System.out.println("Check Box Selected!!");
		}

		// Clicking on the proceed button
		WebElement proceedElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Proceed')]")));
		proceedElement.click();

		System.out.println("Order is placed");

		// driver.close();
	}

}
