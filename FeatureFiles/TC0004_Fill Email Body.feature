Feature: Fill Email Body
	
  Scenario: Fill Email Body
    Given I Opened the Browser
    Then I Entered the Email and click on next Button
    And I Entered the Password and click on next Button
    Then I logged into the Email application
    And I clicks on the Compose Button
    And I Verified Compose Window will be opened or not
	And I Entered valid recipient email address
	And I Enter details in subject line
	And I Enter details in email body
	Then Close Application