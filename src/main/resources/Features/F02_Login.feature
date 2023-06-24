@regression
Feature: login functionality

  @smoke
  Scenario: User could login with valid account
    Given user go to login page
    And  User enter valid email&password
    And user click on login button
    Then  User login to the system successfully
