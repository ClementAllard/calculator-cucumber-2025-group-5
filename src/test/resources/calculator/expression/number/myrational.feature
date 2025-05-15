Feature: Operations with MyInteger and other number types

  Scenario: Addition with different number types
    Given an rational "1/2"
    When I add the rational by "3"
    Then the rational result should be "3 1/2"

    When I add the rational by "1/2"
    Then the rational result should be "1"

    When I add the rational by "1.5"
    Then the rational result should be "2"

    When I add the rational by "2.5 + 4i"
    Then the rational result should be "3 + 4i"

  Scenario: Subtraction with different number types
    Given an rational "1/2"
    When I subtract the rational by "3"
    Then the rational result should be "-(2 1/2)"

    When I subtract the rational by "1/2"
    Then the rational result should be "0"

    When I subtract the rational by "1.5"
    Then the rational result should be "-1"

    When I subtract the rational by "2.5 + 4i"
    Then the rational result should be "-2 - 4i"

  Scenario: Multiplication with different number types
    Given an rational "1/2"
    When I multiply the rational by "3"
    Then the rational result should be "1 1/2"

    When I multiply the rational by "1/2"
    Then the rational result should be "1/4"

    When I multiply the rational by "0.5"
    Then the rational result should be "0.25"

    When I multiply the rational by "2.5 + 4i"
    Then the rational result should be "1.25 + 2i"

  Scenario: Division with different number types
    Given an rational "1/2"
    When I divide the rational by "3"
    Then the rational result should be "1/6"

    When I divide the rational by "1/2"
    Then the rational result should be "1"

    When I divide the rational by "2.0"
    Then the rational result should be "0.25"

    When I divide the rational by "2.5 + 4i"
    Then the rational result should be "0.0561797753 - 0.0898876404i"

  Scenario: Integer equality and hashcode
    Given two rationals "10/2" and "10/2"
    Then The rationals should be equal and have the same hashcode

    And a third rational "15/2" should not be equal to the first
