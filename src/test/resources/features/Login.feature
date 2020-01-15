Feature: Login
  As user, I want to be able to login into Odoo Brite ERP
  under different roles with username and password

  @postmanager
  Scenario: Login as postmanager
    Given user logs in as postmanager
    Then user is on the login page
    Then click sign in button
    Then user enters "posmanager45@info.com" username and "posmanager" password
    Then click "Purchases" module
    And user verifies that "Requests for Quotation" page subtitle is displayed

  @eventscrmmanager
  Scenario: Login as events crm manager
    Given user logs in as events crm manager
    Then user is on the login page
    Then click sign in button
    Then user enters "posmanager45@info.com" username and "posmanager" password
    Then click "Purchases" module
    And user verifies that "Requests for Quotation" page subtitle is displayed

  @eventsCRMmanager
  Scenario: Login as events CRM manager
    Given user logs in as events CRM manager
    Then user is on the login page
    Then click sign in button
    Then user enters "posmanager45@info.com" username and "posmanager" password
    Then click "Purchases" module
    And user verifies that "Requests for Quotation" page subtitle is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when password is not correct
    Given user is on the login page
    Then click sign in button
    Then user enters "posmanager45@info.com" username and "wrongPassword" password
    And user verifies that "Wrong login/password" message is displayed

  @negative_test
  Scenario: Verify that warning message is displayed when username is not correct
    Given user is on the login page
    Then click sign in button
    Then user enters "wrong_username" username and "posmanager" password
    And user verifies that "Wrong login/password" message is displayed

