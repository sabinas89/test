Feature: Google search test

  Scenario: User can search
    Given Browser is launched
    When I enter search query
    Then I check title is correct
