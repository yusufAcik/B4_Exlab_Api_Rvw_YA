package api.exlab.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Experience_stepDefs {

    @When("The user creates a POST request for add a new experience with {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void the_user_creates_a_POST_request_for_add_a_new_experience_with_and_and_and_and_and_and(String job,String company,String location,String fromdate,String todate,String current,String description) {

    }

    @Then("The user is on the Dashboard page")
    public void the_user_is_on_the_Dashboard_page() {

    }

    @Then("The user verifies that UI and API experiences must be match job is {string}")
    public void the_user_verifies_that_UI_and_API_experiences_must_be_match_job_is(String string) {

    }
}
