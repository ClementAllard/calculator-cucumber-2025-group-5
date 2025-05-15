Feature: Constant handling

  Scenario: Prevent infinite loop from badly defined constant
    Given I define a constant "bug" with value "$bug$"
    When I parse the constant "bug"
    Then an exception should be thrown

  Scenario: Correct constant expression is parsed and evaluated
    Given I define a constant "test" with value "log(2, 2^12) - 12"
    When I parse the constant "test"
    Then the constant value should be "log(2, 2^12) - 12"
    And the evaluated result should be "0"
