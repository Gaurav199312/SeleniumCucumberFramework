Feature: Search products and place order

@Smoke
Scenario: Search Experience for product search in home page and offers page

Given User is on GreenKart landing page
When user search with short name "tom" on home page and extract actual name of the product
Then user search the same short name "tom" in offers page to check if the product exists

@Smoke
Scenario Outline: Parameterized search experience
Given User is on GreenKart landing page
When user search with short name <landing_name> on home page and extract actual name of the product for parameterized test
Then user search the same short name <offers_name> in offers page to check if the product exists for parameterized test
Examples:
| landing_name | offers_name |
| pot | pot |
| straw | straw |
| bro | bro |