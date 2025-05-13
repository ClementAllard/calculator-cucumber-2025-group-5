package calculator.expression.operator.function.random;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import calculator.expression.operator.basic.Plus;
import calculator.expression.operator.random.RandomRational;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RandomRationalTest {

    Calculator calculator = new Calculator();

    @Test
    void testRandomRational() {
        try {
            final Expression noThrow = new RandomRational(new MyReal(BigDecimal.valueOf(9.9)));
            final Expression wrap1 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow));
            assertDoesNotThrow(()->calculator.eval(noThrow));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap1)));

            final Expression noThrow2 = new RandomRational(new MyComplex(BigDecimal.valueOf(10), BigDecimal.valueOf(0)));
            final Expression wrap2 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow2));
            assertDoesNotThrow(()->calculator.eval(noThrow2));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap2)));

            final Expression noThrow3 = new RandomRational(new MyRational(BigDecimal.valueOf(10), BigDecimal.valueOf(3)));
            final Expression wrap3 = new Plus(Arrays.asList(new MyReal(BigDecimal.ZERO), noThrow3));
            assertDoesNotThrow(()->calculator.eval(noThrow3));
            assertDoesNotThrow(()->Double.parseDouble(calculator.eval(wrap3)));

            assertTrue(Double.parseDouble(calculator.eval(wrap1)) <= 10);
            assertTrue(Double.parseDouble(calculator.eval(wrap1)) >= 0);

            assertTrue(Double.parseDouble(calculator.eval(wrap2)) <= 10);
            assertTrue(Double.parseDouble(calculator.eval(wrap2)) >= 0);

            assertTrue(Double.parseDouble(calculator.eval(wrap3)) <= 10);
            assertTrue(Double.parseDouble(calculator.eval(wrap3)) >= 0);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomRationalErrorCases() {
        try {
            final Expression error = new RandomRational(new MyInteger(-10));
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error));

            final Expression error2 = new RandomRational(new MyComplex(BigDecimal.valueOf(-10), BigDecimal.valueOf(0)));
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error2));

            final Expression noError = new RandomRational(new MyComplex(BigDecimal.valueOf(10), BigDecimal.valueOf(-10)));
            assertDoesNotThrow(()->calculator.eval(noError));

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
