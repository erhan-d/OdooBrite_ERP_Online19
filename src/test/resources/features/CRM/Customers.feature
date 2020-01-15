@createCustomer
Feature: As a user, I should be able to add customers under CRM Customers submodule

  Scenario: create a new customer
    Given user is on Home Page
    When user navigate to Login Page
    Then user logs in as events CRM manager
    Then user navigates to "CRM" module then clicks on "Customers" submodule
    And user creates a Customers contact

