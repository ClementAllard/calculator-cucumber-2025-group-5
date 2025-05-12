package calculator.expression.operator.function;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionCoshTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionCosh() {
        try {
            assertEquals("1", calculator.eval(new FunctionCosh(new MyReal(BigDecimal.ZERO))));
            assertEquals("3.7621956911", calculator.eval(new FunctionCosh(new MyReal(BigDecimal.valueOf(2)))));

            Expression expr = new FunctionCosh(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            assertEquals("-0.6421481247155201 + 1.0686074213827783i", calculator.eval(expr));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}