package testCase;

import java.util.logging.Logger;

import org.testng.annotations.Test;

import pageObjects.HomePage;

public class HomePageTest extends TestBase {
	
	public static Logger log = Logger.getLogger(TestBase.class.getName());
	
	@Test
	public void purchasemobile() throws InterruptedException
	{
		HomePage mb = new HomePage(TestBase.driver);
		Thread.sleep(20000);
		mb.AddButton().click();
		mb.cart().click();
		mb.Checkout().click();
		mb.country().sendKeys("pune");
		Thread.sleep(5000);
		mb.checkbox().click();
		mb.purchase().click();
		log.info("Order Placed Successfully");
	}

}
