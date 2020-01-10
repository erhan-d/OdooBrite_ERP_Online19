Feature: Create Sales Channel

  As a manager I want to be able to create a sales channel.

  @CreateSalesChannel
  Scenario: Creating Sales Channel
    Given user logs in as events crm manager
    Then user is on the login page
    Then click sign in button
    Then user enters "eventscrmmanager58@info.com" username and "eventscrmmanager" password
    Then user navigates to Sales Channel sub module
    Then user creates a Bugterminators Sales Channel
    And user verifies that Sales Channel is created
