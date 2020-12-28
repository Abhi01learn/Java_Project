import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\omabh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.google.com/");
		driver.manage().window().maximize();

		// navigating to a site
		driver.navigate().to(
				"https://www.amazon.com/ap/signin?accountStatusPolicy=P1&clientContext=259-5245976-5433422&language=en_US&openid.assoc_handle=amzn_prime_video_desktop_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_encoding%3DUTF8%26location%3D%252Fref%253Ddv_auth_ret");

		// Entering credentials - username
		driver.findElement(By.xpath("//*[@id='ap_email']")).click();
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("om.abhishekpandey@gmail.com");

		// password
		driver.findElement(By.xpath("//*[@id=\'ap_password']")).click();
		driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("abhishekpandey");

		// clicking login button
		driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();

		// Clicking on TV Shows
		driver.findElement(By.id("pv-nav-tv-shows")).click();

		// Entering search box
		driver.findElement(By.className("pv-nav-search-query")).sendKeys("Mirzapur");
		driver.findElement(By.className("pv-nav-search-query")).click();

		// Select from the dropdown
		Select select = new Select(driver.findElement(By.className("pv-nav-search-suggestion-item")));
		// ("//*[@id=\'pv-nav\']/div/div/div[2]/div/ol/li[1]/ol/ol/li[1]/a")));
		select.selectByValue("mirzapur all episode");
		select.selectByIndex(0);

		// *[@id="pv-nav"]/div/div/div[2]/div/ol/li[1]/ol/ol/li[1]/a

	}

}
