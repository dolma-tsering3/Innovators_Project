Feature: searching products

  Scenario Outline: searching products on google

    Given I am on the google homepage

    When I enter the "<product_name>" in the search bar

    And I click the search button

    Then I can see the search result successfully.

    Examples:

    | product_name  |
    |      toy         |
    |      flower      |
    |  AI chips         |
