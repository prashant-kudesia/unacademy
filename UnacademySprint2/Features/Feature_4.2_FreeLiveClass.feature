#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Verification of Free live class link.

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enters mobile_no
    When User enters OTP
    Then User is successfully Logged in

  @tag1
  Scenario: To validate that the link will redirect to the live classes availabe at that time.
    Given User is on Unacademy Home page
    When User scroll down to free live class link
    And User click on see all link
    Then User lands on the free live classes of that course