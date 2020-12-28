import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Invoking Alert
		driver.findElement(By.id("alertbtn")).click();		
		System.out.println("Alert Text: "+driver.switchTo().alert().getText());		
		driver.switchTo().alert().accept();
		
		//Entering text and invoking alert
		driver.findElement(By.id("name")).sendKeys("Abhishek");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println("Alert Text: "+driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();	
	}
	
	

}
