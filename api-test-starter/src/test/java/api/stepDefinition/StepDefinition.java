// This file is used for step defination so user can define steps here
package api.stepDefinition;
import api.utils.ApiPayload;
import api.utils.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;

import static org.junit.Assert.assertNotNull;



public class StepDefinition {
    Response response;



    @Given("I generate payload details from the backend")
    public void i_generate_payload_details_from_the_backend() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello");
        throw new io.cucumber.java.PendingException();
    }

    @When("I request to create an user at testproject on {string}")
    public void i_request_to_create_an_user_at_testproject_on(String url) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Url "+url);
        throw new io.cucumber.java.PendingException();
    }

    @Then("I receive a successful response")
    public void i_receive_a_successful_response() {
        // Write code here that turns the phrase above into concrete actions
        assertNotNull(response.body());
        System.out.println("Here you can write the validation");
        throw new io.cucumber.java.PendingException();
    }

    @Then("the response status code is {int}")
    public void the_response_status_code_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should get success message {string} in the response")
    public void i_should_get_success_message_in_the_response(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have the User details used for User creation")
    public void i_have_the_user_details_used_for_user_creation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I request to get the account details from testproject on {string}")
    public void i_request_to_get_the_account_details_from_testproject_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("I validate the response details with the following account fields")
    public void i_validate_the_response_details_with_the_following_account_fields(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
}