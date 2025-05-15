Feature: Operations with complex numbers


  Scenario: Addition with different number types
    Given a complex number "2.5 + 4i"
      When I add the complex by "3"
      Then the complex result should be "5.5 + 4i"

      When I add the complex by "3.0"
      Then the complex result should be "5.5 + 4i"

      When I add the complex by "1/2"
      Then the complex result should be "3 + 4i"

      When I add the complex by "1 + 2i"
      Then the complex result should be "3.5 + 6i"



  Scenario: Subtraction with different number types
    Given a complex number "2.5 + 4i"
    When I subtract the complex by "3"
    Then the complex result should be "-0.5 + 4i"

    When I subtract the complex by "3.0"
    Then the complex result should be "-0.5 + 4i"

    When I subtract the complex by "1/2"
    Then the complex result should be "2 + 4i"

    When I subtract the complex by "1 + 2i"
    Then the complex result should be "1.5 + 2i"



  Scenario: multiply with different number types
    Given a complex number "2.5 + 4i"
    When I multiply the complex by "3"
    Then the complex result should be "7.5 + 12i"

    When I multiply the complex by "3.0"
    Then the complex result should be "7.5 + 12i"

    When I multiply the complex by "1/2"
    Then the complex result should be "1.25 + 2i"

    When I multiply the complex by "1 + 2i"
    Then the complex result should be "-5.5 + 9i"



  Scenario: divide with different number types
    Given a complex number "3 + 3i"
    When I divide the complex by "3"
    Then the complex result should be "1 + 1i"

    When I divide the complex by "3.0"
    Then the complex result should be "1 + 1i"

    When I divide the complex by "1/2"
    Then the complex result should be "6 + 6i"

    When I divide the complex by "1 + 3i"
    Then the complex result should be "1.2 - 0.6i"



  Scenario: Complex number equality and hashcode
    Given two complex numbers "1 + 2i" and "1 + 2i"
      Then The complex should be equal and have the same hashcode
      And a third complex number "2 + 2i" should not be equal to the first
