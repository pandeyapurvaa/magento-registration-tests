Feature: User Sign Up

  Scenario: Valid Sign up
    Given user navigates to the registration page
    When user enters valid signup details
    And submits the form
    Then user account should be created successfully
