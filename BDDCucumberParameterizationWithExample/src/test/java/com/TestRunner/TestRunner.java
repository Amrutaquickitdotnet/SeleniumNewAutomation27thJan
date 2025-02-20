package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//loader class

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		//features = "C:\\SeleniumQABatchJan\\BDDCucumberParameterizationWithExample\\src\\test\\java\\Features\\login.feature",
		
			//	features = "C:\\SeleniumQABatchJan\\BDDCucumberParameterizationWithExample\\src\\test\\java\\Features\\Signup.feature",
				
				
				
		glue = {"com.stepDefinations"},
		
		plugin = {"pretty",
				"html:target/cucumber-reports",
				"json:Reports/cucumber-reports.json",
				"junit:target/Cucumber.xml"}
		
		
		
		)
public class TestRunner 

{
	
	
	

}
