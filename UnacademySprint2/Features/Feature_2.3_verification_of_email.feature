Feature: Test email link

  @smoke
  Scenario: 
    Given user able conntinue with email
    When user click on coninue link
    When user enter email and verify otp
    Then user navigate to Home page
