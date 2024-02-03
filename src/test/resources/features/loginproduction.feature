@prod
Feature: Login Feature - Production
  In order to perform successful login

  Scenario Outline: Login to the Facebook Website as a user on Production
    Given user navigates to the facebook website
    When user validates the home page title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user validates captcha image
    And user clicks on the signin button

  Examples:
    |username | password|
    | valid   | valid   |
    | invalid | invalid |
    | valid   | invalid |
    | invalid | valid   |

