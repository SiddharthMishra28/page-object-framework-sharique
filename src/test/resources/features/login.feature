Feature: To Test Login and Auth Related Scenarios

  Scenario: Successful Login Test
    Given I navigate to "https://demo.guru99.com/V1/index.php"
    When I Enter "mngr571718" and "patygYh"
    And I click on "LOGIN" button
    Then I should be able to login into manager page

  Scenario Outline: Successful Login Test
    Given I navigate to "https://demo.guru99.com/V1/index.php"
    When I Enter "<username>" and "<password>"
    And I click on "LOGIN" button
    Then I should be able to login into manager page

    Examples: 
      | username   | password |
      | mngr571718 | patygYh  |
      | mngr571718 | patygYh  |
