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
Feature: Verification of Recently started courses.
 Background: User Login in Unacademy
    Given User is in the Login Page
    When User enters mobile_no
    When User enters OTP
    Then User is successfully Logged in

  @tag1
  Scenario: To validate that the  recently started course  is visible
    Given User is on Unacademy Home Page
    When User scroll down to recently started batches
    Then recently started batch detail of the course will populate
    
    @tag2
  Scenario:  To validate that the recently started courses link will redirect to the all courses that are started before.  
   Given User is on Unacademy Home Page
    When User scroll down to recently started batches and User click on batch name
    Then User will see the recently started batches available