package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import factory.DriverFactory;

public class RequestLoan {
	
	WebDriver driver;
	//constructor
	
	public RequestLoan() {
		
		this.driver= DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy methods
	
	@FindBy(xpath="//a[normalize-space()='Request Loan']")
	WebElement requestbutton;
	
	@FindBy(xpath="//input[@id='amount']")
	WebElement loanamount;
	
	@FindBy(id="downPayment")
	WebElement downamount;
	
	@FindBy(id="fromAccountId")
	WebElement fromaccount;
	
	@FindBy(xpath="//input[@value='Apply Now']")
	WebElement applybutton;
	
	@FindBy(xpath="//h1[normalize-space()='Loan Request Processed']")
	WebElement resultmessage;
	
	//Action methods
	
	public void clickonrequestLoan() {
		
		requestbutton.click();
	}
	
	public void enterpayments(String loan, String down) {
		
		loanamount.sendKeys(loan);
		downamount.sendKeys(down);
	}
	
	public void selectaccount(String acc) {
		
		Select sel = new Select(fromaccount);
		sel.selectByVisibleText(acc);
	}
	
	public void clickonapply() {
		applybutton.click();
		
	}
	public boolean isLoanProcessed() {

        return resultmessage.isDisplayed();
	
	}
}
