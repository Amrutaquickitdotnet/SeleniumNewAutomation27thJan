package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckingValidationForPracto {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		validationMessageForUsername();
	}

	public static void launchbrowser() {

		driver = new ChromeDriver();
		driver.get("https://accounts.practo.com/login?next=%2Fcheckid_request&intent=fabric");
		driver.manage().window().maximize();
	}

	public static void checkValidationMessage() {

		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();

		String expectedResult = "Mobile Number / Email ID field cannot be empty";

		WebElement actualResultForUsername = driver.findElement(By.xpath("//span[@id='usernameErrorBlock']"));

		if (expectedResult.equals(actualResultForUsername.getText())) {
			System.out.println("Validation message exist for username ");
		} else {
			System.out.println("Validation not appeared");
		}
		
		
	}
	
	
	public static void validationMessageForUsername() {

		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	
		username.sendKeys("s");
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("sd");
		
		
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();

		String expectedResult = "Email/Mobile is not valid";

		WebElement actualResultForUsername = driver.findElement(By.xpath("//span[@id='usernameErrorBlock']"));

		if (expectedResult.equals(actualResultForUsername.getText())) {
			System.out.println("Validation message exist for username ");
		} else {
			System.out.println("Validation not appeared");
		}
		
		
	}
}