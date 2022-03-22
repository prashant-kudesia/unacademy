Feature: login functionality for registered mobaile

  Background: 
    Given User is on his Home Page
    When Registered mobaile enter
    When enters OTP

  @smoke
  Scenario: user is able to login
    Then successfully Logged in using mobile

  Scenario: user is able to logout
    Then user succefully logout
