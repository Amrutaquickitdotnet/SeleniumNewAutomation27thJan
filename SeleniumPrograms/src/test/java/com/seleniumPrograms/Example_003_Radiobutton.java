package com.seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_Radiobutton {

	// (JVM ==> java Virtual Machine // heart of my java compiler)

	public static void main(String[] args) {
		launchBrowser();
		// printPageURL();
		fetchRadioButton();

	}

	static WebDriver driver;

	public static void launchBrowser() {

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
	}

	public static void fetchRadioButton() {

		WebElement femaleSelection = driver.findElement(By.xpath("//input[@value = '1']"));
		femaleSelection.click();

		WebElement maleSelection = driver.findElement(By.xpath("//input[@value = '2']"));
		maleSelection.click();

		WebElement customeSelection = driver.findElement(By.xpath("//input[@value = '-1']"));
		customeSelection.click();

	}
}