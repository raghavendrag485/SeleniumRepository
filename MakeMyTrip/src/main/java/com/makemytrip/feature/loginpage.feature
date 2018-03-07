Feature: Verifing login page of the makemytrip
Scenario: Verifing login page with valid details

Given User is already on login page
When User verifies title of the page
Then User enters username and password
Then user is on Homepage



