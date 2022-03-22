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
Feature: Veriication payment

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enter mobile_no
    When User enters OTP
    Then User is successfully Logged in

 Scenario: proceed to the pay button for payment
   Given User is on Pay option page
   When User click on proceed to pay button
   Then it redirected to the payment page
  
   Scenario: change duration button 
   Given User is on payment page
   When User click on change duration button
   Then it redirected sucessfully to the subscription plan page
   







 
