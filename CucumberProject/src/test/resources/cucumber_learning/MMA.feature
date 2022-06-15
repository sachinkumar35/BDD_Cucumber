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
#@tag
@BookingMMABook
Feature: I want to Read some good books

  @LookingForAnMMABookStoreOnline
  Scenario: Looking for an MMA Book Store near my place
    Given I am intrested in reading MMA Books
    And I went online to find different MMA Stores
    And I shortlisted 4 MMA Book Stores near my place
    When I enquired about one store closest to my place they asked me to come and have a look
    And I decided to visit them
    When I went to visit the sore on 20 may 2022
    And I decided to book membership for 3 months
    But I decided to keep a shopKeepar
    Then I purchased a Rich dad and poor dad book