package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dashBoardPage {
	
	WebDriver driver;
	
	public dashBoardPage(WebDriver driver) {
		this.driver =driver;
	}
	
	//WebElements
	
	@FindBy(how =How.XPATH,using ="//strong[contains (text(), 'Dashboard')]") WebElement DASHBOARD_VALIDATION_ELEMENT;
	@FindBy(how =How.XPATH,using ="//span[contains (text(), 'Customers')]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how =How.XPATH,using ="//span[contains (text(), 'Customers')]") WebElement ADD_CUSTOMER_ELEMENT;

	public void validateDashboardPage(String dashBoardValText) {
		
		
	}
	
	public void customerMenu() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void addCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}

}
