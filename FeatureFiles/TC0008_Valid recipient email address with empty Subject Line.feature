Feature: Valid recipient email address with empty Subject Line

  Scenario: Valid recipient email address with empty Subject Line	
	When I Opened the Browser
	Then I Entered the Email and click on next Button
    And I Entered the Password and click on next Button
	Then I logged into the Email application
	And I clicks on the Compose Button
	And I Verified Compose Window will be opened or not
	And I Entered valid recipient email address
	And I not filled subject line
	And I Click on Send Button
	And I Verified error massege for empty subject line
	Then Close Application