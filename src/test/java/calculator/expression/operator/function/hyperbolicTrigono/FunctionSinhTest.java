package calculator.expression.operator.function.hyperbolicTrigono;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import calculator.expression.operator.function.FunctionSinh;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionSinhTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionSinh() {
        try {
            assertEquals("0", calculator.eval(new FunctionSinh(new MyReal(BigDecimal.ZERO))));
            assertEquals("3.6268604078", calculator.eval(new FunctionSinh(new MyReal(BigDecimal.valueOf(2)))));

            Expression expr = new FunctionSinh(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            assertEquals("-0.4890562590412937 + 1.4031192506220407i", calculator.eval(expr));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}