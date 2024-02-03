Feature: Searching New Cars
  In order to search new cars
  As a user
  I have to navigate to carwale.com

  Scenario Outline: Finding new cars
    Given user navigates to carwale website
    When user mouseover to newcars
    Then user clicks on Findnewcars
    And user clicks on "<carBrand>" car
    And user validates carTitle as "<carTitle>"

      Examples:
      | carBrand | carTitle     |
      | Toyota   | Toyota Cars  |
      | Kia      | Kia Cars     |
      | Hyundai  | Hyundai Cars |
      | BMW      | BMW Cars     |
