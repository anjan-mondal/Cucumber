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
@tag5
Feature: Check the backgroud of cucumber
  I want to check the background keyword in cucucmber
  
  Background:
  	Given I want to launch the website
  	When User enter the username "username" and password "password"
  	Then User is able to login the application
  	
  Scenario:
  	Given User should able to see the dashboard tab
  	Then user should click on search button
  	
  Scenario:
  	Given User should able to see the Report tab
  	Then User should able to export the report
  	
	Scenario: Fill The data in the checkout
	Given I want to launch the website
	Then Provide the data
	|anjan|Mondal|12345|455| 

