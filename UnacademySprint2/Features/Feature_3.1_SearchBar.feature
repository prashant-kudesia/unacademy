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
Feature: Verification of Search Bar appearance
Background: User Login in Unacademy
    Given User is on the Login Page
    When User enters mobilenumber
    When User enter OTP
    Then User successfully Logged in

  @tag1
  Scenario: To validate the appearance of search icon in header part of the screen
    Given user on Unacademy Page
    When user clicks on search icon
    Then search icon should be appear in header part of the web page
 
	@tag2
  Scenario: To validate the appearance of Search bar after clicking on search icon in the header part of the screen
    Given search 
    When user enters to the home page
    Then Search bar should be appear
 
		
