package com.seleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_004_SelectingvaluefromDropdown {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		launchbrowser();

		fetchdropdownvalue();
	}

	public static void launchbrowser() {

		driver = new ChromeDriver();
		driver.get("C:/Users/Admin/OneDrive/Desktop/Country.html");
	}

	public static void fetchdropdownvalue() throws InterruptedException  {

		WebElement dropdownValue = driver.findElement(By.id("dropdown"));

		Select select = new Select(dropdownValue);

//		There are 3 methods available in select class 
//		
//		1. SelectByVisibleText()=> Whichever value you can see from your open eyes called 
//		2. SelectByvalue()=> 
//		3.SelectByIndex()=> If user want to select value depending on index position

		select.selectByVisibleText("India"); 
		
		Thread.sleep(5000);
		//Thread => Process
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// inbuilt method available under selenium . Implicitwait
	
		 //WebDriver to hold an element for 5 seconds // //
//		select.selectByVisibleText("UK");
//		 
//		select.selectByIndex(2);// selecting value by index position
//
          //select.selectByValue("4");
		
		System.out.println("Test");

	}

}
