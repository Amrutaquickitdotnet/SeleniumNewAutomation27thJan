Feature: Facebook SignUp

Scenario Outline: Invalid user signup due to missing information
    Given I am on the Facebook signup page
    When I enter the below signup information  and click on signup button  
| firstName | lastName | email         | password  | gender | dobDay | dobMonth | dobYear | expectedErrorMessage |
|  [empty]   | Doe      |   | Pass1234  | Male   | 15     | May      | 1990  | What's your name?|
Then I should see the error message "<expectedErrorMessage>"