package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseSetup {
	
	//Use this class as it is.. Just change the URL for your project 
	//Change the Location for your browser
	
	@Test
	public WebDriver getDriver()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/NobleProg/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		return driver;
	}

}
