package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import factory.DriverFactory;

public class TransferFundsPage {
	
	WebDriver driver;

    // Constructor
    public TransferFundsPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    // ================= LOCATORS =================

    @FindBy(xpath = "//div[@id='leftPanel']//a[text()='Transfer Funds']")
    WebElement transferFundsLink;

    @FindBy(id="amount")
    WebElement am;

    @FindBy(id="fromAccountId")
    WebElement fromAccount;

    @FindBy(id="toAccountId")
    WebElement toAccount;

    @FindBy(xpath = "//input[@value='Transfer']")
    WebElement transferBtn;

    @FindBy(xpath="//h1[contains(text(),'Transfer Complete')]")
    WebElement successMsg;

    @FindBy(xpath= "//a[text()='Log Out']")
    WebElement logoutLink;

    // ================= ACTION METHODS =================

    // Navigate to Transfer Funds page
    public void openTransferFundsPage() throws InterruptedException {
      //Thread.sleep(3000);
        transferFundsLink.click();
        Thread.sleep(3000);
        System.out.println("After click URL: " + factory.DriverFactory.getDriver().getCurrentUrl());
    }

    // Enter amount
    public void enterAmount(String amounts) throws InterruptedException {
    	  Thread.sleep(3000);
        am.sendKeys(amounts);
        //Thread.sleep(3000);
    }

    // Select FROM account
    public void selectFromAccount(String account) {
        
        Select select = new Select(fromAccount);
        select.selectByVisibleText(account);
    }

    // Select TO account
    public void selectToAccount(String account) {
     
        Select select = new Select(toAccount);
        select.selectByVisibleText(account);
    }

    // Click Transfer
    public void clickTransfer() {
       
        transferBtn.click();
    }

    // Validate success message
    public boolean isTransferSuccessful() {
    	//System.out.println("Page Source:\n" + driver.getPageSource());
        return successMsg.isDisplayed();
    }


}
