package helper;

//Import Junit5 libraries for unit testing:
import calculator.*;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
    void testBasicExpressionParsing() throws IllegalConstruction {
        String infixExpressionString = "((4+5+6)*(7+(5/2/7))*9)";
        String prefixExpressionString = "*(+(4,5,6),+(7,/(5,2,7)),9)";
        String postfixExpressionString = "((4,5,6)+,(7,(5,2,7)/)+,9)*";

        Expression infixExpressionParsing = Parser.parseExpression(infixExpressionString);
        assertEquals(e.toString(Notation.INFIX),infixExpressionParsing.toString());

        Expression prefixExpressionParsing = Parser.parseExpression(prefixExpressionString);
        assertEquals(e.toString(Notation.PREFIX),prefixExpressionParsing.toString());

        Expression postfixExpressionParsing = Parser.parseExpression(postfixExpressionString);
        assertEquals(e.toString(Notation.POSTFIX),postfixExpressionParsing.toString());
    }

    @Test
    void testSensitivityExpressionParsing() throws IllegalConstruction {
        String expressionStringWithSpaceAndTab = "(( 4          + 5 + 6    )     *    (   7       +( 5 / 2 / 7 ) )  * 9  )";

        Expression expressionParsing = Parser.parseExpression(expressionStringWithSpaceAndTab);
        assertEquals( e.toString(Notation.INFIX),expressionParsing.toString(Notation.INFIX));

    }

    @Test
    void testSchemaExpressionParsing() throws IllegalConstruction {
        String shemaExpressionString = "*(+(4 5 6) +(7 /(5 2 7)) 9)";

        Expression expressionParsing = Parser.parseExpression(shemaExpressionString);
        assertEquals(e.toString(Notation.PREFIX),expressionParsing.toString(Notation.PREFIX));
    }

    @Test
    void testExeptionParsing(){
        String expressionParantheseInequal = "*(+(4 5 6) +(7 /(5 2 7))) 9)";
        String expressionNotationChange = "*((4 + 5 + 6) +(7 /(5 2 7)) 9";
        String expressionNotAExpression = "(4 + 5 + 6) efdsvbdrdb";
        String expressionTwoOperatorInARow = "*(+(4 5 6) +(7 //(5 2 7)) 9) + 5";

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionParantheseInequal);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionNotationChange);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionNotAExpression);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionNotationChange);
        });

        assertThrowsExactly(IllegalConstruction.class, ()->{
            Parser.parseExpression(expressionTwoOperatorInARow);
        });
    }

}
