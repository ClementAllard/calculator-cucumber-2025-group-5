Feature: Parsing String Expressions
  This feature provides a range of scenarios corresponding to the intended parsing of an string expression.

  Background:
    Given I initialise a calculator for parser

  Scenario: parsing a string infix expression
    Given an expression string '1 + 2 * 3'
    When The expression string is parsing
    Then the expression evaluates to 7

  Scenario: parsing a string prefix expression
    Given an expression string '+ 1 *2 3'
    When The expression string is parsing
    Then the expression evaluates to 7

  Scenario: parsing a string postfix expression
    Given an expression string '3 2* 1+'
    When The expression string is parsing
    Then the expression evaluates to 7

  Scenario: parsing a string expression with space and tabbing
    Given an expression string '  1 +        2         *         3'
    When The expression string is parsing
    Then the expression evaluates to 7

  Scenario: parsing a string infix expression parenthesis
    Given an expression string '(1 + 2) * 3'
    When The expression string is parsing
    Then the expression evaluates to 9

  Scenario: parsing a big string infix expression
    Given an expression string '2*(((1 + 2) * 3) - 3)/3'
    When The expression string is parsing
    Then the expression evaluates to 4

  Scenario: parsing a schema expression
    Given an expression string '+(2 4 *(2 4))'
    When The expression string is parsing
    Then the expression evaluates to 14

  Scenario: parsing an expression with an implicit operation
    Given an expression string '((2+4)(6-4))/2'
    When The expression string is parsing
    Then the expression evaluates to 6

  Scenario: parsing an expression with parentheses are not equal
    Given an expression string '*(+(4 5 6) +(+(7 /(5 2 7)) 9)'
    Then There is an IllegalExpression throw

  Scenario: parsing an expression with other token in end
    Given an expression string '*(+(4 5 6) +(7 /(5 2 7))) 9)'
    Then There is an IllegalExpression throw

  Scenario: parsing an expression with notation changing
    Given an expression string '*((4 + 5 + 6) +(7 /(5 2 7)) 9'
    Then There is an IllegalExpression throw

  Scenario: parsing an expression with invalid character
    Given an expression string '(4 + z 5 + 6)'
    Then There is an IllegalExpression throw

  Scenario: parsing an expression two operator in a row
    Given an expression string '*(+(4 5 6) +(7 //(5 2 7)) 9) + 5'
    Then There is an IllegalExpression throw