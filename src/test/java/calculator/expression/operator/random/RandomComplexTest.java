package calculator.expression.operator.random;

import calculator.Calculator;
import calculator.expression.Expression;
import calculator.expression.number.MyComplex;
import calculator.expression.number.MyInteger;
import calculator.expression.number.MyRational;
import calculator.expression.number.MyReal;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RandomComplexTest {

    Calculator calculator = new Calculator();
    MyInteger myInteger = new MyInteger(12);
    MyRational myRational = new MyRational(76,13);
    MyReal myReal = new MyReal(BigDecimal.valueOf(123.08));
    MyComplex myComplex = new MyComplex(BigDecimal.valueOf(129),BigDecimal.valueOf(129));

    @Test
    void testRandomComplex() {
        try {
            Expression expression = new RandomComplex(myInteger);
            assertEquals("0.7298928061101974 + 0.2750691655200749i", calculator.eval(expression));

            expression = new RandomComplex(myRational);
            assertEquals("0.730519863614471 + 0.08825840967622589i", calculator.eval(expression));

            expression = new RandomComplex(myReal);
            assertEquals("0.7231742029971469 + 0.9908988967772393i", calculator.eval(expression));

            expression = new RandomComplex(myComplex);
            assertEquals("0.7423446128420437 + 0.7083981017371028i", calculator.eval(expression));

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
