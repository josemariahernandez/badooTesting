Feature:

  Background:
    Given I am about people near page

  Scenario: Send a message
    When I push some photo
    And I send the message
    Then I can see it
