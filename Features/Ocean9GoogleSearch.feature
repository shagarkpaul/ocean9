Feature: performe google search 

Scenario Outline: Simple searching 

Given i am on google page 
When i enter search "<term>"
And i click on google search button 
Then i receive related search reults 

Examples:
|term             |
|Quality Assurance|
|Software Testing |
  