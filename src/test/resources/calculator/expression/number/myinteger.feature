Feature: Operations with MyInteger and other number types

  Scenario: Addition with different number types
    Given an integer "3"
    When I add the integer by "3"
    Then the integer result should be "6"

    When I add the integer by "1/2"
    Then the integer result should be "3 1/2"

    When I add the integer by "1.5"
    Then the integer result should be "4.5"

    When I add the integer by "2.5 + 4i"
    Then the integer result should be "5.5 + 4i"

  Scenario: Subtraction with different number types
    Given an integer "3"
    When I subtract the integer by "3"
    Then the integer result should be "0"

    When I subtract the integer by "1/2"
    Then the integer result should be "2 1/2"

    When I subtract the integer by "1.5"
    Then the integer result should be "1.5"

    When I subtract the integer by "2.5 + 4i"
    Then the integer result should be "0.5 - 4i"

  Scenario: Multiplication with different number types
    Given an integer "3"
    When I multiply the integer by "3"
    Then the integer result should be "9"

    When I multiply the integer by "1/2"
    Then the integer result should be "1 1/2"

    When I multiply the integer by "1.5"
    Then the integer result should be "4.5"

    When I multiply the integer by "2.5 + 4i"
    Then the integer result should be "7.5 + 12i"

  Scenario: Division with different number types
    Given an integer "3"
    When I divide the integer by "3"
    Then the integer result should be "1"

    When I divide the integer by "1/2"
    Then the integer result should be "6"

    When I divide the integer by "2"
    Then the integer result should be "1 1/2"

    When I divide the integer by "2.5 + 4i"
    Then the integer result should be "0.3370786517 - 0.5393258427i"

  Scenario: Integer equality and hashcode
    Given two integers "10" and "10"
    Then The integers should be equal and have the same hashcode

    And a third integer "15" should not be equal to the first
