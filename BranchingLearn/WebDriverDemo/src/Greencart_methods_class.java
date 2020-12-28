import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Greencart_methods_class {

	public void Greencart_LaunchSite(WebDriver driver) {

		// Moving to Green Cart
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Applying implicit wait()
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Implicitly Waiting for 5 sec...");

	}

	public void Greencart_GetAvailableItems(WebDriver driver) {

		// Moving to Green Cart
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Applying implicit wait()
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Implicitly Waiting for 5 sec...");

		List<WebElement> element = driver.findElements(By.className("product-name"));

		System.out.println(element.size());
		for (int i = 0; i < element.size(); i++) {

			String productName = element.get(i).getText().toString();
			System.out.println(productName);
		}

	}

	public void Greencart_AddItems(WebDriver driver, String[] bookitemStrings) {

		// Moving to Green Cart
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Applying implicit wait()
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Implicitly Waiting for 5 sec...");

		int productCount = 0;

		List<WebElement> element = driver.findElements(By.className("product-name"));

		for (int i = 0; i < element.size(); i++) {
			String[] name = element.get(i).getText().split("-");
			String vegName = name[0].trim();

			productCount++;
			System.out.println(i);

			List<String> requiredItems = Arrays.asList(bookitemStrings);
			if (requiredItems.contains(vegName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Adding Items
				driver.findElements(By.className("increment")).get(i).click();

				if (productCount > requiredItems.size()) {
					break;
				}

			}

		}

	}

}
