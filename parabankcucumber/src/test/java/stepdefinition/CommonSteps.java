package stepdefinition;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class CommonSteps {
	
	LoginPage lp = new LoginPage();

    @Given("user is logged into Parabank application")
    public void user_is_logged_into_parabank_application() {

        lp.openApplication();
      lp.enterDetails("sample123", "sample123");
      lp.loginButton();

        System.out.println("User logged in successfully");
    }

}
