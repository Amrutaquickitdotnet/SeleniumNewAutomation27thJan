Feature: Facebook SignUp

Scenario: Multiple users sign up
    Given I am on the Facebook signup page
    And I enter the following details for multiple users:
      | firstName | lastName | email                | password    | gender | day | month | year |
      | John      | Doe      | john.doe@mail.com    | password123 | Male   | 15  | Jun   | 1990 |
      | Jane      | Smith    | jane.smith@mail.com  | password456 | Female | 25  | Feb   | 1992 |
      | Alice     | Brown    | alice.brown@mail.com | password789 | Female | 10  | Dec   | 1988 |
    When I click the Sign Up button
    Then I should be redirected to the welcome page

  Scenario: Unsuccessful signup with existing email
    Given I am on the Facebook signup page
    And I enter the following details for multiple users:
      | firstName | lastName | email               | password    | gender | day | month | year |
      | Bob       | White    | bob.white@mail.com  | password123 | Male   | 20  | Jan   | 1987 |
      | Charlie   | Green    | charlie.green@mail.com | password987 | Male   | 30  | Jul   | 1995 |
    When I click the Sign Up button
    Then I should see the error message "Email already in use"
