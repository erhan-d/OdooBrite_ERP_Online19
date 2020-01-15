Feature: Login
  As a user, I should be able to login into Odoo Brite ERP with valid and invalid credentials

  @eventsCRMmanager
  Scenario: Login as events CRM manager
    Given user is on Home Page
    When user navigate to Login Page
    Then user logs in as events CRM manager
    And user verifies that "#Inbox" page subtitle is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then user enters "eventscrmmanager58@info.com" username and "wrongPassword" password
    And user verifies that "Wrong login/password" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then user enters "wrong_username" username and "eventscrmmanager" password
    And user verifies that "Wrong login/password" message is displayed

