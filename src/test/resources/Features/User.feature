Feature: Manage user page


Background:

Given User opens url "https://lms-frontend-phase2.herokuapp.com/login"
Then user enters userName as "LMS" and password as "LMS"
And clicks on Login
  
@User
Scenario: Verify landing in Manage user page

Given User is on any page after Login
When User clicks the Tab "User"
Then User should see the Manage user page
And Close Browser


Scenario: Verify the Manage user page heading

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the page heading as "Manage User"
And Close Browser


Scenario: Verify table footer

Given User is logged on to the LMS website
When User lands on Manage User page
Then User should see the table footer as "In total there are 4 users"
And Close Browser


Scenario: Verifiy the entry details below data table

Given User is logged on to the LMS website
When User lands on Manage User page
Then User should see the text  "Showing 1 to 4 of 4 entries" below the user table
And Close Browser


Scenario: Verify the presence of Add new User button

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the button with text "+ icon and Add New User"
And Close Browser


Scenario: Verify the functionality of Add new User button

Given User is on Manage user page
When User clicks Add New User button
Then User should see the "User details" dialog box
 And Close Browser
 
 Scenario: Verify Table header

Given User is on any page after Login
When User is on the Manage user page after clicking User Tab
Then User should see the table header as "Empty checkbox-icon , ID with sorticon, Name with Sorticon, Email Address with sort icon,Contact Number with sort icon, Batch with sort icon, Skill with Sort icon, Edit/Delete as column names"
And Close Browser


Scenario: Verify the functionality of sort icon present in table header

Given User table is displayed in manage user page
When User clicks sort icon in table header
Then Table rows should be sorted
And Close Browser


Scenario: Check box in table header

Given User table is displayed in manage user page
When User checks empty checkbox in header
Then Check box in all the rows of user table should be checked
And Close Browser


Scenario: Check box in table header

Given User table is displayed in manage user page
When User unchecks checkbox in header
Then Check box in all the rows of user table should be unchecked
And Close Browser


 

