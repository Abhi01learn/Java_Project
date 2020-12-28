import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//Selecting first drop down
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")));
		element1.click();
		
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a")).click();
		
		//Selecting second drop down
		
		WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")));
		//  
		element.click();
		
		driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[8]/a")).click();
		//WebElement element2 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[5]/a")));
		//element2.click();
		
		//driver.close();

	}

}
