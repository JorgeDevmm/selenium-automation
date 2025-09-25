Feature: Saucedemo Website Login

  @Login
  Scenario Outline: Successful Login
    Given I navigate to the URL "https://www.saucedemo.com/"
    When I enter the credentials <Username> and <Password>
    And I click the Login button
    Then I should see the title "Products" on the home page
    Examples:
      | Username        | Password       |
      | "standard_user" | "secret_sauce" |