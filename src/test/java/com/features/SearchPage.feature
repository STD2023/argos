Feature: Validate Search

Scenario: Vslidate asdd to basket function

Given User is on home_page
And   User enters product detailon search bar
And   User clicks on search button
When  User finds search product on display
And   User selects any product to add to trolley
Then  User should see a confirmation for selected product added
And   User should see the same product been added to basket 
