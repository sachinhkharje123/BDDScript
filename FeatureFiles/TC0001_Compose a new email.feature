Feature: Compose a new email

  Scenario: Compose a new email
	Given I Opened the Browser
    Then I Entered the Email and click on next Button
    And I Entered the Password and click on next Button
    Then I logged into the Email application
    And I clicks on the Compose Button
    And I Verified Compose Window will be opened or not
    Then Close Application