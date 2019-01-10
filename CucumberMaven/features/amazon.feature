Feature: Amazon site test

  Scenario Outline: Open site and search products add to cart and buy
    Given chrome browser is opened
    And site amazon is launched
    When I "<search>" products
    And add them to cart
     Then cart should have those items and should be able to checkout
    
    Examples:
    |search|
    | echo|
    
Scenario: open site amazon
Given chrome open
When amazon open
Then close browser
