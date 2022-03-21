package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityTest {

	@Given("user is in home page of the application")
	public void user_is_in_home_page_of_the_application() {
	    System.out.println("Testing");
	}

	@When("enters valid username")
	public void enters_valid_username() {
		System.out.println("Testing");
	}

	@And("enters valid password")
	public void enters_valid_password() {
		System.out.println("Testing");
	}

	@And("clicks submit button")
	public void clicks_submit_button() {
		System.out.println("Testing");
	}

	@Then("user will be logged in")
	public void user_will_be_logged_in() {
		System.out.println("Testing");
	}

	@And("will be able to see login success message")
	public void will_be_able_to_see_login_success_message() {
		System.out.println("Testing");
	}
}
