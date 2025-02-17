package com.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination 
{
	
	WebDriver driver;
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	   
	}

	@When("user provided username and password and click on login button")
	public void user_provided_username_and_password_and_click_on_login_button() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
	   System.out.println("User is landing on dashboard page");
	}

}
