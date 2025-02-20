package com.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupDefination {

	
	@Given("I am on the Facebook signup page")
	public void i_am_on_the_facebook_signup_page() {
	   
		
	}
	@Given("I enter {string} as the first name")
	public void i_enter_as_the_first_name(String string) {
	   
	}
	@Given("I enter {string} as the last name")
	public void i_enter_as_the_last_name(String string) {
	  
	}
	@Given("I enter {string} as the email address")
	public void i_enter_as_the_email_address(String string) {
	    
	}
	@Given("I enter {string} as the password")
	public void i_enter_as_the_password(String string) {
	  
	}
	@Given("I select {string} as the gender")
	public void i_select_as_the_gender(String gender) {
		
		
	  
	}
	@Given("I select {string}, {string}, {string} as the date of birth")
	public void i_select_as_the_date_of_birth(String day, String month, String year) {
	 
			  
	}
	
	@When("I click the Sign Up button")
	public void i_click_the_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
	@Then("I should be redirected to the welcome page")
	public void i_should_be_redirected_to_the_welcome_page() {
	 
	}



}
