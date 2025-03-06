package helper;

//Import Junit5 libraries for unit testing:
import calculator.*;
import org.junit.jupiter.api.*;
import calculator.expression.*;
import calculator.expression.operator.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestMyExpressionParser {

    Calculator c = new Calculator();
    private Expression e;

    @BeforeEach
    void setUp() throws Exception {
        List<Expression> params1 = Arrays.asList(new MyNumber(4), new MyNumber(5), new MyNumber(6));
        List<Expression> params2 = Arrays.asList(new MyNumber(5), new MyNumber(2), new MyNumber(7));
        List<Expression> params3 = Arrays.asList(new MyNumber(7), new Divides(params2));
        List<Expression> params4 = Arrays.asList(new Plus(params1), new Plus(params3), new MyNumber(9));

        e = new Times(params4);
    }

    @Test
    void testBasicExpressionParsing() throws IllegalConstruction {
        String infixExpressionString = "((4+5+6)*(7+(5/2/7))*9)";
        String prefixExpressionString = "*(+(4 5 6),+(7 /(5 2 7)) 9)";
        String prefixExpressionString2 = "* 9 + ( 4 5 6 ) + 7 / 5 2 7";
        String postfixExpressionString = "((4 5 6)+ (7 (5 2 7)/)+ 9)*";
        String postfixExpressionString2 = "9 (4 5 6)+ (7 (5 2 7)/)+*";

        Expression infixExpressionParsing = MyExpressionParser.parseExpression(infixExpressionString);
        assertEquals(c.eval(e),c.eval(infixExpressionParsing));

        Expression prefixExpressionParsing = MyExpressionParser.parseExpression(prefixExpressionString);
        assertEquals(c.eval(e),c.eval(prefixExpressionParsing));

        Expression prefixExpressionParsing2 = MyExpressionParser.parseExpression(prefixExpressionString2);
        assertEquals(c.eval(e),c.eval(prefixExpressionParsing2));

        Expression postfixExpressionParsing = MyExpressionParser.parseExpression(postfixExpressionString);
        assertEquals(c.eval(e),c.eval(postfixExpressionParsing));

        Expression postfixExpressionParsing2 = MyExpressionParser.parseExpression(postfixExpressionString2);
        assertEquals(c.eval(e),c.eval(postfixExpressionParsing2));
    }

    @Test
    void testSensitivityExpressionParsing() throws IllegalConstruction {
        String expressionStringWithSpaceAndTab = "(( 4          + 5 + 6    )     *   (   7       +( 5 / 2 / 7 ) )  * 9  )";

        Expression expressionParsing = MyExpressionParser.parseExpression(expressionStringWithSpaceAndTab);
        assertEquals(c.eval(e),c.eval(expressionParsing));
    }

    @Test
    void testSchemaExpressionParsing() throws IllegalConstruction {
        String shemaExpressionString = "*(+(4 5 6) +(7 /(5 2 7)) 9)";

        Expression expressionParsing = MyExpressionParser.parseExpression(shemaExpressionString);
        assertEquals(e.toString(Notation.PREFIX),expressionParsing.toString(Notation.PREFIX));
    }

    @Test
    void testPriorityOfOperation() throws IllegalConstruction {
        String expressionString = "4 - 5 * 9";
        Expression expression = new Minus(Arrays.asList(new MyNumber(4), new Times(Arrays.asList(new MyNumber(5), new MyNumber(9)))));

        Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
        assertEquals(c.eval(expression),c.eval(expressionParsing));
    }

    @Test
    void testImplicitMultiplication() throws IllegalConstruction {
        String expressionString = "(4+5+ 6)(7 + 5/2/7)*9";
        Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
        assertEquals(c.eval(e),c.eval(expressionParsing));
    }


    @Test
    void testExeptionParsing(){
        String expressionParantheseInequal = "*(+(4 5 6) +(+(7 /(5 2 7)) 9)";
        String expressionWithOtherTokenInEnd = "*(+(4 5 6) +(7 /(5 2 7))) 9)"; // 9) is add in end of *(+(4 5 6) +(7 /(5 2 7)))
        String expressionNotationChange = "*((4 + 5 + 6) +(7 /(5 2 7)) 9";
        String expressionNotAExpression = "(4 + 5 + 6) efdsvbdrdb";
        String expressionTwoOperatorInARow = "*(+(4 5 6) +(7 //(5 2 7)) 9) + 5";

        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(expressionParantheseInequal);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(expressionWithOtherTokenInEnd);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(expressionNotationChange);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(expressionNotAExpression);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            MyExpressionParser.parseExpression(expressionTwoOperatorInARow);
        });
    }

}
