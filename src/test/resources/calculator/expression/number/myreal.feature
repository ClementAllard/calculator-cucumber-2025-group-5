Feature: Operations with MyInteger and other number types

  Scenario: Addition with different number types
    Given an real "3.2"
    When I add the real by "3"
    Then the real result should be "6.2"

    When I add the real by "1/2"
    Then the real result should be "3.7"

    When I add the real by "1.5"
    Then the real result should be "4.7"

    When I add the real by "2.5 + 4i"
    Then the real result should be "5.7 + 4i"

  Scenario: Subtraction with different number types
    Given an real "3.2"
    When I subtract the real by "2"
    Then the real result should be "1.2"

    When I subtract the real by "1/2"
    Then the real result should be "2.7"

    When I subtract the real by "1.5"
    Then the real result should be "1.7"

    When I subtract the real by "2.5 + 4i"
    Then the real result should be "0.7 - 4i"

  Scenario: Multiplication with different number types
    Given an real "3.2"
    When I multiply the real by "3"
    Then the real result should be "9.6"

    When I multiply the real by "1/2"
    Then the real result should be "1.6"

    When I multiply the real by "2.0"
    Then the real result should be "6.4"

    When I multiply the real by "2.5 + 4i"
    Then the real result should be "8 + 12.8i"

  Scenario: Division with different number types
    Given an real "3.3"
    When I divide the real by "3"
    Then the real result should be "1.1"

    When I divide the real by "3/10"
    Then the real result should be "11"

    When I divide the real by "2"
    Then the real result should be "1.65"

    When I divide the real by "2.5 + 4i"
    Then the real result should be "0.3707865169 - 0.593258427i"

  Scenario: Integer equality and hashcode
    Given two reals "3.2" and "3.2"
    Then The reals should be equal and have the same hashcode

    And a third real "3.24" should not be equal to the first
