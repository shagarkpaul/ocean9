Feature: google search - Felling Lucky

Scenario Outline: felling lucky - google search 

Given i am on the google homepage

When i enter search "<feeling lucky>" 
And i click on the "<search>" button

Then i landed on the first result homepage
 


Examples:
|term             |
|Quality Assurance|
|Software Testing |
