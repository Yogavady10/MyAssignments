Feature: Incident Management

Background:
Given Set the Endpoint
And Set the Auth

Scenario: Get Incidents
When get incidents
Then validate response code as 200

Scenario: Create Incident with string body
When Create Incident with String body as '{"description": "This is my first description","short_description": "This is my first SD","category": "software"}'
Then validate response code as 201

Scenario Outline: Create Incident with Multiple files
When create Incident with file '<Filename>'
Then validate response code as 201
Examples:
|Filename|
|createincident.json|
|createincident2.json|

Scenario: Get Incidents with QP
When get incidents with query param "sysparm_fields" and "short_description,category"
Then validate response code as 200







