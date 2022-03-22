Feature: login functionality For the first user

  @smoke
  Scenario: Test with valid credential
    Given User is in Login Page
    When User enters mobile
    Then phone number is validated
