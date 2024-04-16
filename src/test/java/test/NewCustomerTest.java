package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.NewCustomerPage;
import page.dashBoardPage;
import util.BrowserFactory;

public class NewCustomerTest {
	

	String username ="demo@codefios.com";
	String password = "abc123";
	String dashBoardValText ="dashboard";
	String newCustomerValText ="New Customer";
	
	
	WebDriver driver;
	
	public void userShouldBeAbleToAddNewCustomer() {
		
	 driver =BrowserFactory.init();
	
	LoginPage loginPage =PageFactory.initElements(driver, LoginPage.class);
	loginPage.combineMethod(username, password);
	
	dashBoardPage dashboardpage = PageFactory.initElements(driver, dashBoardPage.class);
	dashboardpage.validateDashboardPage(dashBoardValText);
	dashboardpage.customerMenu();
	dashboardpage.addCustomer();
	
	NewCustomerPage customerPage = PageFactory.initElements(driver, NewCustomerPage.class);
	customerPage.validateNewCustomer(newCustomerValText);
	
	
	}

}
