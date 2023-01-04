Feature: Manage  Assignment page


Background:

Given User opens url "https://lms-frontend-phase2.herokuapp.com/login"
Then user enters userName as "LMS" and password as "LMS"
And clicks on Login

@Assignment
Scenario: Click Assigment button
Given user is on user page 
When user click on assigment button
Then user lands on assignment page

Scenario: Validate the heading
Given user is on user page 
When user click on assigment button
#Given user is on assignment page
Then User should see a heading with text "Manage Assignment" on the page