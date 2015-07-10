Feature:

  @Valid
  Scenario: Correct login
    Given I am about to login
    When I enter valid credentials
    Then I can see the homepage