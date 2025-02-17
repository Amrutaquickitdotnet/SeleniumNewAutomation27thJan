package com.seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingCountryFromDropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		fetchCountryValue();

	}

	public static void launchbrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hr-software-sign-up");
		driver.manage().window().maximize();
	}

	// 1. Test Case Writing ==>

	// 1.Test Scenario: 2. Test Case Environment 3.Test Steps 4. Test Case
	// Execution(output)

	// How to print all the countries exist inside country dropdown

//		Test Scenario : Check All the countries exist under country dropdown 
//		Test Steps: 1. Go to URL
//		2. Check webElement for the dropdown you would like to automate
//		3. Print all the countries exist under dropdown 
//		4. Check for Default selected value 
//		5. print count of all countries 
//		6. Select any country and print the name of selected countries

	public static void fetchCountryValue() throws InterruptedException {
		// FindElements => more than one thing I can automate
//	List<WebElement> countries =	driver.findElements(By.name("Country"));
//	//for in loop => C#
//	
//	
//	// for each loop in java
//	for(WebElement countriesList:countries) {
//		System.out.println(countriesList.getText());
//		
//		
//	}
//	
		WebElement country = driver.findElement(By.name("Country"));
		Select select = new Select(country);
//		//getAllSelectedOptions => Returns you the value of selected options
//List<WebElement>countriesList = select.getAllSelectedOptions();//1
//		
//		for(WebElement allCountries:countriesList) {
//			System.out.println(allCountries.getText());
//		}

		// 6. Select any country and print the name of selected countries
//		Thread.sleep(4000);
//		select.selectByVisibleText("India");

		// Print all the countries exist under dropdown
		List<WebElement> allCountries = select.getOptions();
		System.out.println("The count of all countries " + allCountries.size());
		for (int i = 0; i < allCountries.size(); i++) {
			System.out.println(allCountries.get(i).getText());
		}

	}
}