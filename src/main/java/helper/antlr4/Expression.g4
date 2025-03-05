grammar Expression;

expr : prefixExpr                                                                   # PrefixExpression
     | postfixExpr                                                                  # PostfixExpression
     | infixExpr                                                                    # InfixExpression
     ;

prefixExpr : ('+' | '-' | '*' | '/') '(' prefixExpr prefixExpr+ ')'                 #PrefixOperationWithParenthesis
           | ('+' | '-' | '*' | '/') prefixExpr prefixExpr+                         #PrefixOperation
           | number                                                                 #PrefixNumber
           ;

postfixExpr : '(' postfixExpr postfixExpr+ ')' ('+' | '-' | '*' | '/')              #PostfixOperationWithParenthesis
           |  postfixExpr postfixExpr+ ('+' | '-' | '*' | '/')                      #PostfixOperation
           | number                                                                 #PostfixNumber
           ;

infixExpr : infixExpr ('+' | '-') term                                              # AddSub
          | term                                                                    # SingleTerm
          ;

term : term ('*' | '/') factor                                                      # MulDiv
     | factor                                                                       # SingleFactor
     ;

factor : number                                                                     # NumberFactor
       | '(' infixExpr ')'                                                          # ParenthesizedExpression
       ;

number: '-'? NUMBER                                                                 # SignedNumber
      ;

NUMBER: [0-9]+;
WS: [ \t\r\n,]+ -> skip;
