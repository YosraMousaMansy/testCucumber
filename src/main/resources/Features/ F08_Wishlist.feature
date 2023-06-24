@regression
Feature:   wishlist functionality

  @smoke
  Scenario: User could add product to wishlist
   Given  user click on wishlist button
    Then  verify The product has been added successfully to your wishlist
