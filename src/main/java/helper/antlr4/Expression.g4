grammar Expression;
// commande pour regen le parser : mvn clean generate-sources
expr : (infixExpr | prefixExpr | postfixExpr ) EOF;

// PREFIX

prefixExpr : ('+' | '-' | '*' | '/') '(' prefixExpr (','? prefixExpr)+ ')'          #PrefixExpression
           | ('+' | '-' | '*' | '/') prefixExpr prefixExpr+                         #PrefixExpression
           | complex                                                                #PrefixNumber
           ;

// POSTFIX

postfixExpr : '(' postfixExpr (','? postfixExpr)+ ')' ('+' | '-' | '*' | '/')       #PostfixExpression
            | postfixExpr postfixExpr+ ('+' | '-' | '*' | '/')                      #PostfixExpression
            | complex                                                               #PostfixNumber
            ;

// INFIX

infixExpr : infixExpr ('+' | '-') term                                              # InfixExpressionAddSub
          | term                                                                    # SingleTerm
          ;

term : term ('*' | '/') factor                                                      # InfixExpressionMulDiv
     | factor                                                                       # SingleFactor
     | factor implicitMul factor                                                    # InfixExpressionImplicitMul
     ;

implicitMul : ;

// ATOM

factor : '(' infixExpr ')'                                                           # InfixExpressionWithParenthesis
       | '-' '(' infixExpr ')'                                                       # InfixExpressionNegate
       | complex                                                                     # FactorNumber
       | FUNCTION infixExpr (',' infixExpr)? ')'                                     # UnaryFunction
       ;


// Not in number for not have error left-recursive
complex : negatenumber ('+'|'-') negatenumber 'i'                                    # ComplexAtom
        | scientific                                                                 # NotComplex
        ;

scientific : negatenumber ('e'|'E') negatenumber                                     # ScientificAtom
           | negatenumber                                                            # NotScientific
           ;

negatenumber : '-' number                                                           # NegateAtom
             | number                                                               # SimpleAtom
             | '+' number                                                           # PositiveAtom
             ;

number: rational                                                                    # RationalNumber
      | INTEGER                                                                     # IntergerAtom
      | REAL                                                                        # RealAtom
      | PI                                                                          # PiNumber
      ;

rational : INTEGER '/' INTEGER                                                      # RationalAtom
         ;

REAL : [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
WS: [ \t\r\n,]+ -> skip;
FUNCTION: [a-zA-Z_][a-zA-Z0-9_]* ' '* '(';
PI: ('pi' | 'PI');