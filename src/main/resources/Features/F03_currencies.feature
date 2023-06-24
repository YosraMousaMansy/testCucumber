@regression
Feature:  Currency functionality

  @smoke
  Scenario: User verify Euro Symbol (€) is shown on the 4 products displayed in Home page
    Given user Select Euro currency
    Then  verify Euro Symbol  is displayed in Home page
