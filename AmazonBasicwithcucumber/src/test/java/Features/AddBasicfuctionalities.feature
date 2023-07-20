Feature: This feature will be used to test the Add to Cart functionality of Amazon application

  Scenario: 
    Given I have launched the  Amazon application.
    When I entered product name as "Samsung mobile"
    And I click on search button
    Then I can able to see all the product

  Scenario: 
    When I click on the Product name as "Samsung mobile"
    And I click on the Add to cart link
    Then I can see that product in the cart.
