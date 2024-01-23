@multi
Feature: Login page feature

Background: 

Given User is on home_page
When User enters product detailon search bar
And  User clicks on search button

Scenario: Search for the product

Then User should only see the list of searched products. 


Scenario: Verify the logo

Then User shiould see the Argos logo in on the page 


 Scenario: Validate price filter 
 
 And  User selcts price filter
 Then Only selected price range products should be displayed 
 
 