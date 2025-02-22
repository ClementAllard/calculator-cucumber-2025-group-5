package utils;

//Import Junit5 libraries for unit testing:
import calculator.*;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class TestParser {

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
    void testBasicExpressionParsing() {
        String infixExpressionString = "((4+5+6)*(7+(5/2/7))*9)";
        String prefixExpressionString = "*(+(4,5,6),+(7,/(5,2,7)),9)";
        String postfixExpressionString = "((4,5,6)+,(7,(5,2,7)/)+,9)*";

        Expression infixExpressionParsing = Parser.parseExpression(infixExpressionString);
        assertEquals(infixExpressionParsing.toString(), e.toString(Notation.INFIX));

        Expression prefixExpressionParsing = Parser.parseExpression(prefixExpressionString);
        assertEquals(prefixExpressionParsing.toString(), e.toString(Notation.PREFIX));

        Expression postfixExpressionParsing = Parser.parseExpression(postfixExpressionString);
        assertEquals(postfixExpressionParsing.toString(), e.toString(Notation.POSTFIX));
    }

    @Test
    void testSensitivityExpressionParsing() {
        String expressionStringWithSpaceAndTab = "(( 4          + 5 + 6    )     *    (   7       +( 5 / 2 / 7 ) )  * 9  )";

        Expression expressionParsing = Parser.parseExpression(expressionStringWithSpaceAndTab);
        assertEquals(expressionParsing.toString(Notation.INFIX), e.toString(Notation.INFIX));
    }

    @Test
    void testSchemaExpressionParsing(){
        String shemaExpressionString = "*(+(4 5 6) +(7 /(5 2 7)) 9)";

        Expression expressionParsing = Parser.parseExpression(shemaExpressionString);
        assertEquals(expressionParsing,e.toString(Notation.PREFIX));
    }

    @Test
    void testExeptionParsing(){
        String expressionString1 = "/(1 )+( 15 )4 6)";
        String expressionString2 = "efdsvbdrdb";

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionString1);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionString2);
        });
    }

}
