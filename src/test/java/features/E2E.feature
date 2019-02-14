Feature: Automation E2E test
Description: To test E2E integration

Scenario: To Test Orange Website with valid credentials.
	Given User has the Orange URL
	When user provide valid "username" and "password"
	Then user landed to homepage of OrangeHRM