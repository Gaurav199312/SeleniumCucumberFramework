Feature: Place the order for Products

@PlaceOrder
Scenario Outline: Search Experience for product search in both home and Offers page

Given User is on GreenKart landing page
When user search with short name <Name> on home page and extract actual name of the product for parameterized test
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name  |
| Tomato 	|
