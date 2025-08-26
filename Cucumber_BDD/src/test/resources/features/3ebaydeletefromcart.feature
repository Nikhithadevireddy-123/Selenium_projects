Feature: Remove item from cart
Scenario: Remove an item from the cart
Given ebay homepage is opened in default browser
When user signs in with valid credentials
And user removes an item from the cart
Then item should be successfully removed from the cart
