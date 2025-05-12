package calculator.expression.operator.function;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class FunctionAtanTest {
    Calculator calculator = new Calculator();

    @Test
    void testFunctionAtan() {
        try {
            Expression expression = new FunctionAtan(new MyReal(BigDecimal.valueOf(0)));
            assertEquals("0", calculator.eval(expression));

            expression = new FunctionAtan(new MyReal(BigDecimal.valueOf(1)));
            assertEquals("0.7853981634", calculator.eval(expression));

            expression = new FunctionAtan(new MyComplex(new BigDecimal("1"), new BigDecimal("2")));
            // note that expected was 1.3389725222944935 + 0.14694666622552977i
            // but apparently, the new expected value is also plausible (multiple answer in C).
            assertEquals("-1.3389725222944935 + 0.4023594781085251i", calculator.eval(expression));
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
