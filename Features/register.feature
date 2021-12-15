Feature: Register

Scenario: Successful registration
Given User Launch Chrome Browser
When User opens url "http://practice.automationtesting.in/my-account/"
And enters Email as "deepakalakoti8@gmail.com" and password as "Pnk@12"
And click on register


Scenario Outline: Successful Login
Given User Launch Chrome Browser
When User opens url "http://practice.automationtesting.in/my-account/"
And enters Username as "<email>" and password as "<password>"
And click on login

Examples:
| email | password |
|praveenkalakoti1@gmail.com | Praveen@12 |
|praveen@gmail.com | nk@121 |
