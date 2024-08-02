Feature: Feature to test login
		
		Login Para Bank
		As a avalid Customer

  Scenario: Check login credentials
    Given I am in the Para Bank Login Page
    When I enter valid credentials
    And Click login button
    Then Should taken to the Overview Page
