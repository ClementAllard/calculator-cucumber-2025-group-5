package helper;

//Import Junit5 libraries for unit testing:
import calculator.*;
import calculator.expression.number.MyInteger;
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
    void setUp() {
        try{
            List<Expression> params1 = Arrays.asList(new MyInteger(4), new MyInteger(5), new MyInteger(6));
            List<Expression> params2 = Arrays.asList(new MyInteger(5), new MyInteger(2), new MyInteger(7));
            List<Expression> params3 = Arrays.asList(new MyInteger(7), new Divides(params2));
            List<Expression> params4 = Arrays.asList(new Plus(params1), new Plus(params3), new MyInteger(9));

            e = new Times(params4);
        }catch (Exception _){
            fail();
        }
    }

    @Test
    void testBasicExpressionParsing() {
        try{
            String infixExpressionString = "((4+5+6)*(7+(5/2/7))*9)";
            String prefixExpressionString = "*(+(4 5 6),+(7 /(5 2 7)) 9)";
            String prefixExpressionString2 = "* 9 + ( 4 5 6 ) + (7 /(5 2 7))";
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
        }catch (Exception _) {
            fail();
        }
    }

    @Test
    void testSensitivityExpressionParsing() {
        try{
            String expressionStringWithSpaceAndTab = "(( 4          + 5 + 6    )     *   (   7       +( 5 / 2 / 7 ) )  * 9  )";

            Expression expressionParsing = MyExpressionParser.parseExpression(expressionStringWithSpaceAndTab);
            assertEquals(c.eval(e),c.eval(expressionParsing));
        }catch (Exception _){
            fail();
        }
    }

    @Test
    void testSchemaExpressionParsing() {
        try{
            String shemaExpressionString = "*(+(4 5 6) +(7 /(5 2 7)) 9)";

            Expression expressionParsing = MyExpressionParser.parseExpression(shemaExpressionString);
            assertEquals(e.toString(Notation.PREFIX),expressionParsing.toString(Notation.PREFIX));
        }catch (Exception _){
            fail();
        }
    }

    @Test
    void testPriorityOfOperation() {
        try{
            String expressionString = "4 - 5 * 9";
            Expression expression = new Minus(Arrays.asList(new MyInteger(4), new Times(Arrays.asList(new MyInteger(5), new MyInteger(9)))));

            Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals(c.eval(expression),c.eval(expressionParsing));
        }catch (Exception _){
            fail();
        }
    }

    @Test
    void testImplicitMultiplication() {
        try{
            String expressionString = "(4+5+ 6)(7 + 5/2/7)*9";
            Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals(c.eval(e),c.eval(expressionParsing));
        } catch (Exception _){
            fail();
        }
    }


    @Test
    void testExceptionParsing(){
        String expressionParenthesesNotEqual = "*(+(4 5 6) +(+(7 /(5 2 7)) 9)";
        String expressionWithOtherTokenInEnd = "*(+(4 5 6) +(7 /(5 2 7))) 9)"; // 9) is add in end of *(+(4 5 6) +(7 /(5 2 7)))
        String expressionNotationChange = "*((4 + 5 + 6) +(7 /(5 2 7)) 9";
        String expressionNotAExpression = "(4 + 5 + 6) efdsvbdrdb";
        String expressionTwoOperatorInARow = "*(+(4 5 6) +(7 //(5 2 7)) 9) + 5";

        assertThrowsExactly(IllegalSyntax.class, ()-> MyExpressionParser.parseExpression(expressionParenthesesNotEqual));

        assertThrowsExactly(IllegalSyntax.class, ()-> MyExpressionParser.parseExpression(expressionWithOtherTokenInEnd));

        assertThrowsExactly(IllegalSyntax.class, ()-> MyExpressionParser.parseExpression(expressionNotationChange));

        assertThrowsExactly(IllegalSyntax.class, ()-> MyExpressionParser.parseExpression(expressionNotAExpression));

        assertThrowsExactly(IllegalSyntax.class, ()-> MyExpressionParser.parseExpression(expressionTwoOperatorInARow));
    }

    @Test
    void testPositiveNumber() {
        try{
            String expressionString = "+1 - +1";
            Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("0", c.eval(expressionParsing));

            String expressionString2 = "+1";
            Expression expressionParsing2 = MyExpressionParser.parseExpression(expressionString2);
            assertEquals("1", c.eval(expressionParsing2));
        } catch (Exception _){
            fail();
        }
    }

    @Test
    void testNegateNumber() {
        try{
            String expressionString = "-1 - -1";
            Expression expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("0", c.eval(expressionParsing));

            expressionString = "-1/2 - 1/-2";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("0", c.eval(expressionParsing));

            expressionString = "-1";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("-1", c.eval(expressionParsing));

            expressionString = "-1/4 - 1/-2";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("1/4", c.eval(expressionParsing));

            expressionString = "-11/4 - 1/-2";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("-(2 1/4)", c.eval(expressionParsing));

            expressionString = "1/-2";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("-1/2", c.eval(expressionParsing));

            expressionString = "-PI";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("-3.141592653589793", c.eval(expressionParsing));

            expressionString = "-e";
            expressionParsing = MyExpressionParser.parseExpression(expressionString);
            assertEquals("-2.718281828459045", c.eval(expressionParsing));
        } catch (Exception _){
            fail();
        }
    }

    @Test
    void testPi() {
        try{
            String lowerPi = "pi";
            String upperPi = "PI";
            Expression expressionPiLower = MyExpressionParser.parseExpression(lowerPi);
            Expression expressionPiUpper = MyExpressionParser.parseExpression(upperPi);
            assertEquals(c.eval(expressionPiLower), c.eval(expressionPiUpper));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionRad() {
        try{
            String piRad = "rad(180)";
            String pi = "PI";
            Expression piRadExpr = MyExpressionParser.parseExpression(piRad);
            Expression piExpr = MyExpressionParser.parseExpression(pi);
            assertEquals(c.eval(piRadExpr), c.eval(piExpr));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionDegree() {
        try{
            String expression = "degree(rad(180))";
            String halfTurn = "180";
            Expression piRadExpr = MyExpressionParser.parseExpression(expression);
            Expression piExpr = MyExpressionParser.parseExpression(halfTurn);
            assertEquals(c.eval(piRadExpr), c.eval(piExpr));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionInverse(){
        try {
            // positive rational
            Expression inverse = MyExpressionParser.parseExpression("inv(3/4)");
            Expression response = MyExpressionParser.parseExpression("4/3");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative rational
            inverse = MyExpressionParser.parseExpression("inv(-3/4)");
            response = MyExpressionParser.parseExpression("-4/3");
            assertEquals(c.eval(inverse), c.eval(response));

            // positive integer
            // Forces real value comparison
            inverse = MyExpressionParser.parseExpression("0.0 + inv(2)");
            response = MyExpressionParser.parseExpression("0.0 + 1/2");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative integer
            // Forces real value comparison
            inverse = MyExpressionParser.parseExpression("0.0 + inv(-2)");
            response = MyExpressionParser.parseExpression("0.0 + -1/2");
            assertEquals(c.eval(inverse), c.eval(response));

            // positive real
            inverse = MyExpressionParser.parseExpression("inv(0.5)");
            response = MyExpressionParser.parseExpression("2.0");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative real
            inverse = MyExpressionParser.parseExpression("inv(-0.5)");
            response = MyExpressionParser.parseExpression("-2.0");
            assertEquals(c.eval(inverse), c.eval(response));

            // complex
            inverse = MyExpressionParser.parseExpression("inv(4-3i)");
            response = MyExpressionParser.parseExpression("4/25 - 0+3i / 25");
            assertEquals(c.eval(inverse), c.eval(response));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionLog(){
        try {
            // positive rational
            Expression inverse = MyExpressionParser.parseExpression("log(10/1)");
            Expression response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(inverse), c.eval(response));

            // O excluded
            final Expression inverse1 = MyExpressionParser.parseExpression("log(0)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse1));

            // negative rational
            // domain error here!
            final Expression inverse2 = MyExpressionParser.parseExpression("log(-3/4)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse2));

            // positive integer
            // Forces real value comparison
            inverse = MyExpressionParser.parseExpression("log(100/1)");
            response = MyExpressionParser.parseExpression("2/1");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative integer
            final Expression inverse3 = MyExpressionParser.parseExpression("log(-2)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse3));

            // positive real
            inverse = MyExpressionParser.parseExpression("log(100.0)");
            response = MyExpressionParser.parseExpression("2.0");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative real
            // error here.
            final Expression inverse4 = MyExpressionParser.parseExpression("log(-0.5)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse4));

            // complex
            //error here.
            final Expression inverse5 = MyExpressionParser.parseExpression("log(4-3i)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse5));

        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testENumber(){
        try{
            String lowerE = "e";
            String upperE = "E";
            Expression expressionELower = MyExpressionParser.parseExpression(lowerE);
            Expression expressionEUpper = MyExpressionParser.parseExpression(upperE);
            assertEquals(c.eval(expressionELower), c.eval(expressionEUpper));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionLn(){
        try {
            // positive rational
            Expression inverse = MyExpressionParser.parseExpression("ln(1)");
            Expression response = MyExpressionParser.parseExpression("0");
            assertEquals(c.eval(inverse), c.eval(response));

            // O excluded
            final Expression inverse1 = MyExpressionParser.parseExpression("ln(0)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse1));

            // negative rational
            // domain error here!
            final Expression inverse2 = MyExpressionParser.parseExpression("ln(-3/4)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse2));

            // positive integer
            // Forces real value comparison
            inverse = MyExpressionParser.parseExpression("ln(1/1)");
            response = MyExpressionParser.parseExpression("0/1");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative integer
            final Expression inverse3 = MyExpressionParser.parseExpression("ln(-2)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse3));

            // positive real
            inverse = MyExpressionParser.parseExpression("ln(e)");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(inverse), c.eval(response));

            // negative real
            // error here.
            final Expression inverse4 = MyExpressionParser.parseExpression("ln(-0.5)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse4));

            // complex
            //error here.
            final Expression inverse5 = MyExpressionParser.parseExpression("ln(4-3i)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(inverse5));

        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testFunctionLogBinary(){
        try {
            Expression expression = MyExpressionParser.parseExpression("log(10,100)");
            final Expression result = MyExpressionParser.parseExpression("2");
            assertEquals(c.eval(result), c.eval(expression));
            expression = MyExpressionParser.parseExpression("log(2.0,4.0)");
            assertEquals(c.eval(result), c.eval(expression));
            expression = MyExpressionParser.parseExpression("log(2.0,4.0)");
            assertEquals(c.eval(result), c.eval(expression));
            expression = MyExpressionParser.parseExpression("log(2.0, 4.0)");
            assertEquals(c.eval(result), c.eval(expression));

            final Expression errorExpression1 = MyExpressionParser.parseExpression("log(-2,-4)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression1));
            final Expression errorExpression2 = MyExpressionParser.parseExpression("log(1,4.0)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression2));
            final Expression errorExpression3 = MyExpressionParser.parseExpression("log(1+1i,4)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression3));
            final Expression errorExpression4 = MyExpressionParser.parseExpression("log(0,4.0)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression4));
            final Expression errorExpression5 = MyExpressionParser.parseExpression("log(2,0)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression5));
            final Expression errorExpression6 = MyExpressionParser.parseExpression("log(2+1i,4)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression6));
            final Expression errorExpression7 = MyExpressionParser.parseExpression("log(2,4+1i)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(errorExpression7));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testSpacesInBinaryFunctions(){
        // this test comes from examples like log(1, 2) recognised as log(1*2).
        try{
            Expression expression = MyExpressionParser.parseExpression("log(   10  ,    100   )");
            final Expression result = MyExpressionParser.parseExpression("2");
            assertEquals(c.eval(result), c.eval(expression));
        } catch (Exception _) {
          fail();
        }
    }

    @Test
    void testPowFunction(){
        try {
            // positive rational
            Expression expression = MyExpressionParser.parseExpression("pow(2, 3)");
            Expression response = MyExpressionParser.parseExpression("8");
            assertEquals(c.eval(expression), c.eval(response));

            // x^O = 1
            expression = MyExpressionParser.parseExpression("pow(255, 0)");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            // negative rational (force real checking)
            expression = MyExpressionParser.parseExpression("0.0 + pow(-1/2, 2)");
            response = MyExpressionParser.parseExpression("0.0 + 1/4");
            assertEquals(c.eval(expression), c.eval(response));

            // complex
            //error here.
            final Expression error1 = MyExpressionParser.parseExpression("pow(4-3i, 2)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(error1));

            final Expression error2 = MyExpressionParser.parseExpression("pow(1, 423-612i)");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(error2));
        } catch (Exception _) {
            fail();
        }
    }

    @Test
    void testExponent(){
        try {
            // positive rational
            Expression expression = MyExpressionParser.parseExpression("2^ 3");
            Expression response = MyExpressionParser.parseExpression("8");
            assertEquals(c.eval(expression), c.eval(response));

            // x^O = 1
            expression = MyExpressionParser.parseExpression("(255^ 0)");
            response = MyExpressionParser.parseExpression("1");
            assertEquals(c.eval(expression), c.eval(response));

            // negative rational (force real checking)
            expression = MyExpressionParser.parseExpression("0.0 + -1/2 ^2");
            response = MyExpressionParser.parseExpression("0.0 + 1/4");
            assertEquals(c.eval(expression), c.eval(response));

            // complex
            //error here.
            final Expression error1 = MyExpressionParser.parseExpression("4-3i^ 2");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(error1));

            final Expression error2 = MyExpressionParser.parseExpression("1^ 423-612i");
            assertThrowsExactly(IllegalArgumentException.class, ()-> c.eval(error2));

            // long expressions
            expression = MyExpressionParser.parseExpression("(1+2-3+8/4)^(30/20*2)");
            response = MyExpressionParser.parseExpression("8");
            assertEquals(c.eval(expression), c.eval(response));
        } catch (Exception _) {
            fail();
        }
    }
}