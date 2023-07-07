Feature: SalesForce - Create New Opportunity

Background:
Given Open browser and load sales force application using 'https://login.salesforce.com'
@Smoke
Scenario Outline: Verify New opportunity is created
And Enter Username as <username>
And Enter Password as <password>
When Click Login
Then Verify Login
And Click App Launcher
And Click View All
And Click Sales from App Launcher
And Click Opportunities tab
And Click on New button
And Enter Opportunity name as <name>
And Choose close date as Today 
And Select Stage as <stage>
When Click Save
Then VerifyOppurtunity Name as <name>

Examples:
|username|password|name|stage|
|'yogavady@testleaf.sandbox'|'Preethi@10'|'Salesforce Automation by Yogavady'|'Needs Analysis'|

Scenario: Verify error is displayed
And Enter Username as 'yogavady@testleaf.sandbox'
When Click Login
But Verify error message