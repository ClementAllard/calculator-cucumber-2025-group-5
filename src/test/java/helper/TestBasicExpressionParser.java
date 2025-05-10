package helper;

import calculator.Calculator;
import calculator.expression.Expression;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestBasicExpressionParser {

    Calculator c = new Calculator();

    @Test
    void testInfixExpressionParser() {
        try {
            String expressionToParse = "(((1 + 2)/(2 * 3))(2*2+3))/0.5";
            Expression parsedExpression = MyExpressionParser.parseExpression(expressionToParse);
            assertEquals("7",c.eval(parsedExpression));
        } catch (IllegalSyntax | ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void testPrefixExpressionParser() {
        try {
            String expressionToParse = "/(*(/(+(1 2)*(2 3))+(*(2 2) 3))0.5)";
            Expression parsedExpression = MyExpressionParser.parseExpression(expressionToParse);
            assertEquals("7",c.eval(parsedExpression));
        } catch (IllegalSyntax | ExecutionControl.NotImplementedException e) {
            fail();
        }
    }

    @Test
    void testPostfixExpressionParser() {
        try {
            String expressionToParse = "((((1 2)+(2 3)*)/ ((2 2)* 3)+)*0.5)/";
            Expression parsedExpression = MyExpressionParser.parseExpression(expressionToParse);
            assertEquals("7",c.eval(parsedExpression));
        } catch (IllegalSyntax | ExecutionControl.NotImplementedException e) {
            fail();
        }
    }
}
