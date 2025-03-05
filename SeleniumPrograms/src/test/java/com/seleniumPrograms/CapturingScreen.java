package com.seleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreen {
	public static void main(String[] args) throws InterruptedException, IOException {
		launchbrowser();
		login();
		
	}

	
	static WebDriver driver;
	
	public static void launchbrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/time/viewEmployeeTimesheet");
		
		Thread.sleep(2000);
		
		
	}
	
	public static void captureScreen() throws IOException, InterruptedException {
		
	
		
	File sourceDestination =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);// This will helps you to capture screenshot by using getScreenshotAss
	
	
	FileHandler.copy(sourceDestination, new File("E:\\Screenshots\\abc.jpg"));
		
		
		
	}
	
	public static void login() throws IOException, InterruptedException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		
		captureScreen();// method calling inside method
	}
	
	
	
}
