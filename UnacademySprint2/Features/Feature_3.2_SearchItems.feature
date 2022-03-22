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
Feature: Verification of search box functinality
Background: User Login in Unacademy
    Given User is on the Login Page
    When User enters mobilenumber
    When User enter OTP
    Then User successfully Logged in

  @tag1
  Scenario: To validate the relevant course results appear	
    Given user on home page
    When user clicks on search bar
    And user enters course name as <"<searchInput>">
    Then relevant course should appear
    Examples: 
	      | searchInput  	 |
	      | Target NTSE & Board: Course on Chemical Reactions & Equations |
  
  @tag2
  Scenario: To validate the relevant educators results should appear	
    Given user on home page
    When user clicks on search bar
    And user enters educator name as <"<searchInput>">
    Then relevant educators profile should appear
  Examples: 
	      | searchInput  	 |
	      | Neeraj jangid  |
  @tag3
  Scenario: To validate the relevant lessons results should appear	
    Given user on home page
    When user clicks on search bar
    And user enters lesson name as <"<searchInput>">
    Then relevant lesson should appear
     Examples: 
	      | searchInput  	 |
	      |	IIT JEE PYQs		 	 |
  
	@tag4
  Scenario: To validate the relevant syllabus should appear
    Given user on home page
    When user clicks on search bar
    And user enters syllabus name as <"<searchInput>">
    Then relevant syllabus should appear when text is search by user
    Examples: 
	      | searchInput  	 |
	      |	NTSE syllabus		 	 |
  
  @tag5
  Scenario: To validate the relevant test series results should appear 
    Given user on home page
    When user clicks on search bar
    And user enters test series name as <"<searchInput>">
    Then relevant test series should displayed on test page 
  
 
		Examples: 
	      | searchInput  	 |
	      |ntse class 9 plus test series|
