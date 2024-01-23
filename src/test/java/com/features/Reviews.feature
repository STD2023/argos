Feature: End to End shopping experience
 
 @Regression
  Scenario: Adding product on basket and proceed to check out 
  
  Given User is on home_page
  When User enters product detailon search bar
  And  User clicks on search button
  And  User selects a product to add to basket
  And  User scrolls down to review section
  And  User clicks on review title