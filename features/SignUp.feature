#Author: Bhagyashri

Feature: Sign Up module DemoBlaze application

	Background: 
    Given Open the Google browser
    When Enter the URL

    Scenario: To verify the URL for Demo_blaze on Google browser 
    Then Navigate to Google homepage
    
    Scenario: To verify that the user redirects to the sign up page
    And click on the Sign Up site link
    Then Navigate to signup popup
    
    Scenario:
    And click on the Sign Up site link
    And user inputs valid "DemoBlaze6" and "Admin@123"
    And Click on SignUp
    Then accept the alert
