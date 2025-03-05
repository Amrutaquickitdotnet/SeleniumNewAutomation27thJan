package com.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FacebookSignupSteps {

	    WebDriver driver;

	    @Given("I am on the Facebook signup page")
	    public void i_am_on_the_facebook_signup_page() {
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/signup");
	    }

	    @Given("I enter the following details for multiple users:")
	    public void i_enter_the_following_details_for_multiple_users(io.cucumber.datatable.DataTable dataTable) {
	        // Convert DataTable to a List of Maps (each map represents a row)
	        List<Map<String, String>> userDataList = dataTable.asMaps(String.class, String.class);

	        // Loop through each row of data (each test case)
	        for (Map<String, String> userData : userDataList) {
	            // Create an instance of WebDriverWait with Duration
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	            // Re-locate elements before interacting with them to avoid StaleElementReferenceException
	            WebElement firstNameField = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
	            firstNameField.clear(); // Clear previous value
	            firstNameField.sendKeys(userData.get("firstName"));

	            WebElement lastNameField = wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
	            lastNameField.clear(); // Clear previous value
	            lastNameField.sendKeys(userData.get("lastName"));

	            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_email__")));
	            emailField.clear(); // Clear previous value
	            emailField.sendKeys(userData.get("email"));

	            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.name("reg_passwd__")));
	            passwordField.clear(); // Clear previous value
	            passwordField.sendKeys(userData.get("password"));

	            String gender = userData.get("gender");
	            if (gender.equalsIgnoreCase("Male")) {
	                WebElement maleGenderOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='2']")));
	                maleGenderOption.click();
	            } else if (gender.equalsIgnoreCase("Female")) {
	                WebElement femaleGenderOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='1']")));
	                femaleGenderOption.click();
	            }

	            WebElement dayField = wait.until(ExpectedConditions.elementToBeClickable(By.name("birthday_day")));
	            dayField.clear(); // Clear previous value
	            dayField.sendKeys(userData.get("day"));

	            WebElement monthField = wait.until(ExpectedConditions.elementToBeClickable(By.name("birthday_month")));
	            monthField.clear(); // Clear previous value
	            monthField.sendKeys(userData.get("month"));

	            WebElement yearField = wait.until(ExpectedConditions.elementToBeClickable(By.name("birthday_year")));
	            yearField.clear(); // Clear previous value
	            yearField.sendKeys(userData.get("year"));

	            // Always re-locate the Sign Up button before clicking
	            WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
	            signUpButton.click();

	            // Optionally, wait for some condition to be met, e.g., page load, before starting the next iteration.
	            // WebDriverWait waitForRedirect = new WebDriverWait(driver, Duration.ofSeconds(10));
	            // waitForRedirect.until(ExpectedConditions.urlContains("signup"));
	        }
	    }

	    @When("I click the Sign Up button")
	    public void i_click_the_sign_up_button() {
	        // This step is redundant in this case as we're clicking the button inside the loop already
	    }

	    @Then("I should be redirected to the welcome page")
	    public void i_should_be_redirected_to_the_welcome_page() {
	        // Wait until the URL contains the "welcome" keyword
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.urlContains("welcome"));
	        
	        // Assert that we have been redirected to the welcome page
	        Assert.assertTrue(driver.getCurrentUrl().contains("welcome"));
	    }

	    @Then("I should see the error message {string}")
	    public void i_should_see_the_error_message(String errorMessage) {
	        // Re-locate the error message element before checking its visibility
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), '" + errorMessage + "')]")));
	        
	        // Assert that the error message is displayed
	        Assert.assertTrue(errorElement.isDisplayed());
	    }
	}

