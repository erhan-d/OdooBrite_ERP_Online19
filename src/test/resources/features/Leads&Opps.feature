
#muammer
  Feature: New tag testing

    @TestingNewTag
    Scenario: Creating new tag
      Given user is on the login page
      Then user logs in as "eventscrmmanager2"
      And user navigates to "CRM"
      Then user goes to "Lead Tags" under tha "Leads & Opportunities" module
      And user create and save a new tag "home"
      And user verifies that message displayed is equal to "home"

