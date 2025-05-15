package helper;

import calculator.Calculator;
import calculator.expression.Expression;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class TestFixGrammarParser {

    Calculator c = new Calculator();

    @Test
     void testFixPriorityOp() {
        try {
            Expression expression = MyExpressionParser.parseExpression("2*2^3");
            final Expression result = MyExpressionParser.parseExpression("16");
            assertEquals(c.eval(result), c.eval(expression));
        } catch (IllegalSyntax | ExecutionControl.NotImplementedException e) {
            fail();
        }
    }
}
