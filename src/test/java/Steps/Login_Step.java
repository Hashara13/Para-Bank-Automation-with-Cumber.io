package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step {
    @Given("user is logged on page")
    public void user_is_logged_on_page() {
        System.out.println("user is logged on page");
    }

    @When("user enter username, password")
    public void user_enter_username_password() {
        System.out.println("user enter username, password");
    }

    @And("Click login button")
    public void click_login_button() {
        System.out.println("Click login button");
    }

    @Then("user navigated to home page")
    public void user_navigated_to_home_page() {
        System.out.println("user navigated to home page");
    }
}
