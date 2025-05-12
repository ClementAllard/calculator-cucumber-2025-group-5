grammar Expression;
// commande pour regen le parser : mvn clean generate-sources
expr : (infixExpr | prefixExpr | postfixExpr) EOF
     ;

// PREFIX

prefixExpr : ('+' | '-' | '*' | '/' | '^') '(' prefixExpr (',' prefixExpr)+ ')'                 # PrefixExpression
           | prefixNumber                                                                       # PrefixSimpleNumber
           ;

prefixNumber : prefixfonction
             | complex
             | number
             ;

prefixfonction : FUNCTION prefixExpr ')'                                                        # PrefixUnaryFunction
               | FUNCTION prefixExpr ',' prefixExpr ')'                                         # PrefixBinaryFunction
               ;

// PREFIX

postfixExpr : '(' postfixExpr (',' postfixExpr)+ ')' ('+' | '-' | '*' | '/' | '^')              # PostfixExpression
            | postfixNumber                                                                     # PostfixSimpleNumber
            ;

postfixNumber : postfixfonction
              | complex
              | number
              ;

postfixfonction : FUNCTION postfixfonction ')'                                                  # PostfixUnaryFunction
                | FUNCTION postfixfonction ',' postfixfonction ')'                              # PostfixBinaryFunction
                ;

// INFIX

infixExpr : infixExprLogicPrio1
          ;

infixExprBitwise : infixExprBitwise ('<<' | '>>' | '~' | '&' | '|' | '^^') infixExprLogicPrio1
                 | infixExprLogicPrio1
                 ;

infixExprLogicPrio1 : infixExprLogicPrio1 ('and' | 'xor' | 'or' | '=>' | '<=>') infixExprLogicPrio2
               | infixExprLogicPrio2
               ;

infixExprLogicPrio2 : 'not' infixExprPrio1
               | infixExprPrio1
               ;

infixExprPrio1 : infixExprPrio1 ('+' | '-') infixExprPrio2
               | infixExprPrio2
               ;

infixExprPrio2 : infixExprPrio2 ('*' | '/') infixExprPrio3
               | infixExprPrio3
               | infixExprPrio3 infixExprPrio3
               ;

infixExprPrio3 : infixExprPrio3 ('^') infixExprPrio4
               | infixExprPrio4
               ;

infixExprPrio4 : ('-' | '+') infixExprPrio4                                                      # InfixExpressionSigned
               | '(' infixExpr ')'                                                               # InfixExpressionWithParenthesis
               | infixfunction                                                                   # InfixFunc
               | complex                                                                         # ComplexNumber
               | number                                                                          # InfixSimpleNumber
               ;

infixfunction : FUNCTION infixExpr ')'                                                           # InfixUnaryFunction
              | FUNCTION infixExpr ',' infixExpr ')'                                             # InfixBinaryFunction
              ;

// ATOM

complex : number ('+'|'-') number 'i'                                                            # ComplexAtom
        ;

number : (REAL | INTEGER) E (REAL | INTEGER)                                                     # ScientificAtom
       | INTEGER                                                                                 # IntergerAtom
       | REAL                                                                                    # RealAtom
       | PI                                                                                      # PiNumber
       | E                                                                                       # ENumber
       | (REAL | INTEGER) '%'                                                                    # PercentageAtom
       | BOOL                                                                                    # BoolAtom
       | BINARY                                                                                  # BinaryAtom
       | OCTAL                                                                                   # OctalAtom
       | HEXADECIMAL                                                                             # HexadecimalAtom
       ;

REAL : [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
FUNCTION: [a-zA-Z_][a-zA-Z0-9_]* '(';
PI: ('pi' | 'PI');
E : ('e' | 'E');
BOOL: 'T' | 'F' | '0' | '1';
BINARY: '0b' [01]+;
OCTAL: '0o' [0-7]+;
HEXADECIMAL: '0x' [0-9a-fA-F]+;

WS: [ \t\r\n]+ -> skip;