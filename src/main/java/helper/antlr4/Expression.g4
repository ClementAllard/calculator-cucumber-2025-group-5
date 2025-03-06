grammar Expression;

expr : (prefixExpr | prefixExprWithParenthesis | postfixExpr | postfixExprWithParenthesis | infixExpr ) EOF;

prefixExpr : ('+' | '-' | '*' | '/') prefixExpr prefixExpr+                         #PrefixOperation
           | number                                                                 #PrefixNumber
           ;

prefixExprWithParenthesis : ('+' | '-' | '*' | '/') '(' prefixExprWithParenthesis prefixExprWithParenthesis+ ')'  #PrefixOperationWithParenthesis
                          | number                                                  #PrefixNumberWithParenthesis
                          ;

postfixExpr :  postfixExpr postfixExpr+ ('+' | '-' | '*' | '/')                      #PostfixOperation
            | number                                                                 #PostfixNumber
            ;

postfixExprWithParenthesis : '(' postfixExprWithParenthesis postfixExprWithParenthesis+ ')' ('+' | '-' | '*' | '/')              #PostfixOperationWithParenthesis
           | number                                                                 #PostfixNumberWithParenthesis
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
