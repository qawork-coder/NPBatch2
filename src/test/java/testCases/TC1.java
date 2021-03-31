package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseSetup;
import pages.HomePage;
import pages.MenuPage;

public class TC1 extends BaseSetup {
	
	//This class will contain :
		//1. Driver variable
		//2. Declare Page Object
		//3. Initialize page page objects
		//4. Calling the getDriver() from BaseClass
		//5. TC
	
	
	//The driver variable & Page objects could be used again , but just change your clasName
	WebDriver driver;
	HomePage homeObj=null; //declared the objects
	MenuPage menuObj=null;
	
	//Use this method as it is , just change your corresponding className & Object name
	@BeforeClass
	public void initialSetup()
	{
		driver=getDriver(); //assigning the values of getDriver method to local driver variable
		homeObj=new HomePage(driver); //initialize the objects
		menuObj=new MenuPage(driver); //initialize the objects
	}
	
	
	//HomePage homeObj=new HomePage();
	//MenuPage homeObj=new HomePage();
	
	
	//Create your test case as per your project
	@Test
	public void scenario()
	{
		homeObj.initialLaunchVerification();
		homeObj.clickMenuIcon();
		menuObj.clickElectornics();
	}
	


}
