Feature: You tube testing

  Scenario Outline: Enter search Criteria in you tube
    Given open browser chrome
    When launch you tube
    Then enter "<search>" and verify search results

    Examples: 
      | search        |
      | cucumbermaven |
      | testng        |
