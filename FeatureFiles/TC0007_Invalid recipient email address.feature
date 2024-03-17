Feature: Invalid recipient email address
    
  Scenario: Invalid recipient email address
    Given I Opened the Browser
	Then I Entered the Email and click on next Button
    And I Entered the Password and click on next Button
	Then I logged into the Email application
	And I clicks on the Compose Button
	And I Verified Compose Window will be opened or not
	And I Entered invalid recipient email address
	And I Click on Send Button
	And I Verified error massege for invalid email
	Then Close Application