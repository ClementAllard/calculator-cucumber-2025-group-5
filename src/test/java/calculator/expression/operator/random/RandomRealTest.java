package calculator.expression.operator.random;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import calculator.expression.operator.basic.Plus;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

class RandomRealTest {

    Calculator calculator = new Calculator();

    @Test
    void testRandomReal() {
        try {
            final Expression noThrow = new RandomReal(new MyReal(BigDecimal.valueOf(9.9)));
            final Expression wrap1 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow));
            assertDoesNotThrow(()->calculator.eval(noThrow));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap1)));

            final Expression noThrow2 = new RandomReal(new MyComplex(BigDecimal.valueOf(10), BigDecimal.valueOf(0)));
            final Expression wrap2 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow2));
            assertDoesNotThrow(()->calculator.eval(noThrow2));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap2)));

            final Expression noThrow3 = new RandomReal(new MyRational(BigDecimal.valueOf(10), BigDecimal.valueOf(3)));
            final Expression wrap3 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow3));
            assertDoesNotThrow(()->calculator.eval(noThrow3));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap3)));

            assertTrue(Double.parseDouble(calculator.eval(wrap1)) <= 1);
            assertTrue(Double.parseDouble(calculator.eval(wrap1)) >= 0);

            assertTrue(Double.parseDouble(calculator.eval(wrap2)) <= 1);
            assertTrue(Double.parseDouble(calculator.eval(wrap2)) >= 0);

            assertTrue(Double.parseDouble(calculator.eval(wrap3)) <= 1);
            assertTrue(Double.parseDouble(calculator.eval(wrap3)) >= 0);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
