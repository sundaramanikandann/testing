@tag 
Feature: Members and claims

Background: Launch the browser
Given Go to launch "https://www.cumis.com"

@tag1
  Scenario: Title
    When User enter aboutUs
    And User to read credit unions
    And User to read members and clients
    And User to enter claim form download 
    Then user validate modules browser close
