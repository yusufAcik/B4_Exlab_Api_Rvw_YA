Feature: Compare UI and API experiences
@apiUi
  Scenario Outline: UI and API Experiences
    When  The user creates a POST request for add a new experience with "<job>" and "<company>" and "<location>" and "<fromdate>" and "<todate>" and "<current>" and "<description>"
    Then The user verifies that the status code is <statusCode>
    And The user is on the Dashboard page
    Then The user verifies that UI and API experiences must be match job is "<job>"
    Examples:
      | job | company | location | fromdate | todate | current | description | statusCode |
      | SDET | BJK | Istanbul | 2020-01-02 | 2021-02-03 | false | description | 200 |
