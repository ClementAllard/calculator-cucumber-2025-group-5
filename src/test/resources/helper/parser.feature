Feature: Parsing String Expressions
  This feature provides a range of scenarios corresponding to the intended parsing of a string expression.

  Background:
    Given I initialise a calculator for parser

  Scenario Outline: parsing a good expression
    When I provide an expression "<n1>"
    And The expression string is parsing
    Then the expression evaluates to "<result>"

    Examples:
      | n1                                     | result                                   |
      | 1 + 2 * 3                              | 7                                        |
      | + (1, *(2, 3))                         | 7                                        |
      | ((3 ,2)*,1)+                           | 7                                        |
      | 1 + 2 * 3                              | 7                                        |
      | (1 + 2) * 3                            | 9                                        |
      | 2*(((1 + 2) * 3) - 3)/3                | 4                                        |
      | +(2,4,*(2,4))                          | 14                                       |
      | ((2+4)(6-4))/2                         | 6                                        |
      | 2*2^3                                  | 16                                       |
      | mod(e, e)                              | 0                                        |
      | mod(5, 10+0i)                          | 5                                        |
      | mod(51.2, 10.0)                        | 1.2                                      |
      | mod(5+0i, 1.1)                         | 0.6                                      |
      | rINTEGER(100, e)                       | 5                                        |
      | rint(100, e)                           | 5                                        |
      | rRATIONAL(100, e)                      | 5/37                                     |
      | rrat(100, e)                           | 5/37                                     |
      | rREAL(e)                               | 0.731146936                              |
      | rreal(e)                               | 0.731146936                              |
      | rCOMPLEX(e)                            | 0.7311469360199058 + 0.9014476240300544i |
      | rcom(e)                                | 0.7311469360199058 + 0.9014476240300544i |
      | sin(pi/2)                              | 1                                        |
      | sin(3*pi/2)                            | -1                                       |
      | sin(pi)                                | 0                                        |
      | sin(2*pi)                              | 0                                        |
      | cos(0)                                 | 1                                        |
      | cos(pi)                                | -1                                       |
      | cos(pi/2)                              | 0                                        |
      | cos(2*pi)                              | 1                                        |
      | tan(0)                                 | 0                                        |
      | tan(pi/4)                              | 1                                        |
      | tan(pi)                                | 0                                        |
      | tan(2*pi)                              | 0                                        |
      | asin(0)                                | 0                                        |
      | asin(1)                                | 1.5707963267948966                       |
      | acos(1)                                | 0                                        |
      | acos(0)                                | 1.5707963267948966                       |
      | atan(0)                                | 0                                        |
      | atan(1)                                | 0.7853981633974483                       |
      | sinh(0)                                | 0                                        |
      | cosh(0)                                | 1                                        |
      | tanh(0)                                | 0                                        |
      | ln(1)                                  | 0                                        |
      | ln(1/1)                                | 0/1                                      |
      | ln(e)                                  | 1                                        |
      | log(10,100)                            | 2                                        |
      | log(2.0,4.0)                           | 2                                        |
      | log(   10  ,    100   )                | 2                                        |
      | pow(2, 3)                              | 8                                        |
      | pow(255, 0)                            | 1                                        |
      | 0.0 + pow(-1/2, 2)                     | 0.0 + 1/4                                |
      | 2^ 3                                   | 8                                        |
      | (255^ 0)                               | 1                                        |
      | 0.0 + (-1/2) ^2                        | 0.0 + 1/4                                |
      | (1+2-3+8/4)^(30/20*2)                  | 8                                        |
      | sqrt(2, 9)                             | 3                                        |
      | sqrt(3, 4.0^3)                         | 4                                        |
      | 0.0 + sqrt(3, 1/2^3)                   | 0.0 + 0.5                                |
      | sqrt((1+2-3+8/4),(2/2*8)^2)            | 8                                        |
      | sqrt(1, 12983.081)                     | 12983.081                                |
      | sqrt(3, -8)                            | 0+2i                                     |
      | sqrt(2, -25)                           | 0+5i                                     |
      | 0.0+1%                                 | 0.0+1/100                                |
      | 0.0+0.02%                              | 0.0+2/1e4                                |
      | -1 - -1                                | 0                                        |
      | -1/2 - 1/-2                            | 0                                        |
      | -1                                     | -1                                       |
      | -1/4 - 1/-2                            | 1/4                                      |
      | -11/4 - 1/-2                           | -9/4                                     |
      | 1/-2                                   | -1/2                                     |
      | -PI                                    | -3.1415926536                            |
      | -e                                     | -2.7182818285                            |
      | pi                                     | 3.1415926536                             |
      | PI                                     | 3.1415926536                             |
      | e                                      | 2.7182818285                             |
      | E                                      | 2.7182818285                             |
      | rad(180)                               | 3.1415926536                             |
      | degree(rad(180))                       | 180                                      |
      | inv(3/4)                               | 4/3                                      |
      | inv(-3/4)                              | -4/3                                     |
      | 0.0 + inv(2)                           | 0.0 + 1/2                                |
      | 0.0 + inv(-2)                          | 0.0 + -1/2                               |
      | inv(0.5)                               | 2.0                                      |
      | inv(-0.5)                              | -2.0                                     |
      | inv(4-3i)                              | 0.16 + 0.12i                             |
      | log(10/1)                              | 1                                        |
      | log(100/1)                             | 2/1                                      |
      | log(100.0)                             | 2.0                                      |
      | +1 - +1                                | 0                                        |
      | +1                                     | 1                                        |
      | 2b1101 & 2b1011                        | 2b1001                                   |
      | 2b1101 & 2b1110                        | 2b1100                                   |
      | 2b1101 \| 2b1011                       | 2b1111                                   |
      | 2b1100 \| 2b1110                       | 2b1110                                   |
      | 2b1101 ^^ 2b1011                       | 2b0110                                   |
      | 2b1100 ^^ 2b1110                       | 2b0010                                   |
      | >> 2b10                                | 2b01                                     |
      | << 2b1                                 | 2b10                                     |
      | ~ 2b1101                               | 2b0010                                   |
      | 1 <=> 1                                | 1                                        |
      | 0 <=> 0                                | 1                                        |
      | 0 <=> 1                                | 0                                        |
      | 1 => 1                                 | 1                                        |
      | 0 => 1                                 | 1                                        |
      | 0 => 0                                 | 1                                        |
      | 1 => 0                                 | 0                                        |
      | 1 and 1                                | 1                                        |
      | 0 and 1                                | 0                                        |
      | 0 and 0                                | 0                                        |
      | 1 or 1                                 | 1                                        |
      | 0 or 1                                 | 1                                        |
      | 1 or 0                                 | 1                                        |
      | 0 or 0                                 | 0                                        |
      | 1 xor 1                                | 0                                        |
      | 0 xor 1                                | 1                                        |
      | 1 xor 0                                | 1                                        |
      | 0 xor 0                                | 0                                        |

  Scenario Outline: parsing a bad expression throw IllegalExpression
    When I provide an expression "<n1>"
    Then There is an IllegalExpression throw

    Examples:
      | n1                                        |
      | *(+(4,5,6),+(+(7,/(5,2,7)),9)             |
      | *(+(4,5,6),+(7,/(5,2,7))),9)              |
      | *(+(4,5,6),+(7,/(5,2,7))),9)              |
      | *((4 + 5 + 6) +(7 /(5 2 7)) 9             |
      | (4 + z 5 + 6)                             |
      | *(+(4,5,6),+(7,//(5,2,7)),9) + 5          |

  Scenario Outline: parsing a bad expression throw IllegalArgumentException
    When I provide an expression "<n1>"
    Then There is an IllegalArgumentException throw

    Examples:
      | n1                  |
      | mod(5+1i, 1.1)      |
      | mod(5+0i, 1+1i)     |
      | log(0)              |
      | log(-3/4)           |
      | log(-2)             |
      | log(-0.5)           |
      | log(4-3i)           |
      | ln(0)               |
      | ln(-3/4)            |
      | ln(-2)              |
      | ln(-0.5)            |
      | ln(4-3i)            |
      | log(-2,-4)          |
      | log(1,4.0)          |
      | log(1+1i,4)         |
      | log(0,4.0)          |
      | log(2,0)            |
      | log(2+1i,4)         |
      | log(2,4+1i)         |
      | pow(4-3i, 2)        |
      | pow(1, 423-612i)    |
      | 4-3i^ 2             |
      | 1^ 423-612i         |
      | sqrt(2, 4-3i)       |
      | sqrt(2, 423-612i)   |

  Scenario Outline: Bitwise AND throws exception on invalid operand
    When I provide an expression "<n1>"
    Then there is an UnsupportedOperationException throw

    Examples:
      | n1            |
      | 2 & 2b111     |
      | 2 \| 2b111    |
      | 2 ^^ 2b111    |
      | >> 7          |
      | << 7          |
      | ~ 7           |

  Scenario: Using defined constants in expressions
    Given I have defined a constant "test" with value "sqrt(25)"
    When I provide an expression "$test$"
    And The expression string is parsing
    Then the expression evaluates to "5"

  Scenario: Using a constant defined recursively throws error
    Given I have defined a constant "test" with value "sqrt($test$)"
    When I provide an expression "$test2$"
    Then There is an IllegalArgumentException throw for constant

