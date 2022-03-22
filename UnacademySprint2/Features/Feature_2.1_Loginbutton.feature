Feature: verification of login button in Home page

  Scenario: Title is verified
	 
   Given user open google
    When Type url
		Given user open google 
		Then I validate the outcome

  Scenario: logo of unacademy is visible
    Then unacademy logo is visible at top right corner
	
  Scenario: validate login button is working
    When user clicks on Login button
    Then user is on Login page
