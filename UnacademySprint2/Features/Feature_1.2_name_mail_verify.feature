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
Feature: name and email verification
  

  @tag1
  Scenario: name must not have numbers or special characters 
    Given that the use is in the verify your mobile number page 
    When the name contains special char 
    And the other entries are filled
    Then the form must throw an error
  
    
   @tag2
  Scenario: Email must not start with number or have more than one @
    Given that the use is in the verify your mobile number page
    When the email has more than one @ symbol 
    And the other entries are filled
    Then the form must throw an error 

 # @tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
