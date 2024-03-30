Feature: User login with valid credentials

  Scenario: Chcek login is successful with valid credentials
    Given user is on login page
    When user enters username and passowrd
    And user clicks on submit button
    Then user is navigated to home page

