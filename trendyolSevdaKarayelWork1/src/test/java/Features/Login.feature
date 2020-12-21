Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I click loginImage button
    And I enter the username as "svdkarayell@gmail.com" and password as "Hello1234"
    And I click login button
    Then I should see the user form login
