Feature: Facebook Signup Page As a new user I want to sign up for Facebook So that I can create an account and connect with friends.

  Background:
    Given I am on the Facebook signup page

  @signup
  Scenario Outline: Successful user signup
    Given I enter "<firstName>" as the first name
    And I enter "<lastName>" as the last name
    And I enter "<email>" as the email address
    And I enter "<password>" as the password
    And I select "<gender>" as the gender
    And I select "<dobDay>", "<dobMonth>", "<dobYear>" as the date of birth
    When I click the Sign Up button
    Then I should be redirected to the welcome page

    Examples:
    	| firstName | lastName | email         | password  | gender  | dobDay | dobMonth | dobYear | errorMessage               |
      |           | Doe      |               | Pass1234  | Male    | 15     | May      | 1990    | "Please enter your first name." |
      | John      |          | john@mail.com  | Pass1234  | Male   | 15     | May      | 1990    | "Please enter your last name."  |
      | John      | Doe      |               |          | Male    	| 15     | May      | 1990    | "Please enter a password."      |
      | John      | Doe      | invalidemail   | Pass1234  | Male    | 15     | May      | 1990    | "Please enter a valid email."   |
      | John      | Doe      | john@mail.com  | Pass1234  | Male    |       | May      | 1990    | "Please select your date of birth." |
      | Nisha      | Doe      | test234@gmail.com  | Pass1234  | Male    |     12  | May      | 1990    |  |