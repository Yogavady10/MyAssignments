Feature: Incident Management

Scenario: Get Incidents
When get incidents
Then validate response code as 200

Scenario: Create Incident
When create incident with String body '{"description": "Incident via file body","short_description": "Test description"}'
Then validate response code as 201

Scenario: Get Incidents with one query param
When get incidents with queryparam "sysparm_fields" and "short_description,sys_id"
Then validate response code as 200

Scenario Outline: Create Incident with Multiple File
When create incident with file "<fileName>"
Then validate response code as 201
Examples:
|fileName|
|Incident1.json|