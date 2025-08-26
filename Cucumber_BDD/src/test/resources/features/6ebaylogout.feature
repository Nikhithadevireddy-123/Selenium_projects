Feature: whether user is able to successful logout
Scenario: logout successful
Given open on ebay website
When click sign in and enter details
When click account settings and logout
Then logout sucessfully
