package calculator.expression.operator.function.invTrigono;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionAsin;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionAsinTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionAsin() {
        try {
            Expression expression = new FunctionAsin(new MyReal(BigDecimal.valueOf(0)));
            assertEquals("0", calculator.eval(expression));

            expression = new FunctionAsin(new MyReal(BigDecimal.valueOf(1)));
            assertEquals("1.5707963268", calculator.eval(expression));

            expression = new FunctionAsin(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            // note that expected should be -1.5285709194809995i but + is also true.
            // In this project function returns only one value.
            assertEquals("0.4270785863924768 + 1.5285709194809995i", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
