Feature: google search for suggested terms

Scenario Outline: searching suggested terms on google 

Given i am on the google homepage 
When i enter search "<term>"
And i select the first suggested search item
And i click on the "<first result link>"

Then i landed on the site result page 

Examples: 

|term             |
|Quality Assurance|
|Software Testing |

 