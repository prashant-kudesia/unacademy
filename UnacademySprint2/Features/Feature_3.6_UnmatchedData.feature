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
Feature: Verification of unmatched data in search box
Background: User Login in Unacademy
    Given User is on the Login Page
    When User enters mobilenumber
    When User enter OTP
    Then User successfully Logged in

  @tag1
  Scenario: To validate If user search for unmatched data then user should  receive an error.
    Given user on home page
    When user clicks on search bar
    And user enters text as <"<searchInput>">
    Then Error message should be displayed on screen


 Examples: 
	      | searchInput  |
	      | Pruthviraj   |
