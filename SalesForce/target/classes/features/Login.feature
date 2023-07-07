Feature: login functionality

Scenario: TC001_Using positive data
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the Password as 'Leaf@123'
When Click on the Login
Then Homepage should be displayed