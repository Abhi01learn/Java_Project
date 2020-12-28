import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Selecting the check-box		
		WebElement element = driver.findElement(By.id("checkBoxOption1"));
		element.click();
		
		//Asserting if check-box is checked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//De-selecting the check-box		
		WebElement element1 = driver.findElement(By.id("checkBoxOption1"));
		element1.click();
		
		//Asserting if check-box is checked
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		//Printing the no of check-box
		
	System.out.println("***"+driver.findElement(By.id("checkbox-example")).getSize());
	System.out.println("+++++"+driver.findElements(By.cssSelector("input[value='checkbox']")).size());
		//checkbox-example
		

	}

}
