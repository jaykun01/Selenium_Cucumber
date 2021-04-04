# Author: Jaydeep
@SmokeScenarios
Feature: Feature to test login functionality

  @SmokeTest
  Scenario Outline: check login is successful
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |