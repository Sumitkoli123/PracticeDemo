package testCase;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static Logger log = Logger.getLogger(TestBase.class.getName());
	public static WebDriver driver;
	
	
	
	@BeforeSuite
       
	public WebDriver base()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automtion tools\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		return driver;
		
	}
 
@AfterSuite
public void tearDown() {
	driver.quit();
   }
}
	

	

