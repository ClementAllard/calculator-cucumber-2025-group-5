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
       ;



// Not in number for not have error left-recursive
complex : negatenumber ('+'|'-') negatenumber 'i'                                    # ComplexAtom
        | negatenumber                                                               # NotComplex
        ;

negatenumber : '-' number                                                           # NegateAtom
             | number                                                               # SimpleAtom
             ;

number: rational                                                                    # RationalNumber
      | INTEGER                                                                     # IntergerAtom
      | REAL                                                                        # RealAtom
      ;

rational : INTEGER '/' INTEGER                                                      # RationalAtom
         ;


REAL : [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
WS: [ \t\r\n,]+ -> skip;