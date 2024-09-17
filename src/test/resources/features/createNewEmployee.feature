Feature: Create a new employee

  @createNewEmployee
  Scenario: Create a new employee in the app

    Given user navegate to web site login page
    When  user login in the app whit the user "Admin" and password "admin123"
    And  register a new employee
    | testuser_1 | Test@153 |
    Then could see the new employee register