Feature: Test Transfer Funds functionality
Background:
Given user is logged into Parabank application
@transfer
Scenario Outline: Transfer funds between accounts
When user transfers "<amounts>" from "<fromAccount>" to "<toAccount>"
Then transfer should be successful

Examples:
| amounts | fromAccount | toAccount |
| 12    | 15231       | 15231   |