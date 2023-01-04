Feature: Program

Background:

Given User opens url "https://lms-frontend-phase2.herokuapp.com/login"
Then user enters userName as "LMS" and password as "LMS"
And clicks on Login

@Program
Scenario: Validate the Manage Program heading

 Given User is logged on to the LMS website
 When User is on Program page
 Then User should see the heading as "Manage Program" 
 And Close Browser
 
 @Program1
 Scenario: Validate the text below the table
 
 Given User is logged on to the LMS website
 When User is on Program page
 Then User should see the text as "Showing 1 to 5 of 9 entries"
  And Close Browser
  
  @Program2
  Scenario: Validate the footer
  Given User is logged on to the LMS website
  When User is on Program page
  Then User should see the footer as "In total there are 9 programs"
  
  @Program3
  Scenario: Validating the default state of Delete button
  Given User is logged on to the LMS website
  When User is on Program page
  Then User should see the Delete button on the top left hand side as Disabled 
  And Close Browser
  
  @Program4
  Scenario: Validate Search Feature
  Given User is logged on to the LMS website
  When User is on Program page
  Then Text box used for search has text as 'Search'
  
  @Program5
  Scenario: Search Program By Name
  Given User is on Program page
  When User enters  <name phrase> into search box.
  Then Entries for <name phrase> are shown.
  
  @Program6
   Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected
    And Close Browser
@Program7
  Scenario: Edit Feature
    Given User is on Program page
    When User clicks on <Edit> button
    Then User lands on Program Details form.
    And Close Browser
    
@Program8
  Scenario: Edit Program Name
    Given User is on Program Details form
    When User edits Name and selects the Save button
    Then User can see updated Name
    And Close Browser
@Program9
  Scenario: Edit Program Description
    Given User is on Program Details form
    When User edits Description and selects the Save button
    Then User can see updated Description
    And Close Browser
@Program10
  Scenario: Edit Program Status
    Given User is on Program Details form
    When User changes status and selects the Save button
    Then User can see updated program Status
    And Close Browser
@Program11
  Scenario: Click Cancel
    Given User is on Program Details form
    When User clicks <Cancel> button
    Then User can see Program Details form disappears
    And Close Browser
@Program12
  Scenario: Click Save
    Given User is on Program Details form
    When User clicks <Save> button
    Then User can see 'Successful Program Updated' message
    And Close Browser
    
      
  Scenario: Select Program
    Given User is on Program page
    When User selects Program using checkbox
    Then Program gets selected
    And Close Browser
    

  @Program14
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button
    Then User lands on Program Confirm Deletion form del
    And Close Browser

  @Program15
  Scenario: Click Yes
    Given User is on Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Program Deleted' message
    And Close Browser

  @Program16
  Scenario: Click No
    Given User is on Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears
    And Close Browser
    
    @Program17
    Scenario: Validate Add New Program
    Given User is on Program page
    When User clicks <A New Program> button
    Then User lands on Program Details form.
    And Close Browser

  @Program18
  Scenario: Empty form submission
    Given User is on Program Details form to add new program
    When User clicks <Save> button without entering data
    Then User gets message 'Name is required'
    And Close Browser
@Program19
  Scenario: Enter Program Name
    Given User is on Program Details form to add new program
    When User enters <Name> in name text box
    Then User can see 'Name' entered in name
    And Close Browser

  @Program20
  Scenario: Enter Program Description
    Given User is on Program Details form to add new program
    When User enters <Name> in description text box
    Then User can see 'Name' entered in description
    And Close Browser

  @Program21
  Scenario: Select Status
    Given User is on Program Details form to add new program
    When User selects <Status> using radiobutton
    Then User can see 'Active/Inactive' status selected
    And Close Browser

  @Program22
  Scenario: Click Save
    Given User is on Program Details form to add new program
    When User clicks <Save> button on add new program
    Then User gets message 'Successful Program created' on add new program
    And Close Browser

  @Program23
  Scenario: Click Cancel
    Given User is on Program Details form to add new program
    When User clicks <Cancel> button on add new program
    Then User can see Program Details form disappears
    And Close Browser
      
    @Program24  
  Scenario: Select multiple Program
    Given User is on Program page
    When User selects more than one Program using checkbox
    Then Programs get selected
    And Close Browser
    
   @Program25   
  Scenario: Delete Feature
    Given User is on Program page
    When User clicks on <Delete> button on top left corner
    Then User lands on Program Confirm Deletion form.
    And Close Browser

  
  Scenario: Click Yes
    Given User is on Program Confirm Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Programs Deleted' message
    And Close Browser

  
  Scenario: Click No
    Given User is on Program Confirm Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears
    And Close Browser
      
    
  Scenario: Verify that the results are displayed in Ascending order of Program name
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program name
    Then User can see the results in Ascending order of Program name
    And Close Browser
   
  
  Scenario: Verify that the results are displayed in Ascending order of Program Description
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program Description 
    Then User can see the results in Ascending order of Program Description
    And Close Browser
    
    
    Scenario: Verify that the results are displayed in Ascending order of Program Status
    Given User is on Program page
    When User clicks on the Ascending arrow down near to the Program Status 
    Then User can see the results in Ascending order of Program Status
    And Close Browser
    
    
    Scenario: Verify that the results are displayed in Descending order of Program name
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program name
    Then User can see the results in Descending order of Program name
    And Close Browser
   
  
  Scenario: Verify that the results are displayed in Descending order of Program Description
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program Description 
    Then User can see the results in Descending order of Program Description
    And Close Browser
    
    
    Scenario: Verify that the results are displayed in Descending order of Program Status
    Given User is on Program page
    When User clicks on the Descending arrow down near to the Program Status 
    Then User can see the results in Descending order of Program Status
    And Close Browser
    
    
  
    

    
    
      
      
    
 
 
  