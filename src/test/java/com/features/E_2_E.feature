@Reg
  Feature: End to End shopping experience
 
 
  Scenario: Adding product on basket and proceed to check out 
  
  Given User is on home_page
  When User enters product detailon search bar
  And  User clicks on search button
  And  User selects a product to add to basket
  And  User proceeds to basket
  And  User changes the quantity to 3
  Then The price should also change to 3 times unit price
  When  User enters the post code 
  And   User selcts for collection
  
  And  User scrools down to last store 
  Then Selects the last store for pick up
  
