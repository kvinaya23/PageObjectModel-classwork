package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
public static void init() {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\kulka\\Aug23_Selenium\\Session_3\\driver\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://codefios.com/ebilling/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}

public static void tearDown() {
	driver.close();
	driver.quit();
	
	
}
}
