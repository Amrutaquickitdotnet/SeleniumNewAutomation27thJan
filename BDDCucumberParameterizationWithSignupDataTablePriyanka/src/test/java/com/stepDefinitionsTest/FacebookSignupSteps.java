package com.stepDefinitionsTest;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookSignupSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("I am on the Facebook signup page")
    public void i_am_on_the_facebook_signup_page() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/r.php?entry_point=login");
    }

    @When("I enter the below signup information  and click on signup button")
    public void i_enter_the_below_signup_information_and_click_on_signup_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> userData : dataList) {
            // Input fields
            enterText(By.name("firstname"), userData.get("firstName"));
            enterText(By.name("lastname"), userData.get("lastName"));
            enterText(By.name("reg_email__"), userData.get("email"));
            enterText(By.name("reg_passwd__"), userData.get("password"));

            // Select Gender
            selectGender(userData.get("gender"));

            // Select Date of Birth
            selectDropdown(By.name("birthday_day"), userData.get("dobDay"));
            selectDropdown(By.name("birthday_month"), userData.get("dobMonth"));
            selectDropdown(By.name("birthday_year"), userData.get("dobYear"));
            
            //Select gender
            
            

            // Click on Sign Up button
            wait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit"))).click();
        }
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String expectedErrorMessage) {
        try {
            WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//*[contains(text(),'" + expectedErrorMessage + "')]")
            ));

            // Verify error message is displayed
            Assert.assertTrue("Error message not displayed!", errorElement.isDisplayed());

            // Compare expected & actual message (ignoring case & extra spaces)
            String actualText = errorElement.getText().trim();
            Assert.assertTrue("Error message does not match!", actualText.contains(expectedErrorMessage.trim()));

            System.out.println("Verified error message: " + actualText);
        } catch (Exception e) {
            System.out.println("Error message not found: " + expectedErrorMessage);
            Assert.fail("Expected error message not displayed: " + expectedErrorMessage);
        } finally {
           
            driver.quit();
        }
    }

    // **Reusable Methods** 
    private void enterText(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));// Fluent wait 
        element.clear();
        if (value != null && !value.equalsIgnoreCase("<empty>")) {
            element.sendKeys(value);
        }
    }

    private void selectDropdown(By locator, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(value);
    }

    private void selectGender(String gender) {
        if ("Male".equalsIgnoreCase(gender)) {
            driver.findElement(By.xpath("//input[@value='2']")).click();
        } else if ("Female".equalsIgnoreCase(gender)) {
            driver.findElement(By.xpath("//input[@value='1']")).click();
        } else {
            System.out.println("Invalid gender: " + gender);
        }
    }
}
