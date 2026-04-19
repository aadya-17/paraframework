package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RequestLoan;

public class RequestLoanstepdefinition {
	
	RequestLoan rl = new RequestLoan();
	
	@When("user navigates to  Request loan page")
	public void user_navigates_to_request_loan_page() throws InterruptedException {
		
		rl.clickonrequestLoan();
		Thread.sleep(3000);
	    
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String loan, String down) {
	    rl.enterpayments(loan, down);
	    //rl.selectaccount(down);
	}

	@When("click on Apply now")
	public void click_on_apply_now() {
	    rl.clickonapply();
	}

	@Then("loan request should be processed succesfully")
	public void loan_request_should_be_processed_succesfully() {
	    rl.isLoanProcessed();



}
}
