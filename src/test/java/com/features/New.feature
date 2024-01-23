@Smoke
Feature: End to End Shopping

Scenario: Add the product to basket to pay
  
Given User is on home_page
When User enters product detailon search bar
And  User clicks on search button  
And  User selects a item from the displayed product
Then The product should be added in basket

 

