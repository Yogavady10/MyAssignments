Feature: Leaftaps - CreateLead

Background: 
Given Open browser and load Leaftaps application using 'http://leaftaps.com/opentaps/control/login'


@Smoke @Regression
Scenario Outline: Verfiy the new lead is created
And Enter Username as <username>
And Enter Password as <password>
When Click Login button
Then Verfiy homepage is displayed
And Click CRM/SFA button
And Click Leads tab
And Click Create Lead Tab
And Enter Company Name as <companyname>
And Enter First Name as <firstname>
And Enter Last Name as <lastname>
When Click Submit button
Then Verify Lead is created

Examples:
|username|password|companyname|firstname|lastname|
|'DemoSalesManager'|'crmsfa'|'TestLeaf'|'Hari'|'R'|
|'DemoSalesManager'|'crmsfa'|'TestLeaf'|'Babu'|'M'|

@Smoke
Scenario: Verfiy the new lead is created
And Enter Username as 'DemoSalesManager'
When Click Login button
But Verfiy error is displayed