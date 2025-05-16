Feature: Basic arithmetic operator behavior
  This feature verifies that core arithmetic operators behave correctly.

  Scenario Outline: Constructor throws exception with null parameters
    When I create a "<op>" operator with null
    Then an IllegalConstruction exception is thrown

    Examples:
    |     op      |
    | Divides     |
    | Minus       |
    | Multiply    |
    | Addition    |
    | Negate      |
    | Power       |

  Scenario: Division by zero
    When I divide an integer by 0
    Then an ArithmeticException is thrown

  Scenario Outline: Real division by zero cases
    When I divide "<numerator>" by "<denominator>"
    Then an ArithmeticException is thrown with this message "<result>"

    Examples:
      | numerator | denominator | result       |
      | 0.0       | 0.0         | NaN          |
      | 1.0       | 0.0         | + Infinity   |
      | -1.0      | 0.0         | - Infinity   |

  Scenario Outline: Divide operation results
    When I divide "<left>" by "<right>"
    Then the result of the basic operation is "<result>"

    Examples:
      | left         | right        | result        |
      | 2            | 2            | 1             |
      | 2            | 1/2          | 4             |
      | 2            | 0.5          | 4             |
      | 2            | 1+2i         | 0.4 - 0.8i    |
      | 1/2          | 2            | 1/4           |
      | 1/2          | 1/2          | 1             |
      | 1/2          | 0.5          | 1             |
      | 1/2          | 1+2i         | 0.1 - 0.2i    |
      | 0.5          | 2            | 0.25          |
      | 0.5          | 1/2          | 1             |
      | 0.5          | 0.5          | 1             |
      | 0.5          | 1+2i         | 0.1 - 0.2i    |
      | 1+2i         | 2            | 0.5 + 1i      |
      | 1+2i         | 1/2          | 2 + 4i        |
      | 1+2i         | 0.5          | 2 + 4i        |
      | 1+2i         | 1+2i         | 1 + 0i        |

  Scenario Outline: Minus operation results
    When I minus "<left>" by "<right>"
    Then the result of the basic operation is "<result>"

    Examples:
      | left     | right    | result       |
      | 2        | 2        | 0            |
      | 2        | 1/2      | 1 1/2        |
      | 2        | 0.5      | 1.5          |
      | 2        | 1+2i     | 1 - 2i       |
      | 1/2      | 2        | -(1 1/2)     |
      | 1/2      | 1/2      | 0            |
      | 1/2      | 0.5      | 0            |
      | 1/2      | 1+2i     | -0.5 - 2i    |
      | 0.5      | 2        | -1.5         |
      | 0.5      | 1/2      | 0            |
      | 0.5      | 0.5      | 0            |
      | 0.5      | 1+2i     | -0.5 - 2i    |
      | 1+2i     | 2        | -1 + 2i      |
      | 1+2i     | 1/2      | 0.5 + 2i     |
      | 1+2i     | 0.5      | 0.5 + 2i     |
      | 1+2i     | 1+2i     | 0 + 0i       |

  Scenario Outline: Adding operation results
    When I adding "<left>" by "<right>"
    Then the result of the basic operation is "<result>"

    Examples:
      | left     | right    | result       |
      | 2        | 2        | 4            |
      | 2        | 1/2      | 2 1/2        |
      | 2        | 0.5      | 2.5          |
      | 2        | 1+2i     | 3 + 2i       |
      | 1/2      | 2        | 2 1/2        |
      | 1/2      | 1/2      | 1            |
      | 1/2      | 0.5      | 1            |
      | 1/2      | 1+2i     | 1.5 + 2i     |
      | 0.5      | 2        | 2.5          |
      | 0.5      | 1/2      | 1            |
      | 0.5      | 0.5      | 1            |
      | 0.5      | 1+2i     | 1.5 + 2i     |
      | 1+2i     | 2        | 3 + 2i      |
      | 1+2i     | 1/2      | 1.5 + 2i     |
      | 1+2i     | 0.5      | 1.5 + 2i     |
      | 1+2i     | 1+2i     | 2 + 4i       |

  Scenario Outline: Multiply operation results
    When I multiply "<left>" by "<right>"
    Then the result of the basic operation is "<result>"

    Examples:
      | left     | right    | result       |
      | 2        | 2        | 4            |
      | 2        | 1/2      | 1            |
      | 2        | 0.5      | 1            |
      | 2        | 1+2i     | 2 + 4i       |
      | 1/2      | 2        | 1            |
      | 1/2      | 1/2      | 1/4          |
      | 1/2      | 0.5      | 0.25         |
      | 1/2      | 1+2i     | 0.5 + 1i     |
      | 0.5      | 2        | 1            |
      | 0.5      | 1/2      | 0.25         |
      | 0.5      | 0.5      | 0.25         |
      | 0.5      | 1+2i     | 0.5 + 1i     |
      | 1+2i     | 2        | 2 + 4i       |
      | 1+2i     | 1/2      | 0.5 + 1i     |
      | 1+2i     | 0.5      | 0.5 + 1i     |
      | 1+2i     | 1+2i     | -3 + 4i      |


  Scenario Outline: Power operation results
    When I power "<left>" by "<right>"
    Then the result of the basic operation is "<result>"

    Examples:
      | left     | right    | result       |
      | 2        | 2        | 4            |
      | 2        | 1/2      | 1.4142135624 |
      | 2        | 0.5      | 1.4142135624 |
      | 1/2      | 2        | 1/4          |
      | 1/2      | 1/2      | 0.7071067812 |
      | 1/2      | 0.5      | 0.7071067812 |
      | 0.5      | 2        | 0.25         |
      | 0.5      | 1/2      | 0.7071067812 |
      | 0.5      | 0.5      | 0.7071067812 |

  Scenario Outline: Negation operation
    When I negate "<value>"
    Then the result of the basic operation is "<result>"

    Examples:
      | value   | result       |
      | 9       | -9           |
      | 1/2     | -1/2         |
      | 0.5     | -0.5         |
      | 0.5+0.5i| -0.5 - 0.5i  |