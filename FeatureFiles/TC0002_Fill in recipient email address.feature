Feature: Fill in recipient email address
  
  Scenario: Fill in recipient email address
    Given I Opened the Browser
    Then I Entered the Email and click on next Button
    And I Entered the Password and click on next Button
    Then I logged into the Email application
    And I clicks on the Compose Button
    And I Verified Compose Window will be opened or not
	And I Entered valid recipient email address
	Then Close Application