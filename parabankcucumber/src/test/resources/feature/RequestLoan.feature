Feature: Request loan functionality

Background:
Given user is logged into Parabank application
@requestloan
Scenario Outline: Request a loan
When user navigates to  Request loan page
And  user enters "<loan>" and "<down>" 
And click on Apply now
Then loan request should be processed succesfully

Examples:
| loan       | down |
|100         | 1    |
|200         | 2    |

