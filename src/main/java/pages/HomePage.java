package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//In every page class we should have :
	
		//1. Constructor
		//2. Locators
		//3. Methods that will interact with locators
	
	//WebElement SignIN=driver.findElement(By.id("hahjs"));
	
	
	/* we need to copy line 24 to 30 in every page class 
	 * But we would need to change the constructor Name*/
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); // this line initializes all the elements (locators & methods)
	}
	
	//Locators
	@FindBy(id = "nav-link-accountList")
	public WebElement signIN;
	
	@FindBy(id="nav-hamburger-menu")
	public WebElement hamburgerMenuIcon;
	
	
	//Methods
	public void initialLaunchVerification()
	{
		System.out.println(signIN.isDisplayed());
	}
	
	public void clickMenuIcon()
	{
		hamburgerMenuIcon.click();
	}
	
	
	
	
}
