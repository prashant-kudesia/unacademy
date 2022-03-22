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
Feature: Verification of subscription plan

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enter mobile_no
    When User enters OTP
    Then User is successfully Logged in

  @tag1
  Scenario:  all plans are visible
    Given User is on selected subcription type page
    When User click on view all plans
    Then All plans should be visible 

  @tag2
  Scenario: to validate that user should able to choose duration/period for subscription
    Given User is able to see all plans for 
    When User select period for subcsription
    Then Duration should be selected sucessfully
    
    @tag3
   Scenario: to validate that enter the valid referral  code and click on apply 
    Given User is selected plan for subsciption plan
    When User enter referral code
    And user click on apply
    Then User code accpeted sucessfully
    
   
   
   
   
   
   
   
  
   

    
