Feature: feature of google search

  Scenario: Check google search is successful
    Given browser is open
    And user is on google search page
    When user enters text in search box
    And user clicks on enter button
    Then user is navigated search results
