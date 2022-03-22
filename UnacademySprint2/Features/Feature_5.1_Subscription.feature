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
Feature: verification of subscription  

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enter mobile_no
    When User enters OTP
    Then User is successfully Logged in

		

  @tag1
  Scenario: Check get subscription button
    Given User is in selected course page 
    When User able to see get subscription button
    And User click on subcription button 
    Then Users page is redirected to next page

  
  
  
  
 

  
   