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

postfixNumber : prefixfonction
              | complex
              | number
              ;

postfixfonction : FUNCTION postfixfonction ')'                                                  # PostfixUnaryFunction
                | FUNCTION postfixfonction ',' postfixfonction ')'                              # PostfixBinaryFunction
                ;

// INFIX

infixExpr : infixExprPrio1
          ;

infixExprBitwisePrio1 : infixExprBitwisePrio1 ('&' | '^^' | '|') infixExprBitwisePrio2
                 | infixExprBitwisePrio2
                 ;

infixExprBitwisePrio2 : ('~') infixExprBitwisePrio3
                 | infixExprBitwisePrio3
                 ;

infixExprBitwisePrio3 : ('<<' | '>>') INTEGER infixExprLogicPrio1
                 | ('<<' | '>>') infixExprLogicPrio1
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
        | number '%'                                                                             # Percentage
        ;

number : (REAL | INTEGER) E (REAL | INTEGER)                                                     # ScientificAtom
       | INTEGER                                                                                 # IntegerAtom
       | REAL                                                                                    # RealAtom
       | PI                                                                                      # PiNumber
       | E                                                                                       # ENumber
       | CONST                                                                                   # ConstantAtom
       | BOOL                                                                                    # BoolAtom
       | BASE_INTEGER                                                                            # BaseIntegerAtom
       ;

REAL : [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
FUNCTION: [a-zA-Z_][a-zA-Z0-9_]* '(';
PI: ('pi' | 'PI');
E : ('e' | 'E');
BOOL: 'T' | 'F' | '0' | '1';
BASE_INTEGER: ( [2-9] | '1'[0-9] | '2'[0-9] | '3'[0-6] ) 'b' [0-9a-zA-Z]+;
CONST : '$' [a-zA-Z_][a-zA-Z0-9_]* '$';

WS: [ \t\r\n]+ -> skip;