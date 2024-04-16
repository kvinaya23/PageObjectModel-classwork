package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
	//we created a constructor to hold the driver we transferred from login test class through page factory	
		
		this.driver =driver;
		//by using this keyword we r establishing the connection between the driver of test page n login page
	}
	
	WebDriver driver;
	
	//WebElements
	
	@FindBy (how =How.XPATH ,using ="//*[@id=\"user_name\"]")WebElement USER_NAME_ELEMENT;
	@FindBy(how =How.XPATH ,using ="//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.XPATH,using ="//*[@id=\"login_submit\"]")WebElement SIGN_IN_ELEMENT;
	
	//Related actions
	
	public void insertUserName (String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickOnSignInButton() {
		
		SIGN_IN_ELEMENT.click();
	}
	
	public void combineMethod(String userName ,String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGN_IN_ELEMENT.click();
	}

}
