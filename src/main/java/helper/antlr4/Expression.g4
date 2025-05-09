grammar Expression;
// commande pour regen le parser : mvn clean generate-sources

expr : (prefixExpr | postfixExpr | infixExpr ) EOF;

prefixExpr : ('+' | '-' | '*' | '/' | 'and' | 'or' | 'xor' | '=>' | '<=>' | 'not') '(' prefixExpr prefixExpr+ ')'                 #PrefixOperationWithParenthesis
           | ('+' | '-' | '*' | '/' | 'and' | 'or' | 'xor' | '=>' | '<=>' | 'not') prefixExpr prefixExpr+                         #PrefixOperation
           | number                                                                 # PrefixNumber
           ;

postfixExpr : '(' postfixExpr postfixExpr+ ')' ('+' | '-' | '*' | '/' | 'and' | 'or' | 'xor' | '=>' | '<=>' | 'not')              #PostfixOperationWithParenthesis
           |  postfixExpr postfixExpr+ ('+' | '-' | '*' | '/' | 'and' | 'or' | 'xor' | '=>' | '<=>' | 'not')                      #PostfixOperation
           | number                                                                 # PostfixNumber
           ;

infixExpr : infixExpr ('+' | '-') term                                              # AddSub
          | infixExpr ('and' | 'or' | 'xor' | '=>' | '<=>') term                    # LogicalOp
          | infixExpr ('&' | '|' | '^' | '<<' | '>>') term                          # BitwiseOp
          | term                                                                    # SingleTerm
          ;

term : term ('*' | '/') factor                                                      # MulDiv
     | factor                                                                       # SingleFactor
     | factor implicitMul factor                                                    # ImplicitMultiplication
     ;

implicitMul : ;

factor : 'not' factor                                                               # NotFactor
       | number                                                                     # NumberFactor
       | BOOL                                                                       # BoolFactor
       | '(' infixExpr ')'                                                          # ParenthesizedExpression
       ;

number: '-'? NUMBER                                                                 # SignedNumber
      | BINARY                                                                      # BinaryNumber
      | OCTAL                                                                       # OctalNumber
      | HEXA                                                                        # HexadecimalNumber
      ;

BOOL: 'T' | 'F' | '0' | '1';
BINARY: '0b' [01]+;
OCTAL: '0o' [0-7]+;
HEXA: '0x' [0-9a-fA-F]+;
NUMBER: [0-9]+;

AND: 'and';
OR: 'or';
NOT: 'not';
XOR: 'xor';
IMPLIES: '=>';
EQUIV: '<=>';
SHIFT_LEFT: '<<';
SHIFT_RIGHT: '>>';
BIT_AND: '&';
BIT_OR: '|';
BIT_XOR: '^';

WS: [ \t\r\n,]+ -> skip;