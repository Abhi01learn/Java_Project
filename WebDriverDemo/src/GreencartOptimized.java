import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreencartOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Creating driver object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// **********************************************************************************************************************

		// Creating the object of Greencart_methods_class
		Greencart_methods_class gClass = new Greencart_methods_class();

		// Launching site
		 gClass.Greencart_LaunchSite(driver);

		// Getting the Product name
		 gClass.Greencart_GetAvailableItems(driver);

		// ***********************************************************************************************************************
		String[] bookitemStrings = { "Cucumber", "Brocolli", "Beetroot", "Walnuts" };
		System.out.println(bookitemStrings[3]);
		gClass.Greencart_AddItems(driver, bookitemStrings);

	}

}
