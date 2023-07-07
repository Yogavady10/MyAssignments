Feature: Leaftaps - CreateLead

Scenario: Verfiy the new lead is created
Given Open browser and load Leaftaps application
And Enter Username
And Enter Password
When Click Login button
Then Verfiy homepage is displayed
And Click CRM/SFA button
And Click Leads tab
And Click Create Lead Tab
And Enter Company Name
And Enter First Name
And Enter Last Name
When Click Submit button 
Then Verify Lead is created