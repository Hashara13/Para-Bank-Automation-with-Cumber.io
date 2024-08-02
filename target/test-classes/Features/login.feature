Feature: Feature to test login

  Scenario: Check login credentials
    Given user is logged on page
    When user enter username, password
    And Click login button
    Then user navigated to home page
