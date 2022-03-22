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
Feature: Verification of subscription Type

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enter mobile_no
    When User enters OTP
    Then User is successfully Logged in

 Scenario: plus subscription type is selected
  Given User is on subscription type page 
  When plus subsciption type is visible
  And User click on Plus button
  Then user  is successfully selected Plus subscription type 
  
  
  Scenario: iconic subscription type is selected
  Given User is on subscription type page
  When iconic subsciption type is visible
  And User click on Iconic button
  Then user  is successfully selected iconic subscription type  


















 
