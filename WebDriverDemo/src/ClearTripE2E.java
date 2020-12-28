import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Creating the Driver object and launching the Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launching the SpiceJet Website
		driver.get("https://www.cleartrip.com/");

		// Selecting the Dymamic dop-down fromTag
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FromTag']")));
		element.click();
		element.sendKeys("MUM");
		Thread.sleep(5000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);

		// Selecting the Dymamic dop-down ToTag
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("ToTag")));
		element1.click();
		element1.sendKeys("Lon");

		Thread.sleep(5000);

		// Selecting after 4 selection 'London City'
		int iterater = 0;

		while (iterater < 5) {
			element1.sendKeys(Keys.ARROW_DOWN);
			iterater++;
			System.out.println(iterater);
		}
		element1.sendKeys(Keys.ENTER);

		// Selecting the current
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"))
				.click();

		// Selecting from the static drop down
		Select select = new Select(driver.findElement(By.id("Adults")));
		select.selectByVisibleText("9");

		// Clicking o the button
		driver.findElement(By.id("SearchBtn")).click();
	}
}
