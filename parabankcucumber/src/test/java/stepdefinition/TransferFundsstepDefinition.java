package stepdefinition;

import com.aventstack.extentreports.util.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TransferFundsPage;
//import org.junit.Assert;

public class TransferFundsstepDefinition {
	
	TransferFundsPage tf= new TransferFundsPage();
	LoginPage lp= new LoginPage();
	
	
	@When("user transfers {string} from {string} to {string}")
	public void user_transfers_from_to(String amounts, String fromAccount, String toAccount) throws InterruptedException {
	    tf.openTransferFundsPage();
	    System.out.println("Current URL: " + factory.DriverFactory.getDriver().getCurrentUrl());
	    tf.enterAmount(amounts);
	   // tf.selectFromAccount(fromAccount);
	   // tf.selectToAccount(toAccount);
	    tf.clickTransfer();
	}

	@Then("transfer should be successful")
	public void transfer_should_be_successful() {
	   tf.isTransferSuccessful();
	  // System.out.println(result);
	  // Assert.assertTrue("transfer failed!",result);
	}




}
