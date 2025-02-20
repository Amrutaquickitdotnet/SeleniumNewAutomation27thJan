package com.TestExecution;

import java.io.FileNotFoundException;

import com.seleniumPrograms.FetchTestDataFromPropertiesFile;

public class FetchTestDataExecution {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		FetchTestDataFromPropertiesFile fetch = new FetchTestDataFromPropertiesFile();
		
		fetch.launchbrower();
		
		fetch.readData();
		
		
		

	}

}
