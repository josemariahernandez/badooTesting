Feature:

  Background:
    Given I am about people near page

  Scenario: Send a message
    When I push some photo
    And I write the message
    Then I can send it
