package com.seleniumPrograms;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleWindowAlert {

	public static void main(String[] args) throws InterruptedException {

		handleWindowAlert();
	}

	static WebDriver driver;

	public static void handleWindowAlert() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("E://alert.html");

		driver.findElement(By.id("submit")).click();

		// Accepting alert

		Alert a = driver.switchTo().alert();
		// a.accept();// By using accept() your window alert will get accepted
		Thread.sleep(3000);
		// a.dismiss();// By using dismiss() your window alert will get dismissed
		String popupText = a.getText();
		Assert.assertEquals(popupText, "Please enter your name:");
		
		a.sendKeys("Nisha");
	}

}
