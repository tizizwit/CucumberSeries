@datatable
Feature: Login Feature - Production
  In order to perform successful login

  Scenario: Login to the Facebook Website as a user on Production
    Given user navigates to the facebook website
    When user validates the home page title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname

      | FirstName | LastName |
      | Rahul     | Arora    |
      | Cory      | Paul     |

    And user clicks on the signin button

