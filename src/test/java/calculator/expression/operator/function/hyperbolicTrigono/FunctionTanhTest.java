package calculator.expression.operator.function.hyperbolicTrigono;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionTanh;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionTanhTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionTanh() {
        try {
            assertEquals("0", calculator.eval(new FunctionTanh(new MyReal(BigDecimal.ZERO))));
            assertEquals("0.9640275801", calculator.eval(new FunctionTanh(new MyReal(BigDecimal.valueOf(2)))));

            Expression expr = new FunctionTanh(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            assertEquals("1.1667362572 - 0.2434582012i", calculator.eval(expr));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}