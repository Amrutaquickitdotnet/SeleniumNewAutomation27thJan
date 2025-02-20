package com.stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	WebDriver driver;

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);

	}

	@When("user enters valid credentials and click on login button")
	public void user_enters_valid_credentials_and_click_on_login_button(io.cucumber.datatable.DataTable credentials)
			throws InterruptedException {
		List<Map<String, String>> dataList = credentials.asMaps(String.class, String.class);
		for (Map<String, String> userData : dataList) {
			
			driver.findElement(By.name("username")).sendKeys(userData.get("Username"));
		
			driver.findElement(By.name("password")).sendKeys(userData.get("Password"));
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			Thread.sleep(3000);

			driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).click();

			driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).click();
			Thread.sleep(2000);

		}

	}

	@Then("user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		System.out.println("User is landing on dashboard page");
		

	}

}
