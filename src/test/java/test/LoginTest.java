package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.dashBoardPage;
import util.BrowserFactory;

public class LoginTest {
	
	String username ="demo@codefios.com";
	String password = "abc123";
	String dashBoardValText ="dashboard";
	
	WebDriver driver;
	@Test(priority =1)
	public void userShouldBeAbleToLogin() {
		
		BrowserFactory.init();
		
		LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
		//we need to create a constructor in login page class to hold the driver we r transferring through page factory class
		loginPage.insertUserName(username);
		loginPage.insertPassword(password);
		loginPage.clickOnSignInButton();
		
		dashBoardPage dashboardpage = PageFactory.initElements(driver, dashBoardPage.class);
		dashboardpage.validateDashboardPage(dashBoardValText);
		
		BrowserFactory.tearDown();
		
	}
	

}
