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
          | infixExpr ('^') term                                                    # InfixExpressionExponent
          | term                                                                    # SingleTerm
          ;

term : term ('*' | '/') factor                                                      # InfixExpressionMulDiv
     | factor                                                                       # SingleFactor
     | factor factor                                                                # InfixExpressionImplicitMul
     ;

// ATOM

factor : '(' infixExpr ')'                                                           # InfixExpressionWithParenthesis
       | '-' '(' infixExpr ')'                                                       # InfixExpressionNegate
       | complex                                                                     # FactorNumber
       | FUNCTION infixExpr ')'                                                      # UnaryFunction
       | FUNCTION infixExpr ',' infixExpr ')'                                        # BinaryFunction
       ;


// Not in number for not have error left-recursive
complex : number ('+'|'-') number 'i'                                                # ComplexAtom
        | number                                                                     # NotComplex
        ;

number : ('-' | '+')? numberatom                                                    # SimpleAtom
       | numberatom E number                                                        # ScientificAtom
       ;

numberatom : rational                                                               # RationalNumber
           | INTEGER                                                                # IntergerAtom
           | REAL                                                                   # RealAtom
           | PI                                                                     # PiNumber
           | E                                                                      # ENumber
           ;

rational : INTEGER '/' INTEGER                                                      # RationalAtom
         | (REAL | INTEGER) '%'                                                     # PercentageAtom
         ;

REAL : [0-9]+ '.' [0-9]+;
INTEGER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
FUNCTION: [a-zA-Z_][a-zA-Z0-9_]* '(';
PI: ('pi' | 'PI');
E : ('e' | 'E');