package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	@Given("user is on login page")
	public void user_is_on_login_page() {
        System.out.println("user is on login page");
	}

	@When("user enters username and passowrd")
	public void user_enters_username_and_passowrd() {
	    System.out.println("user enters username and passowrd");
	}

	@And("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		System.out.println("user clicks on submit button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
	}
}
