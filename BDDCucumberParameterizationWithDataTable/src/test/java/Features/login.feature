Feature: Verify Login Functionality of OrangeHRM

Scenario Outline: User can able to login with OrangeHRM successfully
Given User is on the homepage
When user enters valid credentials "<Username>" and "<Password>" and click on login button
Then user should be able to login successfully

Examples:


|Username| Password|

|John123| John123|

|Admin| admin123|


#|	FistName | SurName	|	DOB_Day	|	DOB_Month|DOB_Year|Gender_Female|Gender_Male|Gender_Custom|Mobile_No|New Password|
#|	Nisha		 | S| 13| 09|1987|f|NA|NA|99887| 123456|

#//Test Data Should be sepearted from source Code Defination









