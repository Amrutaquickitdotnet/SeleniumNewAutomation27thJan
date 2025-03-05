package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//loader class

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\SeleniumQABatchJan\\BDDCucumberParameterizationWithSignupDataTablePriyanka\\src\\test\\java\\Features\\Signup.feature",

		glue = { "com.stepDefinitionsTest" }

		
)
public class TestRunner

{

}
