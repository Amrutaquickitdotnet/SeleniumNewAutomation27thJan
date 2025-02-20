package com.seleniumPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTestDataFromPropertiesFile

{
	WebDriver driver;

	public void launchbrower() throws InterruptedException {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		
	}

	public void readData() throws FileNotFoundException, InterruptedException {

		String filepath = "C:\\SeleniumQABatchJan\\Properties\\TestData.prop";

		FileInputStream fs = new FileInputStream(filepath);
		// FileInputStream is class available in java used in package of Java.IO and by
		// using fileinputstream user can able to read charachters one by one
		// that means class will going to take one character as one byte

		Properties prop = new Properties();

		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);

		driver.findElement(By.xpath(prop.getProperty("usernameXpath"))).sendKeys(prop.getProperty("UserNameTestData"));
		driver.findElement(By.xpath(prop.getProperty("passwordxpath"))).sendKeys(prop.getProperty("PasswordTestData"));
		driver.findElement(By.xpath(prop.getProperty("loginButtonXpath"))).click();

	}

}
