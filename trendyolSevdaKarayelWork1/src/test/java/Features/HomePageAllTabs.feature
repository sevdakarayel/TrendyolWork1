Feature: HomePageAllTabsFeature
  This feature deals with the Home Page All Tabs functionality of the Web Browser


  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I click loginImage button
    And I enter the username as "svdkarayell@gmail.com" and password as "Hello1234"
    And I click login button
    And I click KADIN Button
    And I click ERKEK Button
    And I click COCUK Button
    And I click AYAKKABI&CANTA Button
    And I click SAAT&AKSESUAR Button
    And I click KOZMATIK Button
    And I click EV&YASAM Button
    And I click ELEKTRONIK Button
    And I click SUPERMARKET Button
    Then I should close Trenyol Page



