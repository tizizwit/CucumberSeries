@bvt
Feature: Login Feature
  In order to perform successful login

  Scenario Outline: Login to the Facebook Website as a user
    Given user navigates to the facebook website
    When user validates the home page title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user clicks on the signin button

  Examples:
    |username | password|
    | valid   | valid   |
    | invalid | invalid |
    | valid   | invalid |
    | invalid | valid   |

