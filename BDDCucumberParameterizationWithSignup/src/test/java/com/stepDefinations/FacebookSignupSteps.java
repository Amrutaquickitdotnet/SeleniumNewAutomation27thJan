package com.stepDefinations;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class FacebookSignupSteps {
    WebDriver driver;

    @Given("I am on the Facebook signup page")
    public void i_am_on_the_facebook_signup_page() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
    }

    @Given("I enter {string} as the first name")
    public void i_enter_as_the_first_name(String firstName) {
        driver.findElement(By.name("firstname")).sendKeys(firstName);
    }

    @Given("I enter {string} as the last name")
    public void i_enter_as_the_last_name(String lastName) {
        driver.findElement(By.name("lastname")).sendKeys(lastName);
    }

    @Given("I enter {string} as the email address")
    public void i_enter_as_the_email_address(String email) {
        driver.findElement(By.name("reg_email__")).sendKeys(email);
    }

    @Given("I enter {string} as the password")
    public void i_enter_as_the_password(String password) {
        driver.findElement(By.name("reg_passwd__")).sendKeys(password);
    }

    @Given("I select {string} as the gender")
    public void i_select_as_the_gender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(By.xpath("//input[@value='2']")).click();
        } else if (gender.equalsIgnoreCase("Female")) {
            driver.findElement(By.xpath("//input[@value='1']")).click();
        }
    }

    @Given("I select {string}, {string}, {string} as the date of birth")
    public void i_select_as_the_date_of_birth(String day, String month, String year) {
        driver.findElement(By.name("birthday_day")).sendKeys(day);
        driver.findElement(By.name("birthday_month")).sendKeys(month);
        driver.findElement(By.name("birthday_year")).sendKeys(year);
    }

    @When("I click the Sign Up button")
    public void i_click_the_sign_up_button() {
        driver.findElement(By.name("websubmit")).click();
    }

    @Then("I should be redirected to the welcome page")
    public void i_should_be_redirected_to_the_welcome_page() {
        Assert.assertTrue(driver.getCurrentUrl().contains("welcome"));
        driver.quit();
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String errorMessage) {
        WebElement errorElement = driver.findElement(By.xpath("//div[contains(text(), '" + errorMessage + "')]"));
        Assert.assertTrue(errorElement.isDisplayed());
        driver.quit();
    }
}
