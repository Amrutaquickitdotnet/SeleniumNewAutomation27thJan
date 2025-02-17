package com.seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		selectvaluefrommulti();

	}

	public static void launchbrowser() {

		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/multiselect.html");
		driver.manage().window().maximize();
	}

	public static void selectvaluefrommulti() {

		WebElement car = driver.findElement(By.id("cars"));

		Select s = new Select(car);
//
//		s.selectByVisibleText("Audi");
//		s.selectByIndex(0);
//		s.selectByValue("opel");
		s.selectByContainsVisibleText("l");
		// s.deSelectByContainsVisibleText("V");

		// getAllSelectedOptions will returns only the selected value from the dropdown
		List<WebElement> carOptions = s.getAllSelectedOptions();

		for (WebElement selectedOptions : carOptions) {

			System.out.println(selectedOptions.getText());

		}
		// getOptions() => Returns all the values from the dropdown
		List<WebElement> allCarOptions = s.getOptions();

		for (WebElement options : allCarOptions) {

			System.out.println("Car options available in the dropdown list :" + options.getTagName());
		}

		System.out.println("*******************************");

		// Another 3 methods for deselection

//	s.deselectByIndex(0);
//	
//	s.deselectByValue("opel");
//	
//	s.deselectByVisibleText("Audi");

		List<WebElement> carList = driver.findElements(By.id("cars"));

		for (int i = 0; i < carList.size(); i++) {

			System.out.println("List of cars are :" + carList.get(i).getText());
		}

	}
	
	//Automate facebook signup page 
}