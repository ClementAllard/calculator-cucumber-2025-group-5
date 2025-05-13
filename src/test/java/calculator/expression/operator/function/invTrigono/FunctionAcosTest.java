package calculator.expression.operator.function.invTrigono;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionAcos;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionAcosTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionAcos() {
        try {
            Expression expression = new FunctionAcos(new MyReal(BigDecimal.valueOf(1)));
            assertEquals("0", calculator.eval(expression));

            expression = new FunctionAcos(new MyReal(BigDecimal.valueOf(0)));
            assertEquals("1.5707963268", calculator.eval(expression));

            expression = new FunctionAcos(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            assertEquals("1.1437177404024204 - 1.528570919480998i", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
