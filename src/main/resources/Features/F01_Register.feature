@regression
Feature: this feature will allow guest user to create new valid account

Background: shared steps for sign up
    Given  User go to register page

  @smoke
  Scenario Outline: Guest user could create valid account
    When  User select gander type
    And   User enter first name & last name
    And   User choose date of birth
    And   User enter email"<round>"
    And   Newsletter should be selected
    And   User enter password & confirm password
    And   User click on register button
    Then  User create new account successfully
    Examples:
    |round|
    | 1 |

    # Negative scenario
  Scenario: Guest user couldn't create invalid account
    When  User select gander type
    And   User enter first name & last name
    And   User choose date of birth
    And   User enter  invalidEmail
    And   Newsletter should be selected
    And   User enter password & confirm password
    And   User click on register button
    Then  Account is not created successfully


