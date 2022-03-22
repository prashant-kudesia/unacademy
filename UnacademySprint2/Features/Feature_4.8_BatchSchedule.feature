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
Feature: Verification of batch schedule.
Background: User Login in Unacademy
    Given User is in the Login Page
    When User enters mobile_no
    When User enters OTP
    Then User is successfully Logged in

  @tag1
  Scenario:  To validate that the batch schedule is available when user clicked on any batch name.
    Given User is on Unacademy Home Page
    When User scroll down to batch names and User click on batch name
    Then batch schedule will appears

@tag2
  Scenario:  To validate the topics under a particular course is visible and redirected to the lecture window. 
  Given User is on Unacademy Home Page
    When User scroll down to batch names and User click on batch name
    Then batch schedule will appears with all the topics
    
    @tag3
  Scenario:  To validate that the Reviews of course should present after the schedule and in the center of the page.  
  Given User is on Unacademy Home Page
    When User scroll down to batch names and User click on batch name
    Then review of course will populate