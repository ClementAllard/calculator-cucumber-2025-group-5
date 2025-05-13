package calculator.expression.operator.function.random;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RandomIntegerTest {

    Calculator calculator = new Calculator();

    @Test
    void testRandomInteger() {
        try {
            final Expression noThrow = new RandomInteger(new MyReal(BigDecimal.valueOf(1.1)));
            assertDoesNotThrow(()->calculator.eval(noThrow));
            assertDoesNotThrow(()->Integer.parseInt(calculator.eval(noThrow)));

            final Expression noThrow2 = new RandomInteger(new MyComplex(BigDecimal.valueOf(10), BigDecimal.valueOf(0)));
            assertDoesNotThrow(()->calculator.eval(noThrow2));
            assertDoesNotThrow(()->Integer.parseInt(calculator.eval(noThrow2)));

            assertTrue(Integer.parseInt(calculator.eval(noThrow2)) <= 10);
            assertTrue(Integer.parseInt(calculator.eval(noThrow2)) >= 0);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void testRandomIntegerErrorCases() {
        try {
            final Expression error = new RandomInteger(new MyInteger(-10));
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error));

            final Expression error2 = new RandomInteger(new MyComplex(BigDecimal.valueOf(-10), BigDecimal.valueOf(0)));
            assertThrowsExactly(IllegalArgumentException.class, ()->calculator.eval(error2));

            final Expression noError = new RandomInteger(new MyComplex(BigDecimal.valueOf(10), BigDecimal.valueOf(-10)));
            assertDoesNotThrow(()->calculator.eval(noError));

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
