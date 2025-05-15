Feature: Negate operator

  Scenario: Negating an integer
    Given I have an integer 9
    When I negate the value
    Then the result should be "-9"

  Scenario: Negating a rational number
    Given I have a rational number 1/2
    When I negate the value
    Then the result should be "-1/2"

  Scenario: Negating a real number
    Given I have a real number 0.5
    When I negate the value
    Then the result should be "-0.5"

  Scenario: Negating a complex number
    Given I have a complex number 0.5 + 0.5i
    When I negate the value
    Then the result should be "-0.5 - 0.5i"
