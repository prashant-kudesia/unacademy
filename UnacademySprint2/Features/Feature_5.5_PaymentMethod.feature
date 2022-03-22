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
Feature: Verification of payment method

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enter mobile_no
    When User enters OTP
    Then User is successfully Logged in

	@tag1
   Scenario: to validate that payment method
   Given User is on the payment page
   When User Choose any one method for payment
   Then payment option should be open sucessfully 
   When the total amount of subscription is visible
   Then amount displayed sucessfully 
   
   @tag2
   Scenario: to validate that the pay in parts option 
   Given user is on choose payment method page
   When User choose pay in parts option
   Then it open sucessfully
   
   @tag3
   Scenario: to validate that on cards option
   Given user is on choose payment method page
   When User click on cards option 
	 #And User enters  card number 
	 #And User the validity of the card
   #And user enter name of card 
   And User click on pay button 
   Then user click on pay button successfully 
   

 
