package testCase;


import java.util.logging.Logger;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginPageTest extends TestBase{
	
	public static Logger log = Logger.getLogger(TestBase.class.getName());

	@Test(priority = 1)
	public void login() throws InterruptedException
	{
		 
		LoginPage rs = new LoginPage(TestBase.driver);
		rs.Username().sendKeys("rahulshettyacademy");
		rs.Password().sendKeys("learning");
		rs.Admin().click();
		rs.Terms().click();
		rs.signIn().click();
		System.out.println(rs.termsText().getText());
		log.info("Sign In Successfull");
		
	}
	
}
