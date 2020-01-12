
Feature:Activity Types
 User Story: Verify Activity Types table should have column names
  Scenario: User verifies Activity Types page title
    Given user logs in as events CRM manager
    Then user is on the login page
    Then click sign in button
    Then user enters "eventscrmmanager58@info.com" username and "eventscrmmanager" password
    Then click "CRM" module
    Then click "Activity Types" module
    And user verifies that "Activity Types" page subtitle is displayed
  @ActivityTypes
  Scenario: User verifies Activity Types table column names
    Given user logs in as events CRM manager
    Then user is on the login page
    Then click sign in button
    Then user enters "eventscrmmanager58@info.com" username and "eventscrmmanager" password
    Then click "CRM" module
    Then click "Activity Types" module
    Then user verifies Activity Types table column names are displayed
      |Name  |
      |Summary |
      |# Days  |
