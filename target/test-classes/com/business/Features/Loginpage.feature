Feature: Login page Feature

Scenario: Verify Login Page title 
Given User is on Login Page
When User gets title of the page
Then Page title should be "OrangeHRM"

Then forget password link should be displayed

When User enters username "Admin" 
And User enters passowrd "a"
And user clicks on Login button
Then user gets title of the page
And title should be "Title"
