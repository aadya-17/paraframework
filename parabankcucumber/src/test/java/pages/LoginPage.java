package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class LoginPage {
	
	
	private WebDriver driver;
	
	//constructor
	
	public LoginPage() {
		
		this.driver=DriverFactory.getDriver(); ;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators using @FindBy
	
	@FindBy(name="username")
	WebElement name;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement Button;
	
	//Actions
	public void openApplication() {
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}
	
	public void enterDetails(String username, String Password) {
		
		name.sendKeys(username);
		pass.sendKeys(Password);
	}
	
	public void loginButton() {
		
		Button.click();
	}

}
