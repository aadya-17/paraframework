package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginstepdefinition {
	
	LoginPage lp = new LoginPage();
	
	@Given("User launch the application")
	public void user_launch_the_application() {
	    lp.openApplication();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    lp.enterDetails("sample123", "sample123");
	}

	@When("click on login button")
	public void click_on_login_button() {
	    lp.loginButton();
	}

	@Then("user is in Parabank homepage")
	public void user_is_in_parabank_homepage() {
	   // System.out.println("Passed");
	}

}