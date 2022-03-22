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
Feature: Verification of goals drop down list

Background: User Login in Unacademy
    Given User is in the Login Page
    When User enters mobile_no
    When User enters OTP
    Then User is successfully Logged in
    
    
  @tag1
  Scenario: To validate that the drop down list of goals added by the user should visible next to unacademy logo.
  
    Given User is on Unacademy Home page
    When User click on drop down list button
    Then Drop down list will appear on the page
    
      
   @tag2
  Scenario:  To validate that the my goals list is editable.
  
    Given User is on Unacademy Home page
    When User click on drop down list button
    And User click on edit link to change the list
    Then Drop down list will appear on the page with editable options
   
    @tag3
  Scenario:  To validate that the couse name will redirect to the course page . 
  
    Given User is on Unacademy Home page
    When User click on drop down list button
    And User click on Course name from the list
    Then User will redirect to that course page

      
    
    
  