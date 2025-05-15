package calculator.expression.number;

import calculator.Calculator;
import calculator.expression.Expression;
import helper.IllegalSyntax;
import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestConstant {

    @Test
    void testNoInfiniteLoop() {
        String constantValue = "$bug$";
        String constantKey = "bug";
        Constant.writeConstant(constantKey, constantValue);

        assertThrowsExactly(IllegalArgumentException.class, () ->
                Constant.parseExpression(Constant.readConstant(constantKey)));
    }

    @Test
    void testConstant() throws IllegalSyntax, ExecutionControl.NotImplementedException {
        String constantValue = "log(2, 2^12) - 12";
        String constantKey = "test";
        Constant.writeConstant(constantKey, constantValue);

        assertEquals(constantValue, Constant.readConstant(constantKey));

        Calculator calculator = new Calculator();
        Expression expression = Constant.parseExpression(Constant.readConstant(constantKey));

        assertEquals("0", calculator.eval(expression));
    }
}