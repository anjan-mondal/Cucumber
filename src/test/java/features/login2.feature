#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Title of your feature
  I want to print title of the page

  Scenario Outline: Title of your scenario
    Given launch the application url "<url>"
    And print the title of the url "<Title>"

    Examples: 
      | url                     | Title       |
      | https://www.google.com/ | Google      |
      | https://in.yahoo.com/   | Yahoo India |
