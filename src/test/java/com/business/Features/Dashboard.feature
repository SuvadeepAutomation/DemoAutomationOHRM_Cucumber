Feature: Dashboard Page 

Background:
Given User has already logged in
|username|password|
|Admin|admin123|

Scenario: Dashboard Page title 
Given User has already logged in
When User gets the title of the account page
Then Account Page title should be "OrangeHRM"

Scenario: Quick Launch section 
Given User has already logged in
Then User gets the quick section
|Assign Leave|
|Leave List|
|Timesheets|
|Apply Leave|
|My Leave|
|My Timesheet|
